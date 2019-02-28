package com.qfedu.dao;

import com.qfedu.pojo.Hothome;

public interface HothomeMapper {
    int deleteByPrimaryKey(Integer hotid);

    int insert(Hothome record);

    int insertSelective(Hothome record);

    Hothome selectByPrimaryKey(Integer hotid);

    int updateByPrimaryKeySelective(Hothome record);

    int updateByPrimaryKey(Hothome record);
}