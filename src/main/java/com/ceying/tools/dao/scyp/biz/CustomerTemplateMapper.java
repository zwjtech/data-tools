package com.ceying.tools.dao.scyp.biz;

import com.ceying.tools.entity.scyp.biz.CustomerTemplate;

public interface CustomerTemplateMapper {
    int deleteByPrimaryKey(String urid);

    int insert(CustomerTemplate record);

    int insertSelective(CustomerTemplate record);

    CustomerTemplate selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(CustomerTemplate record);

    int updateByPrimaryKeyWithBLOBs(CustomerTemplate record);

    int updateByPrimaryKey(CustomerTemplate record);
}