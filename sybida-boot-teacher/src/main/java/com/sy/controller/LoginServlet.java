package com.sy.controller;

import com.sy.service.LoginService;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("login")
@RestController
public class LoginServlet{
    @Autowired
    ResponseResult responseResult;

    @Autowired
    LoginService loginService;
    @RequestMapping("loginpeople")
    public ResponseResult loginpeople(HttpServletRequest request){
        return loginService.loginpeople(request);
    }

    @RequestMapping("logincheck")
    public ResponseResult login(HttpServletRequest request,String phone , String psw){
       return loginService.login(request,phone,psw);
    }

}
