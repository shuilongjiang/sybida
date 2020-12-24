package com.sy.controller;

import com.sy.MD5.MD5Utils;
import com.sy.redis.RedisOpsUtil;
import com.sy.redis.RedisUtil;
import com.sy.service.CompanyService;
import com.sy.service.LoginService;
import com.sy.service.UserInfoService;
import com.sy.vo.ResponseResult;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RequestMapping("company")
@RestController
@CrossOrigin
public class CompanyServlet {
    @Autowired
    CompanyService companyService;
    @Autowired
    RedisUtil redisUtil;
    @RequestMapping("ecode")
    public ResponseResult ecode(String userid){
        String userId= String.valueOf(redisUtil.getObj(userid));
        redisUtil.expire(userid,60);
        ResponseResult responseResult=companyService.ecode(userId);
        redisUtil.setObj("TwoCode::"+responseResult.getMessage(),"二维码",60*24*7);
        return  responseResult;
    }
}
