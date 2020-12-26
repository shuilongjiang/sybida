package com.sy.controller;

import com.sy.service.RegisterTeacherService;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("registerteacher")
@RestController
public class RegisterTeacherServlet {
    @Autowired
    RegisterTeacherService registerTeacherService;
    @RequestMapping("redistteachercheckphone")
    public ResponseResult redistTeacherCheckPhone(String phone){
        return registerTeacherService.redistTeacherCheckPhone(phone);
    }
    @RequestMapping("insertteacher")
    public ResponseResult insertTeacher(String phone,String name,Byte studyId){
        return registerTeacherService.insertTeacher(phone,name,studyId);
    }
}
