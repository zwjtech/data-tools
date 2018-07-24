package com.ceying.tools.dao.scyp.biz;

import com.ceying.tools.entity.scyp.biz.UniqueCodes;
import org.apache.ibatis.annotations.Param;

public interface UniqueCodesMapper {
    int deleteByPrimaryKey(@Param("keyname") String keyname, @Param("orgid") String orgid);

    int insert(UniqueCodes record);

    int insertSelective(UniqueCodes record);

    UniqueCodes selectByPrimaryKey(@Param("keyname") String keyname, @Param("orgid") String orgid);

    int updateByPrimaryKeySelective(UniqueCodes record);

    int updateByPrimaryKey(UniqueCodes record);
}