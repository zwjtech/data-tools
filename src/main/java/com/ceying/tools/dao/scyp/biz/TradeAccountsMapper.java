package com.ceying.tools.dao.scyp.biz;

import com.ceying.tools.entity.scyp.biz.TradeAccounts;

public interface TradeAccountsMapper {
    int deleteByPrimaryKey(String urid);

    int insert(TradeAccounts record);

    int insertSelective(TradeAccounts record);

    TradeAccounts selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(TradeAccounts record);

    int updateByPrimaryKey(TradeAccounts record);
}