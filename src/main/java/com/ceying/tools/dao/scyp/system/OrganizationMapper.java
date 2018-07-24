package com.ceying.tools.dao.scyp.system;

import com.ceying.tools.entity.scyp.system.Organization;

public interface OrganizationMapper {
    int deleteByPrimaryKey(String orgId);

    int insert(Organization record);

    int insertSelective(Organization record);

    Organization selectByPrimaryKey(String orgId);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(Organization record);
}