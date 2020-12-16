package com.sy.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.dto.VitaeLevelForTeacher;
import com.sy.mapper.SybidaClassMapper;
import com.sy.mapper.SybidaStudentMapper;
import com.sy.pojo.SybidaClass;
import com.sy.pojo.SybidaStudent;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassInfoServiceImp implements ClassInfoService{
    @Autowired
    SybidaClassMapper sybidaClassMapper;
    @Autowired
    ResponseResult responseResult;
    @Autowired
    SybidaStudentMapper sybidaStudentMapper;
    @Override
    public ResponseResult selectAllByPage(int currPage, int pageSize) {

        PageHelper.startPage(currPage,pageSize);
        List<SybidaClass> classList= sybidaClassMapper.selectByExample(null);
        PageInfo<SybidaClass> pageInfo=new PageInfo<>(classList);
        //设置导航页数
        responseResult.setData(pageInfo);
        return responseResult;
    }

    @Override
    public ResponseResult selectByclassName(String className) {
        return null;
    }


}
