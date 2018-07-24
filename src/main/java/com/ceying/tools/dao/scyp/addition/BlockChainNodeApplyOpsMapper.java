package com.ceying.tools.dao.scyp.addition;

import com.ceying.tools.entity.scyp.addition.BlockChainNodeApplyOps;

public interface BlockChainNodeApplyOpsMapper {
    int deleteByPrimaryKey(String urid);

    int insert(BlockChainNodeApplyOps record);

    int insertSelective(BlockChainNodeApplyOps record);

    BlockChainNodeApplyOps selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(BlockChainNodeApplyOps record);

    int updateByPrimaryKey(BlockChainNodeApplyOps record);
}