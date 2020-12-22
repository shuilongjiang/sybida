package com.sy.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.dto.ShowClassInfo;
import com.sy.mapper.SybidaStudyMapper;
import com.sy.pojo.SybidaClass;
import com.sy.pojo.SybidaClassExample;
import com.sy.pojo.SybidaStudy;
import com.sy.pojo.SybidaStudyExample;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudyInfoServiceImpl implements StudyInfoService{
    @Autowired
    SybidaStudyMapper sybidaStudyMapper;
    @Override
    public ResponseResult selectAllByPage(int pageNum, int pageSize, String selectStudy) {
        ResponseResult responseResult=new ResponseResult();
        List<SybidaStudy> studyList;
        PageHelper.startPage(pageNum,pageSize);
        if ("-1".equals(selectStudy)) {
          studyList=  sybidaStudyMapper.selectByExample(null);
        }else {
          SybidaStudyExample sybidaStudyExample=new SybidaStudyExample();
            SybidaStudyExample.Criteria criteria = sybidaStudyExample.createCriteria();
            criteria.andStudyIdEqualTo(Integer.valueOf(selectStudy));
           studyList= sybidaStudyMapper.selectByExample(sybidaStudyExample);
        }
        PageInfo<SybidaStudy> pageInfo = new PageInfo<>(studyList);
        //设置导航页数
        responseResult.setData(pageInfo);
        return responseResult;
    }

    @Override
    public ResponseResult delecOnetStudy(String studyId) {
        ResponseResult responseResult=new ResponseResult();
       int row= sybidaStudyMapper.deleteByPrimaryKey(Integer.valueOf(studyId));
       if (row==1){
           responseResult.setCode(1);
           responseResult.setMessage("删除单个成功");
           return responseResult;
       }else{
           responseResult.setCode(0);
           responseResult.setMessage("删除单个失败");
       }
        return responseResult;
    }

    @Override
    public ResponseResult deleteAllStudy(List<Integer> list) {
        int row=0;
        ResponseResult responseResult=new ResponseResult();
        for (int i=0;i<list.size();i++){
         row+=sybidaStudyMapper.deleteByPrimaryKey(list.get(i));
        }
        if (row==list.size()){
            responseResult.setCode(1);
            responseResult.setMessage("删除多个成功");
            return responseResult;
        }else {
            responseResult.setCode(0);
            responseResult.setMessage("删除多个失败");
        }

        return responseResult;
    }

    @Override
    public ResponseResult updateStudy(SybidaStudy sybidaStudy) {
        ResponseResult responseResult=new ResponseResult();
      int row=sybidaStudyMapper.updateByPrimaryKeySelective(sybidaStudy);
      if (row==1){
          responseResult.setCode(1);
          responseResult.setMessage("修改成功");
          return responseResult;
      }else {
          responseResult.setCode(0);
          responseResult.setMessage("修改失败");
      }
        return responseResult;
    }


    @Override
    public SybidaStudy showOneStudy(String studyId) {
        System.out.println(studyId+"=================");
     SybidaStudy sybidaStudy= sybidaStudyMapper.selectByPrimaryKey(Integer.valueOf(studyId));

        return sybidaStudy;
    }

}
