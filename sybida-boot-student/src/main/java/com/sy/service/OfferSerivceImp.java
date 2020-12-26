package com.sy.service;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.dto.AuditionForTeacher;
import com.sy.dto.OfferForTeacher;
import com.sy.mapper.SybidaClassMapper;
import com.sy.mapper.SybidaOfferMapper;
import com.sy.mapper.SybidaStudentMapper;
import com.sy.mapper.SybidaUserMapper;
import com.sy.pojo.*;
import com.sy.redis.RedisOpsUtil;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OfferSerivceImp implements OfferSerivce {

    @Autowired
    SybidaOfferMapper sybidaOfferMapper;
    @Autowired
    RedisOpsUtil redisOpsUtil;

    @Autowired
    SybidaClassMapper sybidaClassMapper;

    @Autowired
    SybidaStudentMapper sybidaStudentMapper;

    @Autowired
    SybidaUserMapper sybidaUserMapper;

    @Transactional
    @Override
    public ResponseResult addSybidaOffer(SybidaOffer sybidaoffer) {
        ResponseResult responseResult = new ResponseResult();
        int affectedRows = sybidaOfferMapper.insertSelective(sybidaoffer);
        if (affectedRows > 0) {
            responseResult.setCode(1);
            responseResult.setMessage("成功！");
        } else {
            responseResult.setCode(0);
            responseResult.setMessage("失败!");
        }
        System.out.println(sybidaoffer+"!!!!!!!!!+++++++++++");
        return responseResult;
    }


    @Override
    public ResponseResult selectpageStudentOffer(int pageSize, int pageNum, int userid) {
        ResponseResult responseResult = new ResponseResult();

        List<OfferForTeacher> list;
        PageHelper.startPage(pageNum, pageSize);

        list = sybidaOfferMapper.selectOfferByofferStudentIdForTeacher(userid);

        PageInfo<OfferForTeacher> pageInfo = new PageInfo<>(list);
        responseResult.setData(pageInfo);
        responseResult.setCode(1);
        responseResult.setMessage("查询成功！");
        return responseResult;
    }



    @Transactional
    @Override
    public ResponseResult selectstudentOfferbyOfferId(int offerId) {
        ResponseResult responseResult = new ResponseResult();
        OfferForTeacher offerForTeacher = sybidaOfferMapper.selectstudentOfferbyOfferId(offerId);
        responseResult.setData(offerForTeacher);
        responseResult.setCode(1);
        responseResult.setMessage("查询成功！");
        System.out.println(responseResult+"====================");
        System.out.println(responseResult.getData().toString());
        return responseResult;
    }


    @Transactional
    @Override
    public ResponseResult updateSybidaOffer(SybidaOffer sybidaOffer){
        ResponseResult responseResult = new ResponseResult();
        int affectedRows = sybidaOfferMapper.updateByPrimaryKeySelective(sybidaOffer);

        if (affectedRows > 0) {
            responseResult.setCode(1);
            responseResult.setMessage("成功！");
        } else {
            responseResult.setCode(0);
            responseResult.setMessage("失败!");
        }
        System.out.println(sybidaOffer);
        return responseResult;
    }



    //删除单选简历
    @Transactional
    @Override
    public ResponseResult deleteStudentOffer(Integer deleteOfferId) {
        SybidaOffer sybidaOffer = new SybidaOffer();
        sybidaOffer.setOfferId(deleteOfferId);
        sybidaOffer.setOfferNull1("0");
        sybidaOffer.setOfferAlterTime(new Date());
        int row = sybidaOfferMapper.updateByPrimaryKeySelective(sybidaOffer);
        ResponseResult responseResult = new ResponseResult();
        if (row > 0) {
            responseResult.setCode(1);
        } else {
            responseResult.setCode(0);

        }
        return responseResult;

    }


    //删除多选简历
    @Transactional
    @Override
    public ResponseResult deleteAllStudentOffer(List<Integer> list) {
        int row = 0;
        for (int i = 0; i < list.size(); i++) {
            SybidaOffer sybidaOffer = new SybidaOffer();

//            System.out.println(list.get(i)+"********....");

            sybidaOffer.setOfferId(list.get(i));
            sybidaOffer.setOfferNull1("0");
            sybidaOffer.setOfferAlterTime(new Date());
            row +=sybidaOfferMapper.updateByPrimaryKeySelective(sybidaOffer);
        }

        ResponseResult responseResult = new ResponseResult();
        if (row == list.size()) {
            responseResult.setCode(1);
        } else {
            responseResult.setCode(0);
        }
        return responseResult;
    }



    @Transactional
    @Override
    public ResponseResult selectPage(int pageSize, int pageNum, String classNum, int userid) {

        ResponseResult responseResult = new ResponseResult();
        List<SybidaStudent> studentList1 = null;
        List<SybidaStudent> studentList2 = new ArrayList<>();
        List<SybidaClass> classlist1 = null;
        List<OfferForTeacher> offerList1 = null;
        List<OfferForTeacher> offerList2 = new ArrayList<>();

        PageHelper.startPage(pageNum, pageSize);


        if ("-1".equals(classNum)) {
            SybidaUser sybidaUser = sybidaUserMapper.selectByPrimaryKey(userid);
            Byte userAuthority = sybidaUser.getUserAuthority();
            if (1 == userAuthority){
                SybidaClassExample sybidaClassExample1 = new SybidaClassExample();
                sybidaClassExample1.createCriteria().andClassTeachIdEqualTo(userid);
                classlist1 = sybidaClassMapper.selectByExample(sybidaClassExample1);

            } else if (0 == userAuthority){
                SybidaClassExample sybidaClassExample2 = new SybidaClassExample();
                sybidaClassExample2.createCriteria().andClassManagerIdEqualTo(userid);
                classlist1 = sybidaClassMapper.selectByExample(sybidaClassExample2);

            }else if (9 == userAuthority){
                classlist1 = sybidaClassMapper.selectByExample(null);
            }


            if (null != classlist1 && classlist1.size() > 0) {
                responseResult.setCode(1);
            } else {
                responseResult.setCode(0);
                return responseResult;
            }


            for (int i = 0; i < classlist1.size(); i++) {
                SybidaStudentExample sybidaStudentExample = new SybidaStudentExample();
                sybidaStudentExample.createCriteria().andStudentClassIdEqualTo(classlist1.get(i).getClassId());
                studentList1 = sybidaStudentMapper.selectByExample(sybidaStudentExample);
                for (int j = 0; j < studentList1.size(); j++) {
                    studentList2.add(studentList1.get(j));
                }
            }


            for (int i = 0; i < studentList2.size(); i++) {
                offerList1 = sybidaOfferMapper.selectOfferByofferStudentIdForTeacher(studentList2.get(i).getStudentId());
                for (int j = 0; j < offerList1.size(); j++) {
                    offerList2.add(offerList1.get(j));
                }
            }



        }else{
            SybidaStudentExample sybidaStudentExample = new SybidaStudentExample();
            sybidaStudentExample.createCriteria().andStudentClassIdEqualTo(Integer.valueOf(classNum));
            studentList1 = sybidaStudentMapper.selectByExample(sybidaStudentExample);

            for (int i = 0; i < studentList1.size(); i++) {
                offerList1 = sybidaOfferMapper.selectOfferByofferStudentIdForTeacher(studentList1.get(i).getStudentId());
                for (int j = 0; j < offerList1.size(); j++) {
                    offerList2.add(offerList1.get(j));
                }
            }


        }


        //手动分页
        //创建Page类
        Page page = new Page(pageNum, pageSize);
//为Page类中的total属性赋值
        int total = offerList2.size();
        page.setTotal(total);
//计算当前需要显示的数据下标起始值
        int startIndex = (pageNum - 1) * pageSize;
        int endIndex = Math.min(startIndex + pageSize,total);
//从链表中截取需要显示的子链表，并加入到Page
        page.addAll(offerList2.subList(startIndex,endIndex));
//以Page创建PageInfo
        PageInfo pageInfo = new PageInfo<>(page);
//将数据传回前端
        responseResult.setData(pageInfo);
        responseResult.setCode(1);
        responseResult.setMessage("查询成功！");
        return responseResult;

    }




}
