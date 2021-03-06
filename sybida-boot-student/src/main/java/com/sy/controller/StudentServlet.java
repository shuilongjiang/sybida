package com.sy.controller;

import com.sy.QNY.Qnyutil;
import com.sy.pojo.SybidaJob;
import com.sy.redis.RedisUtil;
import com.sy.service.StudentSerivce;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@RequestMapping("student")
@RestController
@CrossOrigin
public class StudentServlet {
    @Autowired
    StudentSerivce studentSerivce;
    @Autowired
    RedisUtil redisUtil;


    @RequestMapping("selectstudentbyid")
    public  ResponseResult selectStudentById(String userid){
        String userId = String.valueOf(redisUtil.getObj(userid));
        ResponseResult responseResult = studentSerivce.selectstudentbyid(Integer.valueOf(userId));
        return  responseResult;
    }

    @RequestMapping("deleteonestudent")
    public ResponseResult deleteOneStudent(String studentId){
        return studentSerivce.deleteOneStudent(studentId);
    }

    @RequestMapping("deleteallstudent")
    public ResponseResult deleteAllStudent(@RequestBody List<Integer> list){
     return  studentSerivce.deleteAllStudent(list);
    }

    @RequestMapping("selectstudentbyname")
    public ResponseResult selectStudentByName(String stuName,String classId){
        return studentSerivce.selectStudentByName(stuName,classId);
    }

    @RequestMapping("selectstudentvitae")
    public ResponseResult selectStudentVitae(String userid){
        String userId = String.valueOf(redisUtil.getObj(userid));
        ResponseResult responseResult = studentSerivce.selcetStudentVitaeById(Integer.valueOf(userId));
        return responseResult;
    }

    @RequestMapping("selectevaluatebyvitaeid")
    public ResponseResult selectEvaluateByVitaeId(Integer vitaeId){
        ResponseResult responseResult = studentSerivce.selectEvaluateByVitaeId(vitaeId);
        return responseResult;
    }

    @RequestMapping("selectstudentByUserid")
    public  ResponseResult selectstudentByUserid(String userid){
        String userId = String.valueOf(redisUtil.getObj(userid));
        ResponseResult responseResult = studentSerivce.selectstudentByUserid(Integer.valueOf(userId));
        return  responseResult;
    }

}
