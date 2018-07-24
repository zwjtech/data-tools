package com.ceying.tools.dao.scyp.system;

import com.ceying.tools.entity.scyp.system.SupplierBusinessType;

public interface SupplierBusinessTypeMapper {
    int deleteByPrimaryKey(String urid);

    int insert(SupplierBusinessType record);

    int insertSelective(SupplierBusinessType record);

    SupplierBusinessType selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(SupplierBusinessType record);

    int updateByPrimaryKey(SupplierBusinessType record);
}