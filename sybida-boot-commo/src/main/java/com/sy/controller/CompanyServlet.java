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
import java.util.List;

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

    @RequestMapping(value ="insertcompany",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult insertCompany(@RequestParam("file") MultipartFile file, SybidaCompany sybidaCompany){
        if(file.isEmpty()){
        }else {
            System.out.println("上传成功");
            String photoUrl= Qnyutil.uploadFile(file);
            sybidaCompany.setCompanyPicture(photoUrl);
        }
        sybidaCompany.setCompanyAlterTime(new Date());
        sybidaCompany.setCompanyNull1("1");
        return companyService.insertCompany(sybidaCompany);
    }

    @RequestMapping("selectcompanyinfo")
    public ResponseResult selectCompanyInfo(String pageSize,String pageNum){
        return companyService.selectCompanyInfo(pageNum,pageSize);
    }

    @RequestMapping("deleteonecompany")
    public ResponseResult deleteOneCompany(String companyId){
        return companyService.deleteOneCompany(companyId);
    }

    @RequestMapping("deleteallcompany")
    public ResponseResult deleteAllCompany(@RequestBody List<Integer> list){
        return  companyService.deleteAllCompany(list);
    }
    @RequestMapping("selectteachername")
    public ResponseResult selectTeacherName(String companyUserId){
       return companyService.selectTeacherName(companyUserId);
    }
}
