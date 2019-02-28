package com.qfedu.service;

import com.qfedu.vo.ResultVo;

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
}
