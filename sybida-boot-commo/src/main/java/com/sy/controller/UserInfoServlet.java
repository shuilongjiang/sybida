package com.sy.controller;

import com.sy.vo.ResponseResult;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("user")
@RestController
@CrossOrigin
public class UserInfoServlet {
    @Transactional
    @RequestMapping("userinfo")
    public ResponseResult userInfo(HttpServletRequest request){

        return userInfo(request);
    }
}

