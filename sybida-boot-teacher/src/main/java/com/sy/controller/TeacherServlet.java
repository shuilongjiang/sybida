package com.sy.controller;

import com.sy.service.TeacherSerivce;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("teacher")
@RestController
@CrossOrigin
public class TeacherServlet{
    @Autowired
    ResponseResult responseResult;
    @Autowired
    TeacherSerivce teacherSerivce;

    @Transactional
    @RequestMapping("selectpage")
    public ResponseResult selectByPage(String pageSize,String pageNum,String teacherStudy){
        responseResult=teacherSerivce.selectPage(Integer.valueOf(pageSize),Integer.valueOf(pageNum),teacherStudy);
        return responseResult;
    }
    @Transactional
    @RequestMapping("selectStudy")
    public ResponseResult selectStudy(){
        return teacherSerivce.selectStudy();
    }
}
