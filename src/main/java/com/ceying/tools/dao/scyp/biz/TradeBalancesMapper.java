package com.ceying.tools.dao.scyp.biz;

import com.ceying.tools.entity.scyp.biz.TradeBalances;

public interface TradeBalancesMapper {
    int deleteByPrimaryKey(String urid);

    int insert(TradeBalances record);

    int insertSelective(TradeBalances record);

    TradeBalances selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(TradeBalances record);

    int updateByPrimaryKey(TradeBalances record);
}