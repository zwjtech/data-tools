package com.ceying.tools.dao.scyp.biz;

import com.ceying.tools.entity.scyp.biz.Taoperations;

public interface TaoperationsMapper {
    int deleteByPrimaryKey(String urid);

    int insert(Taoperations record);

    int insertSelective(Taoperations record);

    Taoperations selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(Taoperations record);

    int updateByPrimaryKey(Taoperations record);
}