package com.qfedu.controller;

import com.qfedu.pojo.Broker;
import com.qfedu.service.BrokerService;
import com.qfedu.vo.ResultVo;
import com.qfedu.vo.VBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: fengyuan
 * @Description: 该类的功能描述
 * @date: 2019/3/1 9:55
 */
@Controller
public class BrokerController {
    @Autowired
    private BrokerService bs;

    //成为经纪人
    @RequestMapping("/insertbroker.do")
    @ResponseBody
    public ResultVo insertBroker(Broker broker) {
        return bs.insertBroker(broker);
    }

    @RequestMapping("/selectBroker.do")
    @ResponseBody
    public List<VBroker> selectAllBroker() {
        return bs.selectAllBroker();
    }
}