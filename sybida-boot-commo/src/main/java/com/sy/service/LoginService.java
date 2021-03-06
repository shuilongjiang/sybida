package com.sy.service;

import com.sy.vo.ResponseResult;

import javax.servlet.http.HttpServletRequest;

public interface LoginService {
    ResponseResult loginpeople(HttpServletRequest request);
    ResponseResult login(HttpServletRequest request,String phone , String psw);
    ResponseResult resetPsw(String phone,String vCode);
    ResponseResult checkPhone(String phone);
    ResponseResult changePsd(String phone,String psd);
    ResponseResult oldChangePsd(String userId,String oldpsd);
    void exitLogin(String userid);
}
