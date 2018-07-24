package com.ceying.tools.dao.scyp.addition;

import com.ceying.tools.entity.scyp.addition.OpenInvoiceQuota;

public interface OpenInvoiceQuotaMapper {
    int deleteByPrimaryKey(String urid);

    int insert(OpenInvoiceQuota record);

    int insertSelective(OpenInvoiceQuota record);

    OpenInvoiceQuota selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(OpenInvoiceQuota record);

    int updateByPrimaryKey(OpenInvoiceQuota record);
}