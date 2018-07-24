package com.ceying.tools.dao.scyp.system;

import com.ceying.tools.entity.scyp.system.RoleUser;
import org.apache.ibatis.annotations.Param;

public interface RoleUserMapper {
    int deleteByPrimaryKey(@Param("userCode") String userCode, @Param("roleCode") String roleCode, @Param("rightFlag") String rightFlag);

    int insert(RoleUser record);

    int insertSelective(RoleUser record);

    RoleUser selectByPrimaryKey(@Param("userCode") String userCode, @Param("roleCode") String roleCode, @Param("rightFlag") String rightFlag);

    int updateByPrimaryKeySelective(RoleUser record);

    int updateByPrimaryKey(RoleUser record);
}