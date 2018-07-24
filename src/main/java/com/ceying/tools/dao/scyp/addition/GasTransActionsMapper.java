package com.ceying.tools.dao.scyp.addition;

import com.ceying.tools.entity.scyp.addition.GasTransActions;

public interface GasTransActionsMapper {
    int deleteByPrimaryKey(String urid);

    int insert(GasTransActions record);

    int insertSelective(GasTransActions record);

    GasTransActions selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(GasTransActions record);

    int updateByPrimaryKey(GasTransActions record);
}