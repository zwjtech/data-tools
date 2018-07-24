package com.ceying.tools.dao.scyp.system;

import com.ceying.tools.entity.scyp.system.UserLogin;

public interface UserLoginMapper {
    int deleteByPrimaryKey(String userId);

    int insert(UserLogin record);

    int insertSelective(UserLogin record);

    UserLogin selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserLogin record);

    int updateByPrimaryKey(UserLogin record);
}