package com.sy.service;

import com.github.pagehelper.PageHelper;
import com.sy.dto.ClassAndStudent;
import com.sy.mapper.SybidaClassMapper;
import com.sy.mapper.SybidaNewsMapper;
import com.sy.mapper.SybidaReceiveMapper;
import com.sy.mapper.SybidaStudentMapper;
import com.sy.pojo.*;
import com.sy.vo.ResponseResult;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsServiceImp implements NewsService{
    @Autowired
    SybidaNewsMapper sybidaNewsMapper;
    @Autowired
    SybidaReceiveMapper sybidaReceiveMapper;
    @Transactional
    @Override
    public ResponseResult hadSendMessage(String userId,Integer pagesize,Integer pagenum) {
        SybidaNewsExample sybidaNewsExample=new SybidaNewsExample();
        sybidaNewsExample.createCriteria().andNewsUserIdEqualTo(Integer.valueOf(userId)).andNewsNull1EqualTo("1");
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

    @Override
    public ResponseResult receiveMessage(Integer userId, Integer pagesize, Integer pagenum) {
        PageHelper.startPage(pagenum,pagesize);
        List<SybidaNewsAndReceive> list=sybidaNewsMapper.selectNewsAndReceive(userId);
        ResponseResult responseResult = new ResponseResult();
        if(null!=list && list.size()>0){
            responseResult.setCode(list.size());
        }else{
            responseResult.setCode(0);
        }
        responseResult.setData(list);
        return responseResult;
    }

    @Transactional
    @Override
    public ResponseResult messageSendCount(String userId) {
        int row=sybidaNewsMapper.selectNewsCount(userId);
        ResponseResult responseResult=new ResponseResult();
        responseResult.setCode(row);
        return responseResult;
    }

    @Override
    public ResponseResult receiveMessageCount(String userId) {
        int row=sybidaNewsMapper.selectReceiveNewsCount(Integer.valueOf(userId));
        ResponseResult responseResult=new ResponseResult();
        responseResult.setCode(row);
        return responseResult;
    }
    @Transactional
    @Override
    public ResponseResult isRead(String receiveId) {

        int row2=0;
        ResponseResult responseResult=new ResponseResult();
        SybidaReceiveExample sybidaReceiveExample=new SybidaReceiveExample();
        SybidaReceiveExample.Criteria criteria = sybidaReceiveExample.createCriteria();
        criteria.andReceiveIdEqualTo(Integer.valueOf(receiveId));
        SybidaReceive sybidaReceive=new SybidaReceive();
        sybidaReceive.setReceiveIsRead((byte)1);
       int row= sybidaReceiveMapper.updateByExampleSelective(sybidaReceive,sybidaReceiveExample);
       if (row==1){
           SybidaNews sybidaNews2=new SybidaNews();
           SybidaNews sybidaNews= sybidaNewsMapper.selectByPrimaryKey(Integer.valueOf(receiveId));
           num= sybidaNews.getNewsReadPeople();
           num+=1;
           sybidaNews2.setNewsId(Integer.valueOf(receiveId));
           sybidaNews2.setNewsReadPeople(num);
           row2= sybidaNewsMapper.updateByPrimaryKeySelective(sybidaNews2);
       }

       if (row2==1){
           responseResult.setCode(1);
           responseResult.setMessage("成功");
           return responseResult;
       }else {
           responseResult.setCode(0);
           responseResult.setMessage("失败");
       }

      return responseResult;
    }

    @Override
    public ResponseResult delectOneReceive(String receiveId) {
        ResponseResult responseResult=new ResponseResult();
//        SybidaReceiveExample sybidaReceiveExample=new SybidaReceiveExample();
//        SybidaReceiveExample.Criteria criteria = sybidaReceiveExample.createCriteria();
//        criteria.andReceiveIdEqualTo(Integer.valueOf(receiveId));
//       int row= sybidaReceiveMapper.deleteByExample(sybidaReceiveExample);
        SybidaReceiveExample sybidaReceiveExample=new SybidaReceiveExample();
        SybidaReceiveExample.Criteria criteria = sybidaReceiveExample.createCriteria();
        criteria.andReceiveIdEqualTo(Integer.valueOf(receiveId));
        SybidaReceive sybidaReceive=new SybidaReceive();
        sybidaReceive.setReceiveNull1("0");
        int row=sybidaReceiveMapper.updateByExampleSelective(sybidaReceive,sybidaReceiveExample);
       if (row==1){
           responseResult.setCode(1);
           responseResult.setMessage("删除一个成功");
           return responseResult;
       }else {
           responseResult.setCode(1);
           responseResult.setMessage("删除一个失败");
       }
        return responseResult;
    }

    @Override
    public ResponseResult delectOneSend(String newsId) {
        ResponseResult responseResult=new ResponseResult();
//     int row=sybidaNewsMapper.deleteByPrimaryKey(Integer.valueOf(newsId));
        SybidaNews sybidaNews=new SybidaNews();
        sybidaNews.setNewsId(Integer.valueOf(newsId));
        sybidaNews.setNewsNull1("0");
       int row= sybidaNewsMapper.updateByPrimaryKeySelective(sybidaNews);
     if (row==1){
         responseResult.setCode(1);
         responseResult.setMessage("删除发件单个成功");
         return responseResult;
     }else {
         responseResult.setCode(0);
         responseResult.setMessage("删除发件单个失败");
     }
        return responseResult;
    }

    @Override
    public ResponseResult deleteAllNews(List<Integer> list) {
        ResponseResult responseResult=new ResponseResult();
        int row = 0;
        for (int i = 0; i < list.size(); i++) {
            SybidaNews sybidaNews=new SybidaNews();
            sybidaNews.setNewsId(list.get(i));
            sybidaNews.setNewsNull1("0");
            row+=sybidaNewsMapper.updateByPrimaryKeySelective(sybidaNews);
//         row+= sybidaNewsMapper.deleteByPrimaryKey(list.get(i));
        }
        if (row==list.size()){
            responseResult.setCode(1);
            responseResult.setMessage("删除多个成功");
            return responseResult;
        }else {
            responseResult.setCode(0);
            responseResult.setMessage("删除失败成功");
        }
        return responseResult;
    }

    @Override
    public ResponseResult deleteAllReceive(List<Integer> list) {
        ResponseResult responseResult=new ResponseResult();
        int row = 0;
        for (int i = 0; i < list.size(); i++) {
            SybidaReceiveExample sybidaReceiveExample=new SybidaReceiveExample();
            SybidaReceiveExample.Criteria criteria = sybidaReceiveExample.createCriteria();
            criteria.andReceiveIdEqualTo(list.get(i));
            SybidaReceive sybidaReceive=new SybidaReceive();
            sybidaReceive.setReceiveNull1("0");
            row+=sybidaReceiveMapper.updateByExampleSelective(sybidaReceive,sybidaReceiveExample);
//            SybidaReceiveExample sybidaReceiveExample=new SybidaReceiveExample();
//            SybidaReceiveExample.Criteria criteria = sybidaReceiveExample.createCriteria();
//            criteria.andReceiveIdEqualTo(list.get(i));
//            row+= sybidaReceiveMapper.deleteByExample(sybidaReceiveExample);
        }
        if (row==list.size()){
            responseResult.setCode(1);
            responseResult.setMessage("删除多个收信成功");
            return responseResult;
        }else {
            responseResult.setCode(0);
            responseResult.setMessage("删除多个收信失败");
        }
        return responseResult;
    }
    @Autowired
    SybidaClassMapper sybidaClassMapper;
    @Transactional
    @Override
    public List<SybidaClass> selectClass() {
        SybidaClassExample sybidaClassExample=new SybidaClassExample();
        SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
        criteria.andClassNull1EqualTo("1");
        List<SybidaClass> listClass=sybidaClassMapper.selectByExample(sybidaClassExample);
        return listClass;
    }
    @Autowired
    SybidaStudentMapper sybidaStudentMapper;
    @Transactional
    @Override
    public List<ClassAndStudent>selectStudentOfclass(Integer userId,List<SybidaClass> sybidaClasses) {
        List<ClassAndStudent> list=new ArrayList<>();
        for (int i = 0; i <sybidaClasses.size(); i++) {
            ClassAndStudent classAndStudent=new ClassAndStudent();
            classAndStudent.setId(sybidaClasses.get(i).getClassId());
            classAndStudent.setTitle(sybidaClasses.get(i).getClassNum());
            if(sybidaClasses.get(i).getClassTeachId().equals(userId)||sybidaClasses.get(i).getClassManagerId().equals(userId)){
                classAndStudent.setChecked(true);
                classAndStudent.setSpread(true);
            }
            SybidaStudentExample sybidaStudentExample=new SybidaStudentExample();
            sybidaStudentExample.createCriteria().andStudentClassIdEqualTo(sybidaClasses.get(i).getClassId());
            List<SybidaStudent> stuList=sybidaStudentMapper.selectByExample(sybidaStudentExample);
            List<ClassAndStudent> listStu=new ArrayList<>();
            for (int j = 0; j <stuList.size(); j++) {
                ClassAndStudent classAndStudent1=new ClassAndStudent();
                classAndStudent1.setId(stuList.get(j).getStudentId());
                classAndStudent1.setTitle(stuList.get(j).getStudentName());
                listStu.add(classAndStudent1);
            }
            classAndStudent.setChildren(listStu);
            list.add(classAndStudent);
        }
        return list;
    }
}
