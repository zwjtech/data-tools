package com.ceying.tools.service.impl;

import com.ceying.tools.dao.scyp.tools.DatasourceConfigDao;
import com.ceying.tools.entity.scyp.tools.DatasourceConfigEntity;
import com.ceying.tools.service.DatasourceConfigService;
import com.ceying.tools.util.sequence.SequenceUtil;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: yangxh
 * 开发时间: 2018/6/13<br>
 * <br>
 */
@Service
public class DatasourceConfigServiceImpl implements DatasourceConfigService {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private DatasourceConfigDao datasourceConfigDao;


    @Override
    public List<DatasourceConfigEntity> listAllDatasourceConfig() {
        return datasourceConfigDao.selectAll();
    }

    @Override
    public List<DatasourceConfigEntity> getDatasourceConfig(DatasourceConfigEntity datasourceConfigEntity) {
        return datasourceConfigDao.select(datasourceConfigEntity);
    }

    @Override
    public DatasourceConfigEntity getDatasourceConfigByUrid(String urid) {
        return datasourceConfigDao.selectByPrimaryKey(urid);
    }

    @Override
    public void insertDatasourceConfig(DatasourceConfigEntity datasourceConfigEntity) throws Exception {
        String urid = SequenceUtil.UUID();
        datasourceConfigEntity.setUrid(urid);
        datasourceConfigDao.insertSelective(datasourceConfigEntity);
    }

    @Override
    public void removeDatasourceConfig(List<String> ids) throws Exception {
        for(String id:ids){
            DatasourceConfigEntity datasourceConfigEntity = datasourceConfigDao.selectByPrimaryKey(id);
            datasourceConfigDao.deleteByPrimaryKey(datasourceConfigEntity);
        }
    }

    @Override
    public void updateDatasourceConfig(DatasourceConfigEntity datasourceConfigEntity) throws Exception {
        datasourceConfigDao.updateByPrimaryKeySelective(datasourceConfigEntity);
    }
}
