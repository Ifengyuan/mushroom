package com.qfedu.dao;

import com.qfedu.pojo.Broker;

public interface BrokerMapper {
    int deleteByPrimaryKey(Integer brokerid);

    int insert(Broker record);

    int insertSelective(Broker record);

    Broker selectByPrimaryKey(Integer brokerid);

    int updateByPrimaryKeySelective(Broker record);

    int updateByPrimaryKey(Broker record);
}