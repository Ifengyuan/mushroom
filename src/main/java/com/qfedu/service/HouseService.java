package com.qfedu.service;

import com.qfedu.vo.ResultVo;

/**
 * @author: fengyuan
 * @Description: 该类的功能描述
 * @date: 2019/3/1 15:13
 */
public interface HouseService {

    ResultVo selectAllByHouseId(Integer homeid);

    ResultVo selectAllPutong();
}
