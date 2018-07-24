package com.ceying.tools.util.svnkit;


import org.tmatesoft.svn.core.*;
import org.tmatesoft.svn.core.auth.ISVNAuthenticationManager;
import org.tmatesoft.svn.core.internal.io.dav.DAVRepositoryFactory;
import org.tmatesoft.svn.core.internal.wc.DefaultSVNOptions;
import org.tmatesoft.svn.core.io.SVNRepository;
import org.tmatesoft.svn.core.io.SVNRepositoryFactory;
import org.tmatesoft.svn.core.wc.SVNClientManager;
import org.tmatesoft.svn.core.wc.SVNWCUtil;

import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: yangxh
 * 开发时间: 2018/7/9<br>
 * <br>
 */
public class SvnkitUtil {

    static {
        DAVRepositoryFactory.setup();
    }


    private SVNClientManager manage;

    private String url;



    public  void  SvnHeaderVersion()  throws SVNException {

        url = "http://192.168.6.24/svn/CY/trunk";

        SVNURL svnurl = SVNURL.parseURIEncoded(url);
        //DAVRepositoryFactory.setup();
        //ISVNOptions options = SVNWCUtil.createDefaultOptions(true);
        DefaultSVNOptions options = new DefaultSVNOptions();
        manage = SVNClientManager.newInstance(options,"xinhuan.yang","Yxh900306");
        ISVNAuthenticationManager authManager = SVNWCUtil.createDefaultAuthenticationManager("xinhuan.yang","Yxh900306");
        SVNRepository repos= SVNRepositoryFactory.create(svnurl);
        repos.setAuthenticationManager(authManager);   //设置认证
        System.out.println("----------------"+repos.getLatestRevision()+"----------------");

        //获取svn子目录
        SVNRepository repository = manage.createRepository(svnurl,true);
        try {
            Collection<SVNDirEntry> dirs = repository.getDir("", -1, null, (List<SVNDirEntry>)null);
            List<SVNDirEntry> list = new ArrayList<SVNDirEntry>(dirs.size());
            list.addAll(dirs);

            String path = "/trunk/cyp/database";
            SVNNodeKind svnNodeKind = repository.checkPath(path,-1);
            if(svnNodeKind == SVNNodeKind.NONE){
                System.err.println("This is no entry at " + path);
                System.exit(1);
            }else if(svnNodeKind == SVNNodeKind.FILE){
                System.err.println("The entry at '" + path + "' is a file while a directory was expected.");
                System.exit(1);
            }else{
                System.err.println("SVNNodeKind的值：" + svnNodeKind);
            }
            listFile(repository,path);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void listFile(SVNRepository svnRepository,String path)throws Exception{
        Collection<SVNDirEntry> dirs = svnRepository.getDir(path, 4237, null, (List<SVNDirEntry>)null);
        Iterator iterator = dirs.iterator();
        while(iterator.hasNext()){
            SVNDirEntry svnDirEntry = (SVNDirEntry)iterator.next();
            svnDirEntry.getKind();
            System.out.println("path:" + "/" + (path.equals("") ? "" : path + "/") + svnDirEntry.getName() + ",(author:" + svnDirEntry.getAuthor() + ",revision:" + svnDirEntry.getRevision() + ",date:" + svnDirEntry.getDate() + ")");
            if(svnDirEntry.getKind() == SVNNodeKind.DIR){
                String tempPath = (path.equals("") ? svnDirEntry.getName() : path + "/" + svnDirEntry.getName()) ;
                listFile(svnRepository,tempPath);
            }else if(svnDirEntry.getKind() == SVNNodeKind.FILE){
                //获取文本文件内容
                getFileContent(svnRepository,path+ "/"+ svnDirEntry.getName());
            }
        }
    }


    /**
     * 获取文本文件内容
     * @param svnRepository
     * @param path
     */
    private static void getFileContent(SVNRepository svnRepository, String path) throws Exception{
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        SVNProperties svnProperties = new SVNProperties();
        svnRepository.getFile(path,4237,svnProperties,byteArrayOutputStream);
        String mimeType = svnProperties.getStringValue(SVNProperty.MIME_TYPE);
        boolean isTextType = SVNProperty.isTextMimeType(mimeType);
        if(isTextType){
//            byte[] bArray = byteArrayOutputStream.toByteArray();
//            for (int i = 0; i < bArray.length; ++i){
//                System.out.println(bArray[i]+" ");
//            }
            String content = new String(byteArrayOutputStream.toByteArray(),"UTF-8");
            System.out.println(content);
            createScriptFile(content);
            //byteArrayOutputStream.writeTo(System.out);
        }

    }


    /**
     * 写出文件流
     * @param fileContent
     * @throws Exception
     */
    private static void createScriptFile(String fileContent) throws  Exception{
        FileWriter fileWriter = new FileWriter("D:/test.sql",true);
        fileWriter.write(fileContent);
        fileWriter.close();
    }

}
