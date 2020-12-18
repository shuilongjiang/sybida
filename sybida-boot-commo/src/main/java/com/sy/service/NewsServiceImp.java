package com.sy.service;

import com.github.pagehelper.PageHelper;
import com.sy.mapper.SybidaNewsMapper;
import com.sy.pojo.SybidaNews;
import com.sy.pojo.SybidaNewsExample;
import com.sy.vo.ResponseResult;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NewsServiceImp implements NewsService{
    @Autowired
    SybidaNewsMapper sybidaNewsMapper;
    @Transactional
    @Override
    public ResponseResult hadSendMessage(String userid,Integer pagesize,Integer pagenum) {
        SybidaNewsExample sybidaNewsExample=new SybidaNewsExample();
        sybidaNewsExample.createCriteria().andNewsUserIdEqualTo(Integer.valueOf(userid));
        PageHelper.startPage(pagenum,pagesize);
        List<SybidaNews> list = sybidaNewsMapper.selectByExample(sybidaNewsExample);
        ResponseResult responseResult = new ResponseResult();
        if(null!=list && list.size()>0){
            responseResult.setCode(list.size());
        }else{
            responseResult.setCode(0);
        }
        responseResult.setData(list);
        return responseResult;
    }
}
