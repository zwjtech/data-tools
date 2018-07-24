package com.ceying.tools.dao.scyp.key;

import com.ceying.tools.entity.scyp.key.KeyPurchaseApply;

public interface KeyPurchaseApplyMapper {
    int deleteByPrimaryKey(String urid);

    int insert(KeyPurchaseApply record);

    int insertSelective(KeyPurchaseApply record);

    KeyPurchaseApply selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(KeyPurchaseApply record);

    int updateByPrimaryKey(KeyPurchaseApply record);
}