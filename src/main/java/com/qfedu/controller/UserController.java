package com.qfedu.controller;

import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.qfedu.vo.JsonBean;
import com.qfedu.vo.JsonUtils;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService us;
    @RequestMapping("/login.do")
    @ResponseBody
    public JsonBean login(String username, String password){
        return us.login(username, password);
    }
    @RequestMapping("/inseruser.do")
    @ResponseBody
    public ResultVo inserUser(User user){
        return us.insertUser(user);
    }
}
