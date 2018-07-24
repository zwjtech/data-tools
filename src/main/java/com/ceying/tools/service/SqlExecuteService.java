package com.ceying.tools.service;

import java.util.List;
import java.util.Map;

/**
 * @author : Meow
 * @date : 2018-7-5
 * @description : TODO
 */
public interface SqlExecuteService {
    void executeSql(List<Map<String,String>> list);
}
