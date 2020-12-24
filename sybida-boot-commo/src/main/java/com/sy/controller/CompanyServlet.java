package com.sy.controller;

import com.sy.MD5.MD5Utils;
import com.sy.QNY.Qnyutil;
import com.sy.pojo.SybidaCompany;
import com.sy.redis.RedisOpsUtil;
import com.sy.redis.RedisUtil;
import com.sy.service.CompanyService;
import com.sy.service.LoginService;
import com.sy.service.UserInfoService;
import com.sy.vo.ResponseResult;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
        return companyService.ecode(userId);
    }

    @RequestMapping(value ="insertcompany",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult insertCompany(@RequestParam("file") MultipartFile file, SybidaCompany sybidaCompany){
        System.out.println(sybidaCompany+"========================");
        System.out.println(file+"=================");
        if(file.isEmpty()){
        }else {
            System.out.println("上传成功");
            String photoUrl= Qnyutil.uploadFile(file);
            sybidaCompany.setCompanyPicture(photoUrl);
        }
        sybidaCompany.setCompanyAlterTime(new Date());
        return companyService.insertCompany(sybidaCompany);
    }


}
