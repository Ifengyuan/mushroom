package com.qfedu.service;

import com.qfedu.pojo.Broker;
import com.qfedu.vo.ResultVo;
import com.qfedu.vo.VBroker;


import java.util.List;

/**
 * @author: fengyuan
 * @Description: 该类的功能描述
 * @date: ${date} ${time}
 */
public interface BrokerService {
    ResultVo insertBroker(Broker broker);

    List<VBroker> selectAllBroker();
}
