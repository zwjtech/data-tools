package com.ceying.tools.dao.scyp.system;

import com.ceying.tools.entity.scyp.system.BlobStorage;

public interface BlobStorageMapper {
    int insert(BlobStorage record);

    int insertSelective(BlobStorage record);
}