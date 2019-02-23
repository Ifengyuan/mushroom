package com.qfedu.service;

import com.qfedu.pojo.User;
import com.qfedu.vo.JsonBean;
import com.qfedu.vo.ResultVo;

public interface UserService {
    JsonBean login(String username, String password);

    ResultVo insertUser(User user);
}
