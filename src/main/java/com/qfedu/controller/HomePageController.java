package com.qfedu.controller;

import com.qfedu.pojo.Home;
import com.qfedu.service.HomeService;
import com.qfedu.vo.JsonBean;
import com.qfedu.vo.JsonUtils;
import com.qfedu.vo.PageBeanVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author: fengyuan
 * @Description: 该类的功能描述
 * @date: 2019/2/28 11:19
 */
@Controller
public class HomePageController {

    @Autowired
    private HomeService hss;

    //所有租房的分页接口
    @RequestMapping("/selectAllHouse.do")
    @ResponseBody
    public JsonBean selectAllHouse(int page) {
        JsonBean bean = null;

        try {
            Map<String, Object> map = hss.selectAllHouse(page);
            bean = JsonUtils.createJsonBean(1, map);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0, e.getMessage());
        }

        return bean;
    }

    //所有热门房源的分页接口
    @RequestMapping("/selectHightHouse.do")
    @ResponseBody
    public JsonBean selectHightHouse(int page) {
        JsonBean bean = null;

        try {
            Map<String, Object> map = hss.selectHightHouse(page);
            bean = JsonUtils.createJsonBean(1, map);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0, e.getMessage());
        }

        return bean;
    }

    //所有地区租房的分页接口
    @RequestMapping("/selectRegionHouse.do")
    @ResponseBody
    public JsonBean selectRegionHouse(int page) {
        JsonBean bean = null;

        try {
            Map<String, Object> map = hss.selectRegionHouse(page);
            bean = JsonUtils.createJsonBean(1, map);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0, e.getMessage());
        }

        return bean;
    }

    @RequestMapping("/selectCondition.do")
    @ResponseBody
    public PageBeanVo selectCondition(String homeprice, String homearea, Integer sequence, Integer newinfo, Home home, Integer currentPag, Integer pageNumber) {
        return hss.selectCondition(homeprice, homearea, sequence, newinfo, home, currentPag, pageNumber);
    }
}