package com.sy.controller;

import com.sy.mapper.SybidaStudyMapper;
import com.sy.pojo.SybidaClass;
import com.sy.pojo.SybidaStudy;
import com.sy.service.StudyInfoService;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("studyInfo")
@RestController
@CrossOrigin
public class StudyInfoServlet {
    @Autowired
    ResponseResult responseResult;
    @Autowired
    StudyInfoService studyInfoService;

    @RequestMapping("selectPage")
    public ResponseResult selectByPage(String pageNum, String pageSize, String selectStudy){
        System.out.println(pageNum+"=====================");
        System.out.println(pageSize+"=====================");
        System.out.println(selectStudy+"=====================");
        responseResult=studyInfoService.selectAllByPage(Integer.valueOf(pageNum),Integer.valueOf(pageSize), selectStudy);
        return responseResult;
    }
    @RequestMapping("deleteStudyId")
    public ResponseResult delecOnetStudy(String studyId){
        return  studyInfoService.delecOnetStudy(studyId);
    }

    @RequestMapping("deleteallstudy")
    public ResponseResult deleteAllStudy(@RequestBody List<Integer> list){
        return  studyInfoService.deleteAllStudy(list);
    }
    @RequestMapping("showonestudy")
    public ResponseResult showOneStudy(String studyId){
      SybidaStudy sybidaStudy= studyInfoService.showOneStudy(studyId);
        ResponseResult responseResult=new ResponseResult();
        if (sybidaStudy !=null){
            responseResult.setCode(1);
            responseResult.setMessage("查询单个学习方向成功");
            responseResult.setData(sybidaStudy);
            return responseResult;
        }else {
            responseResult.setCode(0);
            responseResult.setMessage("查询失败");
        }
        return responseResult;
    }

    @RequestMapping("updatestudy")
    public ResponseResult updateStudy(SybidaStudy sybidaStudy){
      return studyInfoService.updateStudy(sybidaStudy);
    }
}
