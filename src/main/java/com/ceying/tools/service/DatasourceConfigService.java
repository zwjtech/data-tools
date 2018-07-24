package com.ceying.tools.service;

import com.ceying.tools.entity.scyp.tools.DatasourceConfigEntity;

import java.util.List;

/**
 * Created by Energie on 2018/6/13.
 */
public interface DatasourceConfigService {

    List<DatasourceConfigEntity> listAllDatasourceConfig();

    List<DatasourceConfigEntity> getDatasourceConfig(DatasourceConfigEntity datasourceConfigEntity);

    DatasourceConfigEntity getDatasourceConfigByUrid(String urid);

    void insertDatasourceConfig(DatasourceConfigEntity datasourceConfigEntity) throws Exception;

    void removeDatasourceConfig(List<String> ids) throws Exception;

    void updateDatasourceConfig(DatasourceConfigEntity datasourceConfigEntity) throws Exception;

}
