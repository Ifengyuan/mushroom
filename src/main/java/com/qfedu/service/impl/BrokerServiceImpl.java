package com.qfedu.service.impl;

import com.qfedu.dao.BrokerMapper;
import com.qfedu.pojo.Broker;
import com.qfedu.service.BrokerService;
import com.qfedu.vo.ResultVo;
import com.qfedu.vo.VBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: fengyuan
 * @Description: 该类的功能描述
 * @date: 2019/2/27 10:29
 */
@Service
public class BrokerServiceImpl implements BrokerService {
    private ResultVo rv;
    @Autowired
    private BrokerMapper bm;
    @Override
    public ResultVo insertBroker(Broker broker) {
        try {
            bm.insert(broker);
            rv = ResultVo.setOK(broker);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo.setERROR();
        }
        return rv;
    }

    @Override
    public List<VBroker> selectAllBroker() {
        List<VBroker> list = null;
        try {
            list =  bm.selectAllBroker();
            rv = ResultVo.setOK(list);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo.setERROR();
        }
        return list;
    }

}
