package com.ceying.tools.controller;

import com.alibaba.fastjson.JSONObject;
import com.ceying.tools.entity.scyp.tools.DatasourceConfigEntity;
import com.ceying.tools.service.DatasourceConfigService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: yangxh
 * 开发时间: 2018/6/13<br>
 * <br>
 */

@Controller
@RequestMapping("/datasourceconfig")
public class DatasourceConfigController {


    @Resource
    private DatasourceConfigService datasourceConfigService;

    @RequestMapping(value = "/listAllDatasourceConfig", method = RequestMethod.GET)
    @ResponseBody
    public List<DatasourceConfigEntity> listAllDatasourceConfig() {
        return datasourceConfigService.listAllDatasourceConfig();

    }

    /**
     * 根据条件查询
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public List<DatasourceConfigEntity> get(DatasourceConfigEntity datasourceConfigEntity) {
        return datasourceConfigService.getDatasourceConfig(datasourceConfigEntity);
    }

    /**
     * 根据主键查询
     */
    @RequestMapping(value = "/getByUrid", method = RequestMethod.GET)
    @ResponseBody
    public DatasourceConfigEntity get(String urid) {
        return datasourceConfigService.getDatasourceConfigByUrid(urid);
    }

    /**
     * 数据源配置新增功能
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public void add(DatasourceConfigEntity datasourceConfigEntity, HttpServletRequest request) throws Exception {
        datasourceConfigService.insertDatasourceConfig(datasourceConfigEntity);
    }

    /**
     * 数据源配置删除功能
     */
    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public void remove(@RequestParam("ids") List<String> ids) throws Exception {
        datasourceConfigService.removeDatasourceConfig(ids);
    }

    /**
     * 数据源配置编辑功能
     *
     * @param datasourceConfigEntity
     * @param request
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void update(DatasourceConfigEntity datasourceConfigEntity, HttpServletRequest request) throws Exception {
        datasourceConfigService.updateDatasourceConfig(datasourceConfigEntity);
    }


}

