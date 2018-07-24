package com.ceying.tools.dao.scyp.biz;

import com.ceying.tools.entity.scyp.biz.TripartiteAgreementTemplate;

public interface TripartiteAgreementTemplateMapper {
    int deleteByPrimaryKey(String urid);

    int insert(TripartiteAgreementTemplate record);

    int insertSelective(TripartiteAgreementTemplate record);

    TripartiteAgreementTemplate selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(TripartiteAgreementTemplate record);

    int updateByPrimaryKeyWithBLOBs(TripartiteAgreementTemplate record);

    int updateByPrimaryKey(TripartiteAgreementTemplate record);
}