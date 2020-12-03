package com.sy.service;

import com.sy.vo.ResponseResult;

import javax.servlet.http.HttpServletRequest;

public interface LoginService {
    ResponseResult loginpeople(HttpServletRequest request);
    ResponseResult login(HttpServletRequest request,String phone , String psw);
    ResponseResult changePsw(String phone,String vCode);
    ResponseResult changePhone(String phone);
}
