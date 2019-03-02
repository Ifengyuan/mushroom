package com.qfedu.service.impl;

import com.qfedu.dao.PictureMapper;
import com.qfedu.pojo.Picture;
import com.qfedu.service.PictureService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: fengyuan
 * @Description: 该类的功能描述
 * @date: 2019/3/1 16:00
 */
@Service
public class PictureServiceImpl implements PictureService {
    private ResultVo rv;
    @Autowired
    private PictureMapper pm;
    @Override
    public ResultVo insertPicture(Picture picture) {
        try {
            pm.insert(picture);
            rv = ResultVo.setOK(picture);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo.setERROR();
        }
        return rv;
    }
}
