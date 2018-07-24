package com.ceying.tools.service.impl;

import com.ceying.tools.service.SvnUtilService;
import com.ceying.tools.util.svnkit.EncodingDetect;
import com.ceying.tools.vo.SVNConfiguration;
import com.ceying.tools.vo.SqlExecuteVo;
import com.mysql.jdbc.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tmatesoft.svn.core.*;
import org.tmatesoft.svn.core.auth.ISVNAuthenticationManager;
import org.tmatesoft.svn.core.internal.io.dav.DAVRepositoryFactory;
import org.tmatesoft.svn.core.internal.wc.DefaultSVNOptions;
import org.tmatesoft.svn.core.io.SVNRepository;
import org.tmatesoft.svn.core.io.SVNRepositoryFactory;
import org.tmatesoft.svn.core.wc.SVNClientManager;
import org.tmatesoft.svn.core.wc.SVNWCUtil;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.*;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: yangxh
 * 开发时间: 2018/7/18<br>
 * <br>
 */
@Service
public class SvnUtilServiceImpl implements SvnUtilService{

    private SVNClientManager manage;

    @Autowired
    private SVNConfiguration svnConfiguration;

    static {
        DAVRepositoryFactory.setup();
    }


    /**
     * 获取最大版本号
     * @throws SVNException
     */
    @Override
    public void getlatestretivision(Map<String,Object> infos) throws SVNException {
        SVNURL svnurl = SVNURL.parseURIEncoded(svnConfiguration.getRootDirectory());
        DefaultSVNOptions options = new DefaultSVNOptions();
        manage = SVNClientManager.newInstance(options, infos.get("name").toString(),  infos.get("key").toString());
        ISVNAuthenticationManager authManager = SVNWCUtil.createDefaultAuthenticationManager(infos.get("name").toString(),  infos.get("key").toString());
        SVNRepository repos = SVNRepositoryFactory.create(svnurl);
        repos.setAuthenticationManager(authManager);   //设置认证
        repos.getLatestRevision();
    }


    @Override
    public  List<Map<String,String>>  SvnHeaderVersion(SqlExecuteVo vo) throws SVNException {
        List<Map<String,String>> pathlist = new ArrayList<>();
        SVNURL svnurl = SVNURL.parseURIEncoded(svnConfiguration.getRootDirectory());
        DefaultSVNOptions options = new DefaultSVNOptions();
        //SVN账号认证

        manage = SVNClientManager.newInstance(options, svnConfiguration.getUser(),  svnConfiguration.getPassword());
        ISVNAuthenticationManager authManager = SVNWCUtil.createDefaultAuthenticationManager( svnConfiguration.getUser(),  svnConfiguration.getPassword());
        SVNRepository repos = SVNRepositoryFactory.create(svnurl);
        repos.setAuthenticationManager(authManager);

        //获取svn子目录
        SVNRepository repository = manage.createRepository(svnurl, true);
        try {
            Collection<SVNDirEntry> dirs = repository.getDir("", -1, null, (List<SVNDirEntry>) null);
            List<SVNDirEntry> list = new ArrayList<SVNDirEntry>(dirs.size());
            list.addAll(dirs);

            Map<String,String> paths = new HashMap<>();
            String temPath = System.getProperty("user.dir") +"/data/tmp/";
            paths.put("scyp-addition",temPath+"scyp-addition.sql");
            paths.put("scyp-biz",temPath+"scyp-biz.sql");
            paths.put("scyp-key",temPath+"scyp-key.sql");
            paths.put("scyp-system",temPath+"scyp-system.sql");
            paths.put("scyp-workflow",temPath+"scyp-workflow.sql");
            Iterator it = paths.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String key = entry.getKey().toString();
                String value = entry.getValue().toString();
                Map<String, String> map = new HashMap<>();
                map.put("database", key);
                map.put("filePath", value);
                pathlist.add(map);
                String path = svnConfiguration.getDatabaseDirectory() + key;
                String filePath = value;

                int revision = Integer.parseInt(vo.getEndVersion());
                SVNNodeKind svnNodeKind = repository.checkPath(path, -1);
                if (svnNodeKind == SVNNodeKind.NONE) {
                    System.exit(1);
                } else if (svnNodeKind == SVNNodeKind.FILE) {
                    System.exit(1);
                }

                //按照svn版本号排序
                List<SVNDirEntry> filelist = new ArrayList<>();
                listFile(filelist, repository, path,revision);
                fileSort(filelist);
                Collections.reverse(filelist);
                for(int i = 0 ; i < filelist.size() ; i++) {
                    SVNNodeKind NodeKind = repository.checkPath( filelist.get(i).getRelativePath() + "/" + filelist.get(i).getName(),filelist.get(i).getRevision());
                    if(NodeKind !=SVNNodeKind.NONE){
                        //起始版本号为空
                        if(StringUtils.isNullOrEmpty(vo.getStartVersion())){
                            getFileContent(repository,filelist.get(i).getRelativePath()+ "/"+ filelist.get(i).getName(),revision,filePath,filelist.get(i));
                        }
                        //根据起始版本号筛选
                        else if(!StringUtils.isNullOrEmpty(vo.getStartVersion())&&filelist.get(i).getRevision()>=Long.parseLong(vo.getStartVersion())){
                           getFileContent(repository,filelist.get(i).getRelativePath()+ "/"+ filelist.get(i).getName(),revision,filePath,filelist.get(i));
                        }
                    }
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return pathlist;
    }

    /**
     * 遍历脚本文件
     * @param list
     * @param svnRepository
     * @param path
     * @param revision
     * @return
     * @throws Exception
     */
    private static List<SVNDirEntry> listFile(List<SVNDirEntry> list, SVNRepository svnRepository, String path,int revision) throws Exception {
        Collection<SVNDirEntry> dirs = svnRepository.getDir(path, revision, null, (List<SVNDirEntry>) null);
        Iterator iterator = dirs.iterator();
        while (iterator.hasNext()) {
            SVNDirEntry svnDirEntry = (SVNDirEntry) iterator.next();
            if (svnDirEntry.getKind() == SVNNodeKind.DIR) {
                String tempPath = (path.equals("") ? svnDirEntry.getName() : path + "/" + svnDirEntry.getName());
                listFile(list, svnRepository, tempPath,revision);
            }
            else if(svnDirEntry.getKind() == SVNNodeKind.FILE){
                svnDirEntry.setRelativePath(path);
                //获取文本文件内容
                list.add(svnDirEntry);
            }
        }
        return list;
    }


    /**
     * 获取文本文件内容
     *
     * @param svnRepository
     * @param path
     */
    private static void getFileContent(SVNRepository svnRepository, String path,int revision,String filePath,SVNDirEntry entry) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        SVNProperties svnProperties = new SVNProperties();
        svnRepository.getFile(path, revision, svnProperties, byteArrayOutputStream);

        String mimeType = svnProperties.getStringValue(SVNProperty.MIME_TYPE);
        boolean isTextType = SVNProperty.isTextMimeType(mimeType);
        if (isTextType) {
            String checkpath = "D:/test.txt";
            File file = new File(checkpath);
            DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
            byteArrayOutputStream.writeTo(out);
            //判断文件编码格式
            String charsettype = EncodingDetect.getEncode(checkpath);
            String content = new String(byteArrayOutputStream.toByteArray(), charsettype);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //添加svn信息
            String title = "\n#CommentsStart\n/*脚本名称："+ entry.getName()+"\n版本号："+entry.getRevision()+"\n最后提交人："+entry.getAuthor()+"\n最后提交时间："+sdf.format(entry.getDate())+"\n */\n#CommentsEnd\n";
            content = title+content;
            createScriptFile(content,filePath);
        }
    }

    /**
     * 写出文件流
     *
     * @param fileContent
     * @throws Exception
     */
    private static void createScriptFile(String fileContent,String filePath) throws Exception {
        FileWriter fileWriter = new FileWriter(filePath, true);
        fileWriter.write(fileContent);
        fileWriter.close();
    }


    /**
     * svn文件按版本号排序
     * @param filelist
     * @return
     */
    private List<SVNDirEntry> fileSort(List<SVNDirEntry> filelist) {
        Collections.sort(filelist, new Comparator<SVNDirEntry>() {
            @Override
            public int compare(SVNDirEntry o1, SVNDirEntry o2) {
                if (o2.getRevision() > o1.getRevision())
                    return 1;
                else if (o2.getRevision() == o1.getRevision()) {
                    if (o1.getDate().before(o2.getDate()))
                        return  1;
                    else if (o1.getDate() == o2.getDate())
                        return 0;
                    else
                        return -1;
                } else {
                    return -1;
                }
            }
        });
        return filelist;
    }
}

