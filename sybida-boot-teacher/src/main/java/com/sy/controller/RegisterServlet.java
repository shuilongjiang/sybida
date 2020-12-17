package com.sy.controller;


import com.jptangchina.jxcel.JxcelParser;
import com.sy.pojo.*;
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

     @RequestMapping("registerstu")
     public ResponseResult registerStu() {
          ResponseResult responseResult = new ResponseResult();
          List<RegisterExcel> receive = JxcelParser.parser().parseFromFile(RegisterExcel.class, new File("E:\\youku\\xuesheng.xlsx"));
          System.out.println(receive);
          System.out.println(receive.size());

          return null;
     }

     @RequestMapping("registerstudent")
     public ResponseResult registerStudent(@RequestParam("file") MultipartFile file, PartStudent partStudent) {
          ResponseResult responseResult=new ResponseResult();
          System.out.println(partStudent+"--------------------");
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
         for (int i=0;i<receive.size();i++){
//              int affectedRows = registerService.insertSelective(receive.get(i),partStudent);
         }

          System.out.println(receive);
          System.out.println(receive.size());
               responseResult.setCode(1);
               responseResult.setMessage("转换成功");
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

     }

