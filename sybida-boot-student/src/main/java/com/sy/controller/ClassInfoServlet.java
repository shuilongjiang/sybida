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
    @Transactional
    @RequestMapping("selectPage")
    public ResponseResult selectByPage(String currPage,String pageSize){
        System.out.println(currPage+"====================");
        responseResult=classInfoService.selectAllByPage(Integer.valueOf(currPage),Integer.valueOf(pageSize));
        return responseResult;
    }
    @Transactional
    @RequestMapping("selectClass")
    public List<SybidaClass> selectClass(){
        List<SybidaClass> listClass=classInfoService.selectClass();
        return listClass;
    }
    @Transactional
    @RequestMapping("selectStudy")
    public List<SybidaStudy> selectStudy(){
        List<SybidaStudy> listStudy=classInfoService.selectStudy();
        return listStudy;
    }
    @Transactional
    @RequestMapping("deleteClass")
    public ResponseResult deleteClass(){

        return responseResult;
    }
}
