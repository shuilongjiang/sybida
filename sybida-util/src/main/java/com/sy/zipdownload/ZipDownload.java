package com.sy.zipdownload;

import com.sy.QNY.Qnyutil;
import com.sy.redis.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
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

public class ZipDownload {


    public static String downloadManyFilesToQny( Map<String ,String> map)  {
        try {
            String zipBasePath = "D:/upload/zip";
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

                File file1=new File(zipFilePath);
                if(file1.exists()){
                    file1.delete();
                }
               return fileNamesQny;
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