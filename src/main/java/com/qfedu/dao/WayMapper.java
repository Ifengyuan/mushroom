package com.qfedu.dao;

import com.qfedu.pojo.Way;

public interface WayMapper {
    int deleteByPrimaryKey(Integer wayid);

    int insert(Way record);

    int insertSelective(Way record);

    Way selectByPrimaryKey(Integer wayid);

    int updateByPrimaryKeySelective(Way record);

    int updateByPrimaryKey(Way record);
}