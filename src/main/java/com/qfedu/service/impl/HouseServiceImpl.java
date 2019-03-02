package com.qfedu.service.impl;

import com.qfedu.dao.HouserMapper;
import com.qfedu.service.HouseService;
import com.qfedu.vo.ResultVo;
import com.qfedu.vo.VHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: fengyuan
 * @Description: 该类的功能描述
 * @date: 2019/3/1 15:14
 */
@Service
public class HouseServiceImpl implements HouseService {
    private ResultVo rv;
    @Autowired
    private HouserMapper hmm;
    @Override
    public ResultVo selectAllByHouseId(Integer homeid) {

        try {
            VHouse vHouses = hmm.selectAllByHouseId(homeid);
            rv = ResultVo.setOK(vHouses);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo.setERROR();
        }
        return rv;
    }

    @Override
    public ResultVo selectAllPutong() {
        try {
            List<VHouse> list = hmm.selectAllPutong();
            rv = ResultVo.setOK(list);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo.setERROR();
        }
        return rv;
    }
}
