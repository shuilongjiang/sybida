package com.sy.controller;

import com.sy.MD5.MD5Utils;
import com.sy.redis.RedisOpsUtil;
import com.sy.service.CompanyService;
import com.sy.service.LoginService;
import com.sy.service.UserInfoService;
import com.sy.vo.ResponseResult;
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
    @Transactional
    @RequestMapping("ecode")
    public ResponseResult ecode(String userId){
        return companyService.ecode(userId);
    }
}
