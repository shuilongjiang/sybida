package com.sy.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.dto.AuditionForTeacher;
import com.sy.dto.OfferForTeacher;
import com.sy.mapper.SybidaOfferMapper;
import com.sy.pojo.SybidaAudition;
import com.sy.pojo.SybidaOffer;
import com.sy.redis.RedisOpsUtil;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class OfferSerivceImp implements OfferSerivce {

    @Autowired
    SybidaOfferMapper sybidaOfferMapper;
    @Autowired
    RedisOpsUtil redisOpsUtil;


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

        list = sybidaOfferMapper.selectAuditionByofferStudentIdForTeacher(userid);

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





}
