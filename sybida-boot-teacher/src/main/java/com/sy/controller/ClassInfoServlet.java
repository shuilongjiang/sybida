package com.sy.controller;

import com.sy.pojo.SybidaClass;
import com.sy.pojo.SybidaStudy;
import com.sy.register.DateUtil;
import com.sy.service.ClassInfoService;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("test")
    public ResponseResult testdate(){
        Date date=new Date();
        String test= DateUtil.date2String(date);
        System.out.println(test+"==============");

        String test2=DateUtil.date2String(date,"yyyy:MM:dd");
        System.out.println(test2+"---------------------------");

        String str="2020-12-11";
        Date test3= DateUtil.string2Date(str);
        System.out.println(test3+"===000000000000000");

        String str2="2020/11/12";
        Date test4=DateUtil.string2Date(str2,"yyyy/MM/dd");
        System.out.println(test4+"````````````````````````````");

        return responseResult;
    }
}


