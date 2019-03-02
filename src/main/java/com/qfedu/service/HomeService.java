package com.qfedu.service;

import com.qfedu.pojo.Home;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;

import java.util.Map;

public interface HomeService {
    //所有主页租房
    ResultVo selectAllHome();
    //主页所有优质品牌
    ResultVo selectHightHome();
    //主页所有热门地区
    ResultVo selectRegionHome();
    //根据地区查询
    ResultVo selectByRegionId(Integer regionId);
    //根据出租方式
    ResultVo selectByWayId(Integer wayid);
    //根据房型查询
    ResultVo selectByStyleId(Integer styleId);

    Map<String, Object> selectAllHouse(int page);

    Map<String, Object> selectHightHouse(int page);

    Map<String, Object> selectRegionHouse(int page);

    PageBeanVo selectCondition(String homeprice,String homearea,Integer  sequence,  Integer newinfo,Home home,Integer currentPag, Integer pageNumber);


}
