package com.sy.service;


import com.sy.vo.ResponseResult;
import javax.servlet.http.HttpServletRequest;


public interface UserInfoService {
  ResponseResult userInfo(HttpServletRequest request);
}
