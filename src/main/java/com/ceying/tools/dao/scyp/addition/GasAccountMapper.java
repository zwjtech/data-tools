package com.ceying.tools.dao.scyp.addition;

import com.ceying.tools.entity.scyp.addition.GasAccount;

public interface GasAccountMapper {
    int deleteByPrimaryKey(String urid);

    int insert(GasAccount record);

    int insertSelective(GasAccount record);

    GasAccount selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(GasAccount record);

    int updateByPrimaryKey(GasAccount record);
}