package com.ceying.tools.dao.scyp.biz;

import com.ceying.tools.entity.scyp.biz.CoreCompanyQuota;

public interface CoreCompanyQuotaMapper {
    int deleteByPrimaryKey(String urid);

    int insert(CoreCompanyQuota record);

    int insertSelective(CoreCompanyQuota record);

    CoreCompanyQuota selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(CoreCompanyQuota record);

    int updateByPrimaryKey(CoreCompanyQuota record);
}