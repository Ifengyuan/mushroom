package com.qfedu.controller;

import com.qfedu.service.HomeService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @Autowired
    private HomeService hs;

    //查看所有租房
    @RequestMapping("/selectAllHome.do")
    @ResponseBody
    public ResultVo selectAllHome(){
        return hs.selectAllHome();
    }
    //查看主页优秀租房
    @RequestMapping("/selectHightHome.do")
    @ResponseBody
    public ResultVo selectHightHome(){
        return hs.selectHightHome();
    }
    //查看主页热门租房
    @RequestMapping("/selectRegionHome.do")
    @ResponseBody
    public ResultVo selectRegionHome(){
        return hs.selectRegionHome();
    }

    //根据区域查询
    @RequestMapping("/selectByRegionId.do")
    @ResponseBody
    public ResultVo selectByRegionId(Integer regionId){
        return hs.selectByRegionId(regionId);
    }

    //根据出租方式查询
    @RequestMapping("/selectWayId.do")
    @ResponseBody
    public ResultVo selectWayId(Integer wayid){
        return hs.selectByWayId(wayid);
    }
    //根据出租方式查询
    @RequestMapping("/selectStyleId.do")
    @ResponseBody
    public ResultVo selectStyleId(Integer styleId){
        return hs.selectByStyleId(styleId);
    }
}
