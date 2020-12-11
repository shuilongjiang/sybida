package com.sy.controller;

import com.sy.pojo.StudentInfo;
import com.sy.pojo.UserInfo;
import com.sy.redis.RedisUtil;
import com.sy.service.UserInfoService;
import com.sy.service.UserInfoServiceImp;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("user")
@RestController
@CrossOrigin
public class UserInfoServlet {
    @Autowired
    RedisUtil redisUtil;
    @Autowired
    UserInfoService userInfoService;
    @Transactional
    @RequestMapping("userinfostu")
    public ResponseResult userInfoStu(String userid){
        StudentInfo studentInfo=new StudentInfo();

        String userId = String.valueOf(redisUtil.getObj(userid));



        return userInfoService.userInfoStu(Integer.valueOf(userId));

    }
    @Transactional
    @RequestMapping("userinfoteach")
    public ResponseResult userInfoTeach(HttpServletRequest request){
        UserInfo userInfo=new UserInfo();
        return null;
    }
}

