package com.qfedu.dao;

import com.qfedu.pojo.Community;

public interface CommunityMapper {
    int deleteByPrimaryKey(Integer communityid);

    int insert(Community record);

    int insertSelective(Community record);

    Community selectByPrimaryKey(Integer communityid);

    int updateByPrimaryKeySelective(Community record);

    int updateByPrimaryKey(Community record);
}