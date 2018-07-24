package com.ceying.tools.dao.scyp.addition;

import com.ceying.tools.entity.scyp.addition.OpenInvoiceInfo;

public interface OpenInvoiceInfoMapper {
    int deleteByPrimaryKey(String urid);

    int insert(OpenInvoiceInfo record);

    int insertSelective(OpenInvoiceInfo record);

    OpenInvoiceInfo selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(OpenInvoiceInfo record);

    int updateByPrimaryKey(OpenInvoiceInfo record);
}