package com.ceying.tools.dao.scyp.addition;

import com.ceying.tools.entity.scyp.addition.BlockChainNodeApply;

public interface BlockChainNodeApplyMapper {
    int deleteByPrimaryKey(String urid);

    int insert(BlockChainNodeApply record);

    int insertSelective(BlockChainNodeApply record);

    BlockChainNodeApply selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(BlockChainNodeApply record);

    int updateByPrimaryKeyWithBLOBs(BlockChainNodeApply record);

    int updateByPrimaryKey(BlockChainNodeApply record);
}