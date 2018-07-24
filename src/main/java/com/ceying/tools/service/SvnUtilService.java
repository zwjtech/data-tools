package com.ceying.tools.service;

import com.ceying.tools.vo.SqlExecuteVo;
import org.tmatesoft.svn.core.SVNException;

import java.util.List;
import java.util.Map;

/**
 * Created by Energie on 2018/7/9.
 */
public interface SvnUtilService {

    void getlatestretivision(Map<String,Object> infos) throws SVNException;

    List<Map<String,String>> SvnHeaderVersion(SqlExecuteVo vo) throws SVNException;
}
