package com.ceying.tools.dao.scyp.biz;

import com.ceying.tools.entity.scyp.biz.AccountsPayable;

public interface AccountsPayableMapper {
    int deleteByPrimaryKey(String urid);

    int insert(AccountsPayable record);

    int insertSelective(AccountsPayable record);

    AccountsPayable selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(AccountsPayable record);

    int updateByPrimaryKeyWithBLOBs(AccountsPayable record);

    int updateByPrimaryKey(AccountsPayable record);
}