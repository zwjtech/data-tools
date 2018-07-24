package com.ceying.tools;

import com.ceying.tools.service.impl.SvnUtilServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.tmatesoft.svn.core.SVNException;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ToolsApplicationTests {

	@Test
	public void contextLoads() {
	}


    /**
     * svn测试
     */
//	@Test
//    public void testsvn(){
//        SvnUtilServiceImpl ssi = new SvnUtilServiceImpl();
//        Map<String,Object> infos = new HashMap<>();
//        infos.put("name","xinhuan.yang");
//        infos.put("key","Yxh900306");
//        infos.put("path","/trunk/cyp/database");
//        infos.put("revision","4305");
//        try {
//            ssi.getlatestretivision(infos);
//            ssi.SvnHeaderVersion(infos);
//        } catch (SVNException e) {
//            e.printStackTrace();
//        }
//    }

}
