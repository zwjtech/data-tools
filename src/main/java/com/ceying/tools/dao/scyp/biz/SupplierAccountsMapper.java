package com.ceying.tools.dao.scyp.biz;

import com.ceying.tools.entity.scyp.biz.SupplierAccounts;

public interface SupplierAccountsMapper {
    int deleteByPrimaryKey(String urid);

    int insert(SupplierAccounts record);

    int insertSelective(SupplierAccounts record);

    SupplierAccounts selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(SupplierAccounts record);

    int updateByPrimaryKey(SupplierAccounts record);
}