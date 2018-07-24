package com.ceying.tools.dao.scyp.biz;

import com.ceying.tools.entity.scyp.biz.TripartiteAgreement;

public interface TripartiteAgreementMapper {
    int deleteByPrimaryKey(String urid);

    int insert(TripartiteAgreement record);

    int insertSelective(TripartiteAgreement record);

    TripartiteAgreement selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(TripartiteAgreement record);

    int updateByPrimaryKeyWithBLOBs(TripartiteAgreement record);

    int updateByPrimaryKey(TripartiteAgreement record);
}