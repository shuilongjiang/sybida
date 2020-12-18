package com.sy.controller;


import com.jptangchina.jxcel.JxcelParser;
import com.sy.pojo.*;
import com.sy.redis.RedisUtil;
import com.sy.register.IOxlsl;
import com.sy.service.RegisterService;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("register")
@RestController
@CrossOrigin
public class RegisterServlet {
     @Autowired
     RegisterService registerService;
     @Autowired
     RedisUtil redisUtil;



     @RequestMapping("registerstudent")
     public ResponseResult registerStudent(@RequestParam("file") MultipartFile file, PartStudent partStudent) {
          ResponseResult responseResult=new ResponseResult();
          String rdSpeed = null;
          if (!file.isEmpty()) {
               System.out.println("文件上传成功");
          }
          List<RegisterExcel> receive = null;
          try {
               File sb = IOxlsl.file(file);
               receive = JxcelParser.parser().parseFromFile(RegisterExcel.class, sb);

          }catch (Exception e){
               e.printStackTrace();
               responseResult.setCode(0);
               responseResult.setMessage("文件格式不符合要求");
               return responseResult;
          }
          int affectedRows=0;
          int row=0;
         for (int i=0;i<receive.size();i++){
              if (i==0){
                   row=registerService.createClass(partStudent);
              }

               affectedRows += registerService.insertSelective(receive.get(i),partStudent);
         }

         if (affectedRows==receive.size() && row==1){
              responseResult.setCode(1);
              responseResult.setMessage("插入成功");
              return responseResult;
         }else {
              responseResult.setCode(0);
              responseResult.setMessage("插入失败");
         }
           return responseResult;
     }

     @RequestMapping("selectClass")
     public List<SybidaClass> selectClass(){
          List<SybidaClass> listClass=registerService.selectClass();
          return listClass;
     }
     @RequestMapping("selectStudy")
     public List<SybidaStudy> selectStudy(){
          List<SybidaStudy> listStudy=registerService.selectStudy();
          return listStudy;
     }

     @RequestMapping("selectTeacher")
     public List<SybidaTeach> selectTeacher(){
          List<SybidaTeach> listTeacher=registerService.selectTeacher();
          return listTeacher;
     }
     @RequestMapping("getCookValue")
     public ResponseResult getCookValue(String userid){
          ResponseResult responseResult=new ResponseResult();
          String userId = String.valueOf(redisUtil.getObj(userid));
          redisUtil.expire(userId,60);
          if (null==userId){
               responseResult.setCode(0);
               responseResult.setMessage("错误");
               return responseResult;
          }else {
               responseResult.setCode(1);
               responseResult.setMessage("成功");
               responseResult.setData(userId);
               return responseResult;
          }

     }

     @RequestMapping("selectClassName")
     public ResponseResult selectClassName(String className){
          ResponseResult responseResult=new ResponseResult();
        List<SybidaClass> classList= registerService.selectClassName(className);
          if (classList.size()==0){
               responseResult.setCode(1);
               responseResult.setMessage("无重复");
               return  responseResult;
          }else {
               responseResult.setCode(0);
               responseResult.setMessage("有重复");

          }
          return responseResult;
     }

     }

