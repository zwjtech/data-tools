package com.ceying.tools.dao.scyp.biz;

import com.ceying.tools.entity.scyp.biz.TradeTransActions;

public interface TradeTransActionsMapper {
    int deleteByPrimaryKey(String urid);

    int insert(TradeTransActions record);

    int insertSelective(TradeTransActions record);

    TradeTransActions selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(TradeTransActions record);

    int updateByPrimaryKey(TradeTransActions record);
}