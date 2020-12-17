package com.sy.controller;

import com.sy.QNY.Qnyutil;
import com.sy.redis.RedisUtil;
import com.sy.service.StudentUploadVitaeService;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("vitae")
@RestController

public class StudentUploadVitaeServlet {
    @Autowired
    StudentUploadVitaeService studentUploadVitaeService;
    @Autowired
    RedisUtil redisUtil;
    @RequestMapping(value ="uploadvitae", method = RequestMethod.POST)
    public ResponseResult UploadVitae(@RequestParam("file") MultipartFile file, String userid,String studyid){
        redisUtil.expire(userid,60);
        String userId= String.valueOf(redisUtil.getObj(userid));
        ResponseResult responseResult=new ResponseResult();
        String filename = Qnyutil.uploadFile(file);
        if(filename.length()>32){
            studentUploadVitaeService.UploadVitae(userId,studyid,filename);
            responseResult.setCode(1);
            responseResult.setMessage(filename);
        }else{
            responseResult.setCode(0);
            responseResult.setMessage("上传失败"+filename);
        }
        return responseResult;
    }
    @RequestMapping("personalvitae")
    public ResponseResult personalVitae(String userid,String isDelete){
        redisUtil.expire(userid,60);
        String userId= String.valueOf(redisUtil.getObj(userid));

        return studentUploadVitaeService.personalVitae(userId,isDelete);
    }
}
