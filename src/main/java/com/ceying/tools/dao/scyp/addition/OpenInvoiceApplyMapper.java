package com.ceying.tools.dao.scyp.addition;

import com.ceying.tools.entity.scyp.addition.OpenInvoiceApply;

public interface OpenInvoiceApplyMapper {
    int deleteByPrimaryKey(String urid);

    int insert(OpenInvoiceApply record);

    int insertSelective(OpenInvoiceApply record);

    OpenInvoiceApply selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(OpenInvoiceApply record);

    int updateByPrimaryKey(OpenInvoiceApply record);
}