package com.ceying.tools.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ceying.tools.service.TransferDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : Meow
 * @date : 2018-6-13
 * @description : TODO
 */
@RestController
@RequestMapping("/transferData")
public class TransferDataController {

    @Autowired
    private TransferDataService transferDataService;

    /**
     * @param []
     * @return void
     * @description 接收前端请求
     * @author Meow
     * @date 2018-6-13
     */
    @RequestMapping(value = "/toMysql", method = RequestMethod.GET)
    public void transferData(String database, HttpServletResponse response, HttpServletRequest request) throws Exception {
        String result = "";
        try {
            if (database.equals("scyp-system")) {
                transferDataService.transferData2System();
            } else if (database.equals("scyp-addition")) {
                transferDataService.transferData2Addition();
            } else if (database.equals("scyp-biz")) {
                transferDataService.transferData2Biz();
            } else if (database.equals("scyp-key")) {
                transferDataService.transferData2Key();
            } else if (database.equals("all")) {
                transferDataService.transferData2System();
                transferDataService.transferData2Addition();
                transferDataService.transferData2Biz();
                transferDataService.transferData2Key();
            }
            result="({\"result\":\"success\"});";
        } catch (Exception e) {
            result="({\"result\":\"error\"});";
        }
        PrintWriter out = response.getWriter();

        String callback = request.getParameter("callback");
        String retStr = callback + result;
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        out.println(retStr);
    }
}
