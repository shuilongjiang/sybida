package com.sy.controller;

import com.sy.QNY.Qnyutil;
import com.sy.pojo.SybidaJob;
import com.sy.redis.RedisUtil;
import com.sy.service.StudentSerivce;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@RequestMapping("student")
@RestController
@CrossOrigin
public class StudentServlet {
    @Autowired
    StudentSerivce studentSerivce;
    @Autowired
    RedisUtil redisUtil;


    @RequestMapping("selectstudentbyid")
    public  ResponseResult selectStudentById(String userid){
        redisUtil.expire(userid,60);
        String userId = String.valueOf(redisUtil.getObj(userid));
        ResponseResult responseResult = studentSerivce.selectstudentbyid(Integer.valueOf(userId));
        return  responseResult;
    }




}
