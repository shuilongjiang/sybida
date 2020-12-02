package com.sy.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.mapper.SybidaStudyMapper;
import com.sy.mapper.SybidaTeachMapper;
import com.sy.pojo.SybidaStudy;
import com.sy.pojo.SybidaTeach;
import com.sy.pojo.SybidaTeachExample;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherSerivceImp implements TeacherSerivce {
    @Autowired
    SybidaTeachMapper sybidaTeachMapper;
    @Autowired
    SybidaStudyMapper sybidaStudyMapper;
    @Autowired
    ResponseResult responseResult;
    @Override
    public ResponseResult selectPage(int pageSize, int pageNum,String  teacherStudy1) {

        List<SybidaTeach> list;
        PageHelper.startPage(pageNum,pageSize);
        if ("-1".equals(teacherStudy1)){
            list=sybidaTeachMapper.selectByExample(null);
        }else {
            SybidaTeachExample sybidaTeachExample=new SybidaTeachExample();
            SybidaTeachExample.Criteria criteria=sybidaTeachExample.createCriteria();
            criteria.andTeachStudyIdEqualTo(Integer.valueOf(teacherStudy1));
            System.out.println("++++"+Integer.valueOf(teacherStudy1));
            list = sybidaTeachMapper.selectByExample(sybidaTeachExample);
        }
        PageInfo<SybidaTeach> pageInfo=new PageInfo<>(list);
        for(int i=0;i<list.size();i++){
            Integer id=list.get(i).getTeachStudyId();
            SybidaStudy s = sybidaStudyMapper.selectByPrimaryKey(id);
            list.get(i).setTeachNull1(s.getStudyAspect());
        }
        responseResult.setData(pageInfo);
        responseResult.setCode(1);
        responseResult.setMessage("查询成功！");
        return responseResult;
    }
    @Autowired
    SybidaStudy sybidaStudy;
    @Override
    public ResponseResult selectStudy() {
        List<SybidaStudy> list=sybidaStudyMapper.selectByExample(null);
        if(null!=list&&list.size()>0){
            responseResult.setCode(1);
        }
        else {
            responseResult.setCode(0);
        }responseResult.setData(list);
        return responseResult;
    }
}
