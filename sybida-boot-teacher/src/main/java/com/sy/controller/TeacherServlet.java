package com.sy.controller;

import com.sy.basepath.BasePath;
import com.sy.service.TeacherSerivce;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("teacher")
@RestController
@CrossOrigin
public class TeacherServlet{
    @Autowired
    TeacherSerivce teacherSerivce;
    @Transactional
    @RequestMapping("selectpage")
    //按学习方向查询老师的全部信息，并进行分页
    public ResponseResult selectByPage(String pageSize,String pageNum,String teacherStudy){
    ResponseResult    responseResult=teacherSerivce.selectPage(Integer.valueOf(pageSize),Integer.valueOf(pageNum),teacherStudy);
        return responseResult;
    }
    @Transactional
    @RequestMapping("selectStudy")
    //根据学习方向ID查询学习方向的具体内容
    public ResponseResult selectStudy(){
        return teacherSerivce.selectStudy();
    }
    @Transactional
    @RequestMapping("deleteteacher")
    //根据教师ID进行删除教师表，删除用户表，
    public ResponseResult deleteTeacher(Integer  deleteTeacherId){

        return teacherSerivce.deleteTeacher(deleteTeacherId);
    }
    @RequestMapping("deleteallteacher")
    public ResponseResult deleteAllTeacher(@RequestBody List<Integer> list){

        return teacherSerivce.deleteAllTeacher(list);
    }
}
