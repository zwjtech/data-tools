package com.ceying.tools.dao.scyp.system;

import com.ceying.tools.entity.scyp.system.SysLog;

public interface SysLogMapper {
    int deleteByPrimaryKey(String logId);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    SysLog selectByPrimaryKey(String logId);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);
}