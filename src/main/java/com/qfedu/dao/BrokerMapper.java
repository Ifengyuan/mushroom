package com.qfedu.dao;

import com.qfedu.pojo.Broker;
import com.qfedu.vo.VBroker;

import java.util.List;

public interface BrokerMapper {
    int deleteByPrimaryKey(Integer brokerid);

    void insert(Broker record);

    int insertSelective(Broker record);

    Broker selectByPrimaryKey(Integer brokerid);

    int updateByPrimaryKeySelective(Broker record);

    int updateByPrimaryKey(Broker record);

    List<VBroker> selectAllBroker();
}