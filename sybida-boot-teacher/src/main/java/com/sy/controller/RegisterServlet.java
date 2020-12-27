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
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
          Set<String> set = new HashSet<String>();
          try {
               File sb = IOxlsl.file(file);
               receive = JxcelParser.parser().parseFromFile(RegisterExcel.class, sb);
          }catch (Exception e){
               e.printStackTrace();
               IOxlsl.deleteFile();
               responseResult.setCode(0);
               responseResult.setMessage("文件格式不符合要求");
               return responseResult;
          }

         for(int i=0;i<receive.size();i++){
              set.add(receive.get(i).getPhone());
         }
         if (set.size()==receive.size()){
              try {
                   responseResult=registerService.inserSelectMulTable(receive,partStudent);
              }catch (Exception e){

                   return responseResult;
              }
              return responseResult;
         }else {
              IOxlsl.deleteFile();
              responseResult.setCode(-1);
              responseResult.setMessage("Excel表有中重复的电话号码");
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
     public List<SybidaUser> selectTeacher(){
          List<SybidaUser> userList=registerService.selectTeacher();
          return userList;
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

