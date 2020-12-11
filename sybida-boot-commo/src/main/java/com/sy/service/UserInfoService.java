package com.sy.service;


import com.sy.vo.ResponseResult;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;


public interface UserInfoService {
  ResponseResult userInfoStu(Integer userid);
}
