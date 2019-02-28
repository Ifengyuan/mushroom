package com.qfedu.dao;

import com.qfedu.pojo.Home;
import com.qfedu.vo.VHome;

import java.util.List;

public interface HomeMapper {
    int deleteByPrimaryKey(Integer homeid);

    int insert(Home record);

    int insertSelective(Home record);

    Home selectByPrimaryKey(Integer homeid);

    int updateByPrimaryKeySelective(Home record);

    int updateByPrimaryKey(Home record);
    //查看INDEX所有租房
    List<VHome> selectAllHome();
    //查看index所有优质房源
    List<VHome> selecthightHome();
    //查看index所有热门地区房源
    List<VHome> selectRegionHome();
    //根据区域查询
    List<VHome> selectByRegionid(Integer regionId);
    //根据出租方式查询
    List<VHome> selectByWayId(Integer wayid);
    //根据房型查询
    List<VHome> selectByStyleId(Integer styleId);

}