package com.sy.service;

import com.alibaba.fastjson.JSONObject;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import com.sy.QNY.FileUtil;
import com.sy.QNY.Qnyutil;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.util.UUID;

@Service
public class QnyserviceImp implements QnyService{

    @Override
    public ResponseResult test(MultipartFile file) {
        ResponseResult responseResult=new ResponseResult();
        String res=Qnyutil.uploadFile(file,FileUtil.IMAGE_FILE_EXTD);
        responseResult.setMessage(res);
        return responseResult;
        }
    @Override
    public ResponseResult delete(String fileKey) {
       Integer res = Qnyutil.delete(fileKey);
        ResponseResult responseResult=new ResponseResult();
        responseResult.setCode(res);
        return responseResult;
    }


    }

