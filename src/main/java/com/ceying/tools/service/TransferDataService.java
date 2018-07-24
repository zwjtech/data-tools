package com.ceying.tools.service;

import com.ceying.tools.entity.cyp.CypOrganization;

import java.util.List;

/**
 * @author : Meow
 * @date : 2018-6-13
 * @description : TODO
 */
public interface TransferDataService {

    void transferData2System() throws Exception;

    void transferData2Addition();

    void transferData2Key();

    void transferData2Biz();
}
