package com.sy.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.mapper.SybidaClassMapper;
import com.sy.mapper.SybidaStudyMapper;
import com.sy.pojo.SybidaClass;
import com.sy.pojo.SybidaStudy;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassInfoServiceImp implements ClassInfoService{
    @Autowired
    SybidaClassMapper sybidaClassMapper;
    @Autowired
    SybidaStudyMapper sybidaStudyMapper;
    @Override
    public ResponseResult selectAllByPage(int currPage, int pageSize) {
        ResponseResult responseResult=new ResponseResult();
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

    @Override
    public List<SybidaClass> selectClass() {
        List<SybidaClass> listClass=sybidaClassMapper.selectByExample(null);
        return listClass;
    }

    @Override
    public List<SybidaStudy> selectStudy() {
        List<SybidaStudy> listStudy= sybidaStudyMapper.selectByExample(null);
        return listStudy;
    }



    @Override
    public ResponseResult deleteClass(String classId) {
          ResponseResult responseResult=new ResponseResult();
        int row= sybidaClassMapper.deleteByPrimaryKey(Integer.valueOf(classId));
        if (row>0){
            responseResult.setCode(1);
            responseResult.setMessage("删除成功");
        }else {
            responseResult.setCode(0);
            responseResult.setMessage("失败");
        }
        return responseResult;
    }
}
