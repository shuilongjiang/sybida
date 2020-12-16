package com.sy.controller;

import com.sy.service.ClassInfoService;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("classInfo")
@RestController
@CrossOrigin
public class ClassInfoServlet {
    @Autowired
    ResponseResult responseResult;
    @Autowired
    ClassInfoService classInfoService;
    @RequestMapping("selectPage")
    public ResponseResult selectByPage(String currPage,String pageSize){
        System.out.println(currPage+"====================");
        responseResult=classInfoService.selectAllByPage(Integer.valueOf(currPage),Integer.valueOf(pageSize));
        return responseResult;
    }


}
