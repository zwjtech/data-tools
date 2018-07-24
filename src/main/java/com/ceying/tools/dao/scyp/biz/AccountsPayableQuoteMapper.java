package com.ceying.tools.dao.scyp.biz;

import com.ceying.tools.entity.scyp.biz.AccountsPayableQuote;

public interface AccountsPayableQuoteMapper {
    int deleteByPrimaryKey(String urid);

    int insert(AccountsPayableQuote record);

    int insertSelective(AccountsPayableQuote record);

    AccountsPayableQuote selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(AccountsPayableQuote record);

    int updateByPrimaryKeyWithBLOBs(AccountsPayableQuote record);

    int updateByPrimaryKey(AccountsPayableQuote record);
}