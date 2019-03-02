package com.qfedu.dao;

import com.qfedu.pojo.Home;
import com.qfedu.vo.VHome;
import com.qfedu.vo.VHouse;

import java.util.List;
import java.util.Map;

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
    List<VHouse> selecthightHome();
    //查看index所有热门地区房源
    List<VHouse> selectRegionHome();
    //根据区域查询
    List<VHome> selectByRegionid(Integer regionId);
    //根据出租方式查询
    List<VHome> selectByWayId(Integer wayid);
    //根据房型查询
    List<VHome> selectByStyleId(Integer styleId);
    //根据价格查询
    List<VHome> selectByPrice(Integer price);
    //多条件查询
    List<VHome> selectCondition(Map<String,Object> map);
}