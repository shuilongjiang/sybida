package com.sy.controller;

import com.sy.QNY.Qnyutil;

import com.sy.pojo.SybidaJob;
import com.sy.redis.RedisUtil;

import com.sy.service.JobSerivce;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@RequestMapping("job")
@RestController
@CrossOrigin
public class JobServlet {
    @Autowired
    JobSerivce jobSerivce;
    @Autowired
    RedisUtil redisUtil;


    @RequestMapping(value = "/addSybidaJob",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult addSybidaJob(@RequestParam("file") MultipartFile file,SybidaJob sybidaJob){
       if (file.isEmpty()){

       }else {
           sybidaJob.setJobAlterTime(new Date());
           String photoUrl = Qnyutil.uploadFile(file);
           sybidaJob.setJobPicture(photoUrl);

       }
        ResponseResult responseResult = jobSerivce.addSybidaJob(sybidaJob);
        return responseResult;
    }







}
