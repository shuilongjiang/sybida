package com.sy.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.dto.StudentVitae;
import com.sy.dto.VitaeLevelForTeacher;
import com.sy.mapper.SybidaStudentMapper;
import com.sy.mapper.SybidaUserMapper;
import com.sy.pojo.SybidaClass;
import com.sy.pojo.SybidaStudent;
import com.sy.pojo.SybidaStudentExample;
import com.sy.pojo.SybidaVitae;
import com.sy.redis.RedisOpsUtil;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSerivceImp implements StudentSerivce {

    @Autowired
    SybidaStudentMapper sybidaStudentMapper;
    @Autowired
    SybidaUserMapper sybidaUserMapper;
    @Autowired
    RedisOpsUtil redisOpsUtil;


    @Override
    public ResponseResult selectstudentbyid(int userId) {
        ResponseResult responseResult = new ResponseResult();
        SybidaStudent sybidaStudent = sybidaStudentMapper.selectByPrimaryKey(userId);
        System.out.println(sybidaStudent+"******");
        if (sybidaStudent==null){
            responseResult.setCode(0);
            responseResult.setMessage("查询失败");
        }else {
            responseResult.setData(sybidaStudent);
            responseResult.setCode(1);
            responseResult.setMessage("查询成功");
        }
        return responseResult;
    }

    @Override
    public ResponseResult deleteOneStudent(String studentId) {
        ResponseResult responseResult=new ResponseResult();
      int row=  sybidaUserMapper.deleteByPrimaryKey(Integer.valueOf(studentId));
        SybidaStudent sybidaStudent=new SybidaStudent();
        sybidaStudent.setStudentId(Integer.valueOf(studentId));
        sybidaStudent.setStudentNull2("0");
     int row2= sybidaStudentMapper.updateByPrimaryKeySelective(sybidaStudent);
     if (row==row2){
         responseResult.setCode(1);
         responseResult.setMessage("删除成功");
         return responseResult;
     }else {
         responseResult.setCode(0);
         responseResult.setMessage("删除失败");
     }
        return responseResult;
    }

    @Override
    public ResponseResult deleteAllStudent(List<Integer> list) {
        ResponseResult responseResult =new ResponseResult();
        int row = 0;
        int row2=0;
        for (int i = 0; i < list.size(); i++) {
//        sybidaUserMapper.selectByPrimaryKey(list.get(i));
        SybidaStudent sybidaStudent=new SybidaStudent();
        sybidaStudent.setStudentId(list.get(i));
        sybidaStudent.setStudentNull2("0");
        sybidaStudentMapper.updateByPrimaryKeySelective(sybidaStudent);
        }
        if (list.size()>0){
            responseResult.setCode(1);
            responseResult.setMessage("批量删除成功");
            return responseResult;
        }else {
            responseResult.setCode(0);
            responseResult.setMessage("批量删除成功");
        }
        return responseResult;
    }

    @Override
    public ResponseResult selectStudentByName(String stuName,String classId) {
        ResponseResult responseResult=new ResponseResult();
        SybidaStudentExample sybidaStudentExample=new SybidaStudentExample();
        SybidaStudentExample.Criteria criteria = sybidaStudentExample.createCriteria();
        criteria.andStudentNameEqualTo(stuName);
        criteria.andStudentClassIdEqualTo(Integer.valueOf(classId));
        List<SybidaStudent> studentList= sybidaStudentMapper.selectByExample(sybidaStudentExample);
        if (studentList.size()>0){
            responseResult.setCode(1);
            responseResult.setMessage("查询成功");
            responseResult.setData(studentList);
            return responseResult;
        }else {
            responseResult.setCode(0);
            responseResult.setMessage("查询失败");
        }
        return responseResult;
    }

    @Override
    public ResponseResult selcetStudentVitaeById(int userid) {
        ResponseResult responseResult = new ResponseResult();
        List<StudentVitae> studentVitae = sybidaStudentMapper.selcetStudentVitaeById(userid);
        responseResult.setData(studentVitae);
        responseResult.setCode(1);
        responseResult.setMessage("查询成功");
        return responseResult;
    }

    @Override
    public ResponseResult selectEvaluateByVitaeId(int vitaeId) {
        ResponseResult responseResult = new ResponseResult();
        List<StudentVitae> studentVitaes = sybidaStudentMapper.selectEvaluateByVitaeId(vitaeId);
        System.out.println(studentVitaes);
        if (studentVitaes.size()==0) {
            responseResult.setCode(0);
            responseResult.setMessage("失败");
        } else {
            responseResult.setData(studentVitaes);
            responseResult.setCode(1);
            responseResult.setMessage("成功");
        }
        return responseResult;
    }
}
