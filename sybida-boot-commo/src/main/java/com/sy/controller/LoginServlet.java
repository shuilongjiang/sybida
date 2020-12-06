package com.sy.controller;

import com.sy.service.LoginService;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

@RequestMapping("login")
@RestController
@CrossOrigin
public class LoginServlet{
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Autowired
    LoginService loginService;
    @Transactional
    @RequestMapping("loginpeople")
    public ResponseResult loginpeople(HttpServletRequest request){

        return loginService.loginpeople(request);
    }
    @Transactional
    @RequestMapping("logincheck")
    public ResponseResult login(HttpServletRequest request,String phone , String psw){

        return loginService.login(request,phone,psw);
    }
    @Transactional
    @RequestMapping("resetpsw")
    public ResponseResult  resetPsw(String account,String verifycode){
        return loginService.resetPsw(account,verifycode);
    }
    @Transactional
    @RequestMapping("changepsd")
    public  ResponseResult changePsd(String phone,String psd){
       return loginService.changePsd(phone,psd);
    }
    @Transactional
    @RequestMapping("checkphone")
    public ResponseResult  checkPhone(String phone){
        return loginService.checkPhone(phone);
    }
}
