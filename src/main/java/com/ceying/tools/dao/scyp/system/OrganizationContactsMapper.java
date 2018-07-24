package com.ceying.tools.dao.scyp.system;

import com.ceying.tools.entity.scyp.system.OrganizationContacts;

public interface OrganizationContactsMapper {
    int deleteByPrimaryKey(String urid);

    int insert(OrganizationContacts record);

    int insertSelective(OrganizationContacts record);

    OrganizationContacts selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(OrganizationContacts record);

    int updateByPrimaryKey(OrganizationContacts record);
}