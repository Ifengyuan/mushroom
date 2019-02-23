package com.qfedu.service.impl;

import com.qfedu.dao.UserMapper;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.qfedu.vo.JsonBean;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private JsonBean bean;
    private ResultVo rv;
    @Autowired
    private UserMapper um;
    @Override
    public JsonBean login(String username, String password) {
        if (username == null || username.equals("")){
            throw new RuntimeException("用户名为空");
        }
        if (password == null ||password.equals("")) {
            throw new RuntimeException("密码为空");

        }
        User user = um.selectByName(username);
        if (user == null){
            throw new RuntimeException("用户不存在");
        }
        if(!password.equals(user.getPassword())) {
            throw new RuntimeException("密码错误");
        }else {
            bean.setCode(0);
        }
        return bean;
    }

    @Override
    public ResultVo insertUser(User user) {
        try {
            um.insert(user);
            rv = ResultVo.setOK(user);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo.setERROR();
        }
        return rv;
    }
}
