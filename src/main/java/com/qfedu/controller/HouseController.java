package com.qfedu.controller;

import com.qfedu.service.HouseService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: fengyuan
 * @Description: 该类的功能描述
 * @date: 2019/3/1 15:32
 */
@Controller
public class HouseController {
    @Autowired
    private HouseService houseService;
    @RequestMapping("/selectAllHouseId.do")
    @ResponseBody
    private ResultVo selectAllByHouseId(Integer homeid){
        return houseService.selectAllByHouseId(homeid);
    }

    @RequestMapping("/selectPutong.do")
    @ResponseBody
    private ResultVo selectPutong(){
        return houseService.selectAllPutong();
    }
}
