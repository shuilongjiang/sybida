package com.sy.controller;

import com.sy.mapper.SybidaUserMapper;
import com.sy.pojo.SybidaClass;
import com.sy.pojo.SybidaStudy;
import com.sy.pojo.SybidaTeach;
import com.sy.redis.RedisUtil;
import com.sy.register.DateUtil;
import com.sy.service.ClassInfoService;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RequestMapping("classInfo")
@RestController
@CrossOrigin
public class ClassInfoServlet {
    @Autowired
    ResponseResult responseResult;
    @Autowired
    ClassInfoService classInfoService;
    @Autowired
    RedisUtil redisUtil;
    @RequestMapping("selectPage")
    public ResponseResult selectByPage(String pageNum,String pageSize,String selectClass){
        responseResult=classInfoService.selectAllByPage(Integer.valueOf(pageNum),Integer.valueOf(pageSize), selectClass);
        return responseResult;
    }

    @RequestMapping("selectClass")
    public List<SybidaClass> selectClass(){
        List<SybidaClass> listClass=classInfoService.selectClass();
        return listClass;
    }


    @RequestMapping("deleteClass")
    public ResponseResult deleteClass(String classId){
        return  classInfoService.deleteClass(classId);
    }

    @RequestMapping("selectTeachId")
    public ResponseResult selectTeachId(String teachId){
        return classInfoService.selectTeachId(teachId);
    }

    @RequestMapping("deleteAllClass")
    public ResponseResult deleteAllClass(@RequestBody List<Integer> list) {
        return classInfoService.deleteAllClass(list);
    }

    @RequestMapping("showOneClass")
    public  ResponseResult showOneClass(String classId){
        ResponseResult responseResult=new ResponseResult();
        SybidaClass sybidaClass= classInfoService.showOneClass(classId);
      if (sybidaClass!=null){
          responseResult.setCode(1);
          responseResult.setMessage("查询单个成功");
          responseResult.setData(sybidaClass);
          return responseResult;
      }else {
          responseResult.setCode(0);
          responseResult.setMessage("查询单个失败");
      }
        return  responseResult;
    }



    @RequestMapping("selectTeacherName")
    public ResponseResult selectTeacherName(String classTeachId){
        ResponseResult responseResult=new ResponseResult();
        SybidaTeach sybidaTeach= classInfoService.selectTeacherName(classTeachId);
        if (sybidaTeach!=null){
            responseResult.setCode(1);
            responseResult.setMessage("查询成功");
            responseResult.setData(sybidaTeach);
            return responseResult;
        }else {
            responseResult.setCode(0);
            responseResult.setMessage("查询失败");
        }
        return responseResult;
    }

    @RequestMapping("selectManagerName")
    public ResponseResult selectManagerName(String classManagerId){
        ResponseResult responseResult=new ResponseResult();
        SybidaTeach sybidaTeach= classInfoService.selectTeacherName(classManagerId);
        if (sybidaTeach!=null){
            responseResult.setCode(1);
            responseResult.setMessage("查询成功");
            responseResult.setData(sybidaTeach);
            return responseResult;
        }else {
            responseResult.setCode(0);
            responseResult.setMessage("查询失败");
        }
        return responseResult;
    }

    @RequestMapping("selectStudyName")
    public ResponseResult selectStudyName(String classStudyId){
       SybidaStudy sybidaStudy= classInfoService.selectStudyName(classStudyId);
        if (sybidaStudy!=null){
            responseResult.setCode(1);
            responseResult.setMessage("查询成功");
            responseResult.setData(sybidaStudy);
            return responseResult;
        }else {
            responseResult.setCode(0);
            responseResult.setMessage("查询失败");
        }
        return responseResult;
    }

    @PostMapping("updateclassinfo")
    public ResponseResult updateClassInfo(SybidaClass sybidaClass){
        return   classInfoService.updateClassInfo(sybidaClass);
    }

    @RequestMapping("teacheridfindclass")
    public ResponseResult teacherIdFindClass(String pageSize,String pageNum,String userId){
        System.out.println(pageNum+"//////////////////////////");
        System.out.println(pageSize+"````````````````````````````````````````````````");
        System.out.println(userId+"----------------------------------");
        redisUtil.expire(userId,60);
        String classManagerId = String.valueOf(redisUtil.getObj(userId));
        System.out.println(classManagerId+"================================");
        return  classInfoService.teacherIdFindClass(pageSize,pageNum,classManagerId);
    }

//    @RequestMapping("teacheridfindclass2")
//    public ResponseResult teacherIdFindClass2(String pageSize,String pageNum,String userId){
//        System.out.println(pageNum+"//////////////////////////");
//        System.out.println(pageSize+"````````````````````````````````````````````````");
//        System.out.println(userId+"----------------------------------");
//        redisUtil.expire(userId,60);
//        String classManagerId = String.valueOf(redisUtil.getObj(userId));
//        System.out.println(classManagerId+"================================");
//        return  classInfoService.teacherIdFindClass2(pageSize,pageNum,classManagerId);
//    }

        @RequestMapping("teacheridfindclass2")
    public ResponseResult teacherIdFindClass2(String pageSize,String pageNum,String classId){
        System.out.println(classId+"================================");
        return  classInfoService.teacherIdFindClass2(pageSize,pageNum,classId);
    }

    @RequestMapping("selectteachermuticlass")
    public ResponseResult selectTeacherMutiClass(String userId){
        redisUtil.expire(userId,60);
        String classManagerId = String.valueOf(redisUtil.getObj(userId));
        System.out.println(classManagerId+"999999999999999999999999999999");
        return classInfoService.selectTeacherMutiClass(classManagerId);
    }

}


