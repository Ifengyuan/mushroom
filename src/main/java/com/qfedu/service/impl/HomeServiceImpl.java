package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.HomeMapper;
import com.qfedu.pojo.Home;
import com.qfedu.service.HomeService;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import com.qfedu.vo.VHome;
import com.qfedu.vo.VHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HomeServiceImpl implements HomeService {
    private ResultVo rv;
    @Autowired
    private HomeMapper hm;
    @Override
    public ResultVo selectAllHome() {

        try {
            List<VHome> list = hm.selectAllHome();
            rv = ResultVo.setOK(list);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo.setERROR();
        }
        return rv;
    }

    @Override
    public ResultVo selectHightHome() {

        try {
            List<VHouse> list = hm.selecthightHome();
            rv = ResultVo.setOK(list);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo.setERROR();
        }
        return rv;
    }

    @Override
    public ResultVo selectRegionHome() {
        try {
            List<VHouse> list = hm.selectRegionHome();
            rv = ResultVo.setOK(list);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo.setERROR();
        }
        return rv;
    }

    @Override
    public ResultVo selectByRegionId(Integer regionId) {
        try {
            List<VHome> list = hm.selectByRegionid(regionId);
            rv = ResultVo.setOK(list);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo.setERROR();

        }
        return rv;
    }

    @Override
    public ResultVo selectByWayId(Integer wayid) {
        try {
            List<VHome> list = hm.selectByWayId(wayid);
            rv = ResultVo.setOK(list);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo.setERROR();
        }
        return rv;
    }

    @Override
    public ResultVo selectByStyleId(Integer styleId) {
        try {
            List<VHome> list = hm.selectByStyleId(styleId);
            rv = ResultVo.setOK(list);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo.setERROR();
        }
        return  rv;
    }

    @Override
    public Map<String, Object> selectAllHouse(int page) {
        PageHelper.startPage(page, 5);
        // list中是分页后的数据
        List<VHome> list = hm.selectAllHome();

        Map<String, Object> map = new HashMap<>();
        map.put("total", ((Page)list).getTotal());// 总记录个数
        map.put("rows", list);// 分页的数据

        return map;
    }

    @Override
    public Map<String, Object> selectHightHouse(int page) {
        PageHelper.startPage(page, 5);
        // list中是分页后的数据
        List<VHouse> list = hm.selecthightHome();

        Map<String, Object> map = new HashMap<>();
        map.put("total", ((Page)list).getTotal());// 总记录个数
        map.put("rows", list);// 分页的数据

        return map;
    }

    @Override
    public Map<String, Object> selectRegionHouse(int page) {
        PageHelper.startPage(page, 5);
        // list中是分页后的数据
        List<VHouse> list = hm.selectRegionHome();

        Map<String, Object> map = new HashMap<>();
        map.put("total", ((Page)list).getTotal());// 总记录个数
        map.put("rows", list);// 分页的数据

        return map;
    }

    @Override
    public PageBeanVo selectCondition(String homeprice, String homearea,Integer  sequence,  Integer newinfo, Home home, Integer currentPag, Integer pageNumber) {
        String[] splitRentalprice =null;
        String[] splitArea = null;
        Page<Object> pageinfo=null;
        if (homearea!=null && !"".equals(homearea)){
            splitArea = homearea.split("-");
        }
        Map<String ,Object> map = new HashMap<>();
        if (home.getHomehot()!=null){
            map.put("apartmenttype",home.getHomehot());
        }
        if (homeprice!=null &&!"".equals(homeprice)){
            splitRentalprice = homeprice.split("-");
        }
        for (int i = 0; i < 2; i++) {
            //doubleArea = Double.valueOf(splitArea[i]);
            if (homearea!=null&& !"".equals(homearea)){


                if (i>0 && splitArea.length==2){
                    if (Integer.valueOf(splitArea[i-1]) < Integer.valueOf(splitArea[i])) {
                        map.put("maxArea", Integer.valueOf(splitArea[i]));
                        map.put("minArea", Integer.valueOf(splitArea[i - 1]));
                    }
                }else if (splitArea.length==1){
                    map.put("maxArea", Integer.valueOf(splitArea[i]));
                }

            }
            if (homeprice!=null &&!"".equals(homeprice)){
                //floatRentalprice = Float.valueOf(splitRentalprice[i]);
                if (i > 0 && splitRentalprice.length==2 ){
                    if (Integer.valueOf(splitRentalprice[i-1])<Integer.valueOf(splitRentalprice[i])){
                        map.put("maxHomeprice",Integer.valueOf(splitRentalprice[i]));
                        map.put("minHomeprice",Integer.valueOf(splitRentalprice[i-1]));
                    }
                } else if (splitRentalprice.length==1){
                    map.put("minHomeprice",Integer.valueOf(splitRentalprice[i]));
                }

            }
            // 1 代表升序 2 代表降序
            if (newinfo != null) {
                if (newinfo == 1) {
                    map.put("newinfo", 1);
                } else if (newinfo == 2) {
                    map.put("newinfo", 2);
                } else {
                    map.put("newinfo", 0);
                }
            }

            if (sequence != null) {
                if (sequence == 1) {
                    map.put("sequence", 1);
                } else if (sequence == 2) {
                    map.put("sequence", 2);
                } else {
                    map.put("sequence", 0);
                }
            }

            if (home.getRegionid()!=null){
                map.put("regionid",home.getRegionid());
            }
            if (home.getHomeway()!=null){
                map.put("homeway",home.getHomeway());
            }
            if (home.getHomestype()!=null){
                map.put("homestype",home.getHomestype());
            }

        }

        pageinfo = PageHelper.startPage(pageNumber, currentPag);
        List<VHome> list = hm.selectCondition(map);
        return PageBeanVo.setPage((int)pageinfo.getTotal(),list);
    }

}
