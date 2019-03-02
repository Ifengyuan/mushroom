package com.qfedu.dao;

import com.qfedu.pojo.Houser;
import com.qfedu.vo.VHouse;

import java.util.List;

public interface HouserMapper {
    int deleteByPrimaryKey(Integer homeid);

    int insert(Houser record);

    int insertSelective(Houser record);

    Houser selectByPrimaryKey(Integer homeid);

    int updateByPrimaryKeySelective(Houser record);

    int updateByPrimaryKey(Houser record);

    VHouse selectAllByHouseId(Integer homeid);

    List<VHouse> selectAllPutong();
}