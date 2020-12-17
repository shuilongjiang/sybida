package com.sy.controller;

import com.sy.QNY.Qnyutil;
import com.sy.redis.RedisUtil;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("vitae")
@RestController
@CrossOrigin
public class StudentUploadVitae {
    @Autowired
    RedisUtil redisUtil;
    @RequestMapping(value ="uploadvitae", method = RequestMethod.POST)
    public ResponseResult UploadVitae(@RequestParam("file") MultipartFile file, String userid,String studyId){
        redisUtil.expire(userid,60);
        String userId= String.valueOf(redisUtil.getObj(userid));
        ResponseResult responseResult=new ResponseResult();
        String filename = Qnyutil.uploadFile(file);
        if(filename.length()>32){

        }else{
            responseResult.setCode(0);
            responseResult.setMessage(filename);
        }
        return responseResult;
    }
}
