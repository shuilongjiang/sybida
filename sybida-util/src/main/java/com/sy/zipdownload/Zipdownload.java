package com.sy.zipdownload;

import com.sy.QNY.Qnyutil;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

//1.一般需要加入的jar包：
//           commons.fileupload-1.2.1.jar和commons.io-1.4.0.jar，点击下载jar包
/*
https://eurecode.blog.csdn.net/article/details/72772502?utm_medium=distribute.pc_relevant_t0.none-task-blog-BlogCommendFromMachineLearnPai2-1.channel_param&depth_1-utm_source=distribute.
pc_relevant_t0.none-task-blog-BlogCommendFromMachineLearnPai2-1.channel_param
 */

public class  Zipdownload{

    // public String downloadFilesTest(HttpServletRequest request,HttpServletResponse res) throws IOException {
    public static void main(String[] args) throws IOException {
        String targetPath = "http://qldlxgj0k.hn-bkt.clouddn.com/muban.xlsx";
        String targetPath1 = "http://qldlxgj0k.hn-bkt.clouddn.com/defaultpicture2.jpg";
        //模拟文件路径下再添加个文件夹，验证穷举
        String targetPath2 = "http://qldlxgj0k.hn-bkt.clouddn.com/defaultpicture3.jpg";
        String targetPath3 = "http://qldlxgj0k.hn-bkt.clouddn.com/defaultpicture1.jpg";
        String targetPath4 = "http://qldlxgj0k.hn-bkt.clouddn.com/cab72ae091fd455cb311175cda743e4c.pdf";
        Map<String ,String> map=new HashMap<>();
        map.put(targetPath,"李军");
        map.put(targetPath1,"李军1");
        map.put(targetPath2,"李军2");
        map.put(targetPath3,"李军3");
        map.put(targetPath4,"李军4");



        downloadManyFilesToQny(map);
//        File file=new File("E:/upload/zip/temp.zip");
//        if(file.exists()){
//            file.delete();
//        }
    }

    public static String downloadManyFilesToQny( Map<String ,String> map)  {
        try {
            String zipBasePath = "E:/upload/zip";
            String zipName = "temp"+UUID.randomUUID().toString()+".zip";
            String zipFilePath = zipBasePath + File.separator + zipName;
            //压缩文件
            File zip = new File(zipFilePath);
            if (!zip.exists()) {
                zip.createNewFile();
            }
            //创建zip文件输出流
            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zip));
            Integer result=zipFile(map, zos);
            zos.close();
            if(result==1){
                String[] typeFile = new String[] { "zip"};
                File file = new File(zipFilePath);
                FileInputStream inputStream = new FileInputStream(file);
                MultipartFile multipartFile = new MockMultipartFile(file.getName(), file.getName(),null, inputStream);
                String fileNamesQny=Qnyutil.uploadFile(multipartFile,typeFile);
                System.out.println(fileNamesQny);
                File file1=new File(zipFilePath);
                if(file1.exists()){
                    file1.delete();
                }
            }else{
                File file=new File(zipFilePath);
                if(file.exists()){
                   file.delete();
                    }
                return "0";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Integer zipFile(Map<String ,String> map, ZipOutputStream zos)  {

        try {
            Iterator iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                String filePath = String.valueOf(entry.getKey());
                String value = String.valueOf(entry.getValue());
                int HttpResult; // 服务器返回的状态
                URL url =new URL(filePath); // 创建URL
                URLConnection urlconn = url.openConnection(); // 试图连接并取得返回状态码
                urlconn.connect();
                HttpURLConnection httpconn =(HttpURLConnection)urlconn;
                HttpResult = httpconn.getResponseCode();
                if(HttpResult != HttpURLConnection.HTTP_OK) {
                    return 0;
                } else {

                    //创建输入流读取文件
                    BufferedInputStream bis = new BufferedInputStream(urlconn.getInputStream());
                    //将文件写入zip内，即将文件进行打包
                    String suffix = filePath.substring(filePath.lastIndexOf("."));
                    zos.putNextEntry(new ZipEntry(String.valueOf(value + suffix)));
                    //写入文件的方法，同上
                    int size = 0;
                    byte[] buffer = new byte[1024];  //设置读取数据缓存大小
                    while ((size = bis.read(buffer)) > 0) {
                        zos.write(buffer, 0, size);
                    }
                    //关闭输入输出流
                    zos.closeEntry();
                    bis.close();
                  }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //循环读取文件路径集合，获取每一个文件的路径
        return 1;
    }
}