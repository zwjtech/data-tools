package com.ceying.tools.dao.scyp.key;

import com.ceying.tools.entity.scyp.key.KeyInventory;

public interface KeyInventoryMapper {
    int deleteByPrimaryKey(String urid);

    int insert(KeyInventory record);

    int insertSelective(KeyInventory record);

    KeyInventory selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(KeyInventory record);

    int updateByPrimaryKey(KeyInventory record);
}