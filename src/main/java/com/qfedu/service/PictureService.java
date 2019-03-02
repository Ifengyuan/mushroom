package com.qfedu.service;

import com.qfedu.pojo.Picture;
import com.qfedu.vo.ResultVo;
import org.springframework.stereotype.Service;

/**
 * @author: fengyuan
 * @Description: 该类的功能描述
 * @date: 2019/3/1 15:59
 */

public interface PictureService {
    ResultVo insertPicture(Picture picture);
}
