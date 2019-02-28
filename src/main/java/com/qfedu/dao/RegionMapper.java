package com.qfedu.dao;

import com.qfedu.pojo.Region;

public interface RegionMapper {
    int deleteByPrimaryKey(Integer regionid);

    int insert(Region record);

    int insertSelective(Region record);

    Region selectByPrimaryKey(Integer regionid);

    int updateByPrimaryKeySelective(Region record);

    int updateByPrimaryKey(Region record);
}