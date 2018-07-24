package com.ceying.tools.controller;

import com.ceying.tools.service.SqlExecuteService;
import com.ceying.tools.service.SvnUtilService;
import com.ceying.tools.vo.ReturnResult;
import com.ceying.tools.vo.SqlExecuteVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.tmatesoft.svn.core.SVNException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: yangxh
 * 开发时间: 2018/7/18<br>
 * <br>
 */
@Controller
@RequestMapping("/script")
public class SvnUtilController {


    @Autowired
    private SvnUtilService svnUtilService;
    @Autowired
    private SqlExecuteService sqlExecuteService;


    /**
     * 获取svn最大版本号
     */
    public void svnrevision(HttpServletRequest request, HttpServletResponse response, Map<String, Object> infos) {
        try {
            svnUtilService.getlatestretivision(infos);
        } catch (SVNException e) {
            e.printStackTrace();
        }
    }

    /**
     * 连接svn处理
     *
     * @param vo
     */
    @RequestMapping(value = "/sqlExecute", method = RequestMethod.POST)
    public ReturnResult sqlExecute(SqlExecuteVo vo) {
        ReturnResult result = new ReturnResult();
        try {
            sqlExecuteService.executeSql(svnUtilService.SvnHeaderVersion(vo));
            result.setSuccess(true);
        } catch (SVNException e) {
            e.printStackTrace();
            result.setSuccess(false);
            result.setMsg(e.getMessage());
        }
        return result;
    }
}
