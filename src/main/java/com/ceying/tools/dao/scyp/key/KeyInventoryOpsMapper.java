package com.ceying.tools.dao.scyp.key;

import com.ceying.tools.entity.scyp.key.KeyInventoryOps;

public interface KeyInventoryOpsMapper {
    int insert(KeyInventoryOps record);

    int insertSelective(KeyInventoryOps record);
}