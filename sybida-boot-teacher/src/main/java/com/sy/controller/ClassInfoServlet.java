package com.sy.controller;

import com.sy.pojo.SybidaClass;
import com.sy.pojo.SybidaStudy;
import com.sy.service.ClassInfoService;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        System.out.println(pageNum+"====================");
        responseResult=classInfoService.selectAllByPage(Integer.valueOf(pageNum),Integer.valueOf(pageSize), selectClass);
        return responseResult;
    }

    @RequestMapping("selectClass")
    public List<SybidaClass> selectClass(){
        List<SybidaClass> listClass=classInfoService.selectClass();
        return listClass;
    }
//    @Transactional
//    @RequestMapping("selectStudy")
//    public List<SybidaStudy> selectStudy(){
//        List<SybidaStudy> listStudy=classInfoService.selectStudy();
//        return listStudy;
//    }

    @RequestMapping("deleteClass")
    public ResponseResult deleteClass(){

        return responseResult;
    }

    @RequestMapping("selectTeachId")
    public ResponseResult selectTeachId(String teachId){
        return classInfoService.selectTeachId(teachId);
    }
}
