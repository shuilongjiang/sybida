package com.sy.controller;

import com.sy.redis.RedisUtil;
import com.sy.service.AuditionSerivce;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("audition")
@RestController
@CrossOrigin
public class AuditionServlet {
    @Autowired
    AuditionSerivce auditionSerivce;
    @Autowired
    RedisUtil redisUtil;


    @Transactional
    @RequestMapping("selectClass")
    //根据用户ID查询班级信息
    public ResponseResult selectByClass(String userid) {
        System.out.println(userid+"=======");
        redisUtil.expire(userid,60);
        String userId = String.valueOf(redisUtil.getObj(userid));
        ResponseResult responseResult = auditionSerivce.selectClass(userId);
        return responseResult;
    }




    @Transactional
    @RequestMapping("selectpage")
    //按用户id和班级id查询学生的面试登记，并进行分页
    public ResponseResult selectByPageuserid(String pageSize, String pageNum, String classNum,String userid) {
        redisUtil.expire(userid,60);
        String userId = String.valueOf(redisUtil.getObj(userid));

        return  auditionSerivce.selectPage(Integer.valueOf(pageSize), Integer.valueOf(pageNum),classNum,Integer.valueOf(userId));

    }

    @Transactional
    @RequestMapping("selectstudentInterviewbyauditionId")
    //按用户id和班级id查询学生的面试登记，并进行分页
    public ResponseResult selectstudentInterviewbyauditionId(String auditionId) {

        return  auditionSerivce.selectstudentInterviewbyauditionId(Integer.valueOf(auditionId));

    }





}
