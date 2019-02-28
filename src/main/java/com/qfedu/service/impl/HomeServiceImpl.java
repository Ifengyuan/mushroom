package com.qfedu.service.impl;

import com.qfedu.dao.HomeMapper;
import com.qfedu.service.HomeService;
import com.qfedu.vo.ResultVo;
import com.qfedu.vo.VHome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
            List<VHome> list = hm.selecthightHome();
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
            List<VHome> list = hm.selectRegionHome();
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

}
