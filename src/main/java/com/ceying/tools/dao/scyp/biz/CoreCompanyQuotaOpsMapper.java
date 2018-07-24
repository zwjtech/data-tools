package com.ceying.tools.dao.scyp.biz;

import com.ceying.tools.entity.scyp.biz.CoreCompanyQuotaOps;

public interface CoreCompanyQuotaOpsMapper {
    int deleteByPrimaryKey(String urid);

    int insert(CoreCompanyQuotaOps record);

    int insertSelective(CoreCompanyQuotaOps record);

    CoreCompanyQuotaOps selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(CoreCompanyQuotaOps record);

    int updateByPrimaryKey(CoreCompanyQuotaOps record);
}