package com.ceying.tools.dao.scyp.system;

import com.ceying.tools.entity.scyp.system.OrganizationRelation;

public interface OrganizationRelationMapper {
    int deleteByPrimaryKey(String urid);

    int insert(OrganizationRelation record);

    int insertSelective(OrganizationRelation record);

    OrganizationRelation selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(OrganizationRelation record);

    int updateByPrimaryKey(OrganizationRelation record);
}