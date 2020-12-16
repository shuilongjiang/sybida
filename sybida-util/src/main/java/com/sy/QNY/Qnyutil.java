package com.sy.QNY;

import com.alibaba.fastjson.JSONObject;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;
@Component
public class Qnyutil {
   // 设置好账号的ACCESS_KEY和SECRET_KEY
    public  static String ACCESS_KEY = "Un1EOwmWYXv7TkPknS0KV_rB5dWuLpdmttUsYdq_";
    public  static String SECRET_KEY = "XLkBLlpcE9Ej3aWPg11jfcCx2pRSi7sWmw2ewRQV";
    // 要上传的空间
    public  static String bucketname = "sybida";
    // 密钥配置
    public  static Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
    // 构造一个带指定Zone对象的配置类,不同的七云牛存储区域调用不同的zone
    public  static Configuration cfg = new Configuration(Zone.zone2());
    // ...其他参数参考类注释
    public  static UploadManager uploadManager = new UploadManager(cfg);
    // 测试域名，只有30天有效期
    private static String QINIU_IMAGE_DOMAIN = "http://qldlxgj0k.hn-bkt.clouddn.com/";
    // 简单上传，使用默认策略，只需要设置上传的空间名就可以了
    public static String getUpToken() {
        return auth.uploadToken(bucketname);
    }
    public  static String  uploadFile(MultipartFile file,String[] fileSuffix) {
        try {
            //判断文件是否为空
            if (file.isEmpty()) {
                return "文件不能为空";
            }
            //判断文件后缀名是否合法
            int dotPos = file.getOriginalFilename().lastIndexOf(".");
            if (dotPos < 0) {
                return "文件名不合法";
            }
            String fileExt = file.getOriginalFilename().substring(dotPos + 1).toLowerCase();
            // 判断是否是合法的文件后缀
            if (!FileUtil.isFileAllowed(fileExt, fileSuffix)) {
                return "上传文件类型错误";
            }
            String fileName = UUID.randomUUID().toString().replaceAll("-", "") + "." + fileExt;
            // 调用put方法上传
            Response res = uploadManager.put(file.getBytes(), fileName, getUpToken());
            // 打印返回的信息
            if (res.isOK() && res.isJson()) {
                // 返回这张存储照片的地址
                return  String.valueOf(JSONObject.parseObject(res.bodyString()).get("key"));
            } else {

                return "上传失败";
            }
        }catch (Exception e){
           return "上传异常";
        }
    }
    public  static String  uploadFile(MultipartFile file) {
        try {
            //判断文件是否为空
            if (file.isEmpty()) {
                return "文件不能为空";
            }
            //判断文件后缀名是否合法
            int dotPos = file.getOriginalFilename().lastIndexOf(".");
            if (dotPos < 0) {
                return "文件名不合法";
            }
            String fileExt = file.getOriginalFilename().substring(dotPos + 1).toLowerCase();
            // 判断是否是合法的文件后缀
            if (!FileUtil.isFileAllowed(fileExt)) {
                return "上传文件类型错误";
            }
            String fileName = UUID.randomUUID().toString().replaceAll("-", "") + "." + fileExt;
            // 调用put方法上传
            Response res = uploadManager.put(file.getBytes(), fileName, getUpToken());
            // 打印返回的信息
            if (res.isOK() && res.isJson()) {
                // 返回这张存储照片的地址
                return String.valueOf(JSONObject.parseObject(res.bodyString()).get("key"));
            } else {

                return "上传失败";
            }
        }catch (Exception e){
            return "上传异常";
        }
    }
    public static Integer  delete(String key){
        BucketManager bucketManager = new BucketManager(auth, cfg);
        try {
            bucketManager.delete("sybida", key);
            return 1;
        } catch (Exception ex) {
            return 0;
        }
    }
}
