package com.sy.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.mapper.SybidaStudyMapper;
import com.sy.mapper.SybidaTeachMapper;
import com.sy.mapper.SybidaUserMapper;
import com.sy.pojo.SybidaStudy;
import com.sy.pojo.SybidaTeach;
import com.sy.pojo.SybidaTeachExample;
import com.sy.pojo.SybidaUser;
import com.sy.redis.RedisOpsUtil;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherSerivceImp implements TeacherSerivce {
    @Autowired
    SybidaTeachMapper sybidaTeachMapper;
    @Autowired
    SybidaStudyMapper sybidaStudyMapper;
     @Autowired
    RedisOpsUtil redisOpsUtil;
    @Override
    public ResponseResult selectPage(int pageSize, int pageNum,String  teacherStudy1) {
        ResponseResult responseResult=new ResponseResult();


        List<SybidaTeach> list;
        PageHelper.startPage(pageNum,pageSize);
        if ("-1".equals(teacherStudy1)){
            SybidaTeachExample sybidaTeachExample=new SybidaTeachExample();
            SybidaTeachExample.Criteria criteria=sybidaTeachExample.createCriteria();
            criteria.andTeachNull1EqualTo("1");
            list=sybidaTeachMapper.selectByExample(sybidaTeachExample);
        }else {
            SybidaTeachExample sybidaTeachExample=new SybidaTeachExample();
            SybidaTeachExample.Criteria criteria=sybidaTeachExample.createCriteria();
            criteria.andTeachStudyIdEqualTo(Integer.valueOf(teacherStudy1)).andTeachNull1EqualTo("1");
            list = sybidaTeachMapper.selectByExample(sybidaTeachExample);
        }
        PageInfo<SybidaTeach> pageInfo=new PageInfo<>(list);
        for(int i=0;i<list.size();i++){
            Integer id=list.get(i).getTeachStudyId();
            SybidaStudy s = sybidaStudyMapper.selectByPrimaryKey(id);
            list.get(i).setTeachNull2(s.getStudyAspect());
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
        ResponseResult responseResult=new ResponseResult();
        List<SybidaStudy> list=sybidaStudyMapper.selectByExample(null);
        if(null!=list&&list.size()>0){
            responseResult.setCode(1);
        }
        else {
            responseResult.setCode(0);
        }
        List<SybidaStudy> list1=new ArrayList<>();
        list1.add(list.get(0));
        list1.add(list.get(1));
        list1.add(list.get(2));
        list1.add(list.get(3));
        responseResult.setData(list1);
        return responseResult;
    }
    @Autowired
    SybidaUserMapper sybidaUserMapper;
    @Override
    public ResponseResult deleteTeacher(Integer deleteTeacher) {
        sybidaUserMapper.deleteByPrimaryKey(deleteTeacher);
        SybidaTeach sybidaTeach=new SybidaTeach();
        sybidaTeach.setTeachId(deleteTeacher);
        sybidaTeach.setTeachNull1("0");
        int row=sybidaTeachMapper.updateByPrimaryKeySelective(sybidaTeach);
        ResponseResult responseResult=new ResponseResult();
        if(row>0){
            responseResult.setCode(1);
        }else{
            responseResult.setCode(0);

        }        return responseResult;
    }

    @Override
    public ResponseResult deleteAllTeacher(List<Integer> list) {
        int row=0;
        for(int i=0;i<list.size();i++) {
            sybidaUserMapper.deleteByPrimaryKey(list.get(i));
            SybidaTeach sybidaTeach = new SybidaTeach();
            sybidaTeach.setTeachId(list.get(i));
            sybidaTeach.setTeachNull1("0");
            row+= sybidaTeachMapper.updateByPrimaryKeySelective(sybidaTeach);
        }
        ResponseResult responseResult=new ResponseResult();
        if(row==list.size()){
            responseResult.setCode(1);
        }else{
            responseResult.setCode(0);

        }        return responseResult;
    }
}
