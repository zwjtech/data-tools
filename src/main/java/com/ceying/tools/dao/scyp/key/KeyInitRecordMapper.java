package com.ceying.tools.dao.scyp.key;

import com.ceying.tools.entity.scyp.key.KeyInitRecord;

public interface KeyInitRecordMapper {
    int deleteByPrimaryKey(String urid);

    int insert(KeyInitRecord record);

    int insertSelective(KeyInitRecord record);

    KeyInitRecord selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(KeyInitRecord record);

    int updateByPrimaryKeyWithBLOBs(KeyInitRecord record);

    int updateByPrimaryKey(KeyInitRecord record);
}