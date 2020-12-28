package com.sy.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.dto.AuditionForTeacher;
import com.sy.dto.OfferForTeacher;
import com.sy.mapper.*;
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
    SybidaStudentMapper sybidaStudentMapper;
    @Autowired
    SybidaUserMapper sybidaUserMapper;
    @Autowired
    SybidaStudyMapper sybidaStudyMapper;

    @Transactional
    @Override
    public ResponseResult selectStudyAspect() {
        ResponseResult responseResult = new ResponseResult();
        List<SybidaStudy> list = sybidaStudyMapper.selectByExample(null);
        if (null != list && list.size() > 0) {
            responseResult.setCode(1);
        } else {
            responseResult.setCode(0);
        }
        List<SybidaStudy> list1 = new ArrayList<>();
        for (int i = 4; i < list.size() ; i++) {
            list1.add(list.get(i));
        }
        responseResult.setData(list1);
        return responseResult;
    }

    @Transactional
    @Override
    public ResponseResult addSybidaOffer(SybidaOffer sybidaOffer) {
        ResponseResult responseResult = new ResponseResult();
        int affectedRows = sybidaOfferMapper.insertSelective(sybidaOffer);
        if (affectedRows > 0) {
            responseResult.setCode(1);
            responseResult.setMessage("成功！");
        } else {
            responseResult.setCode(0);
            responseResult.setMessage("失败!");
        }
        return responseResult;

    }

    @Transactional
    @Override
    public ResponseResult selectpageStudentOffer(int pageSize, int pageNum, int userid) {
        ResponseResult responseResult = new ResponseResult();

        List<OfferForTeacher> list;
        PageHelper.startPage(pageNum, pageSize);

        list = sybidaOfferMapper.selectOfferByOfferStudentIdForTeacher(userid);

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

    @Transactional
    @Override
    public ResponseResult selectStudyBystudyAspect(String studyAspect) {
        ResponseResult responseResult = new ResponseResult();
        SybidaStudyExample sybidaStudyExample = new SybidaStudyExample();
        sybidaStudyExample.createCriteria().andStudyAspectEqualTo(studyAspect);
        List<SybidaStudy> list = sybidaStudyMapper.selectByExample(sybidaStudyExample);
        responseResult.setData(list);
        responseResult.setCode(1);
        responseResult.setMessage("查询成功");
        return responseResult;
    }

    //删除单选简历
    @Transactional
    @Override
    public ResponseResult deleteStudentOffer(Integer deleteOfferId) {
        SybidaOffer sybidaOffer = new SybidaOffer();
        sybidaOffer.setOfferId(deleteOfferId);
        sybidaOffer.setOfferIsexist((byte) 0);
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
            sybidaOffer.setOfferId(list.get(i));
            sybidaOffer.setOfferIsexist((byte) 0);
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
    public ResponseResult updateSybidaOfferIsJob(Integer offerId) {
        SybidaOffer sybidaOffer = new SybidaOffer();
        sybidaOffer.setOfferIsjob((byte) 1);
        SybidaOfferExample sybidaOfferExample = new SybidaOfferExample();
        sybidaOfferExample.createCriteria().andOfferIdEqualTo(offerId);
        int row1 = sybidaOfferMapper.updateByExampleSelective(sybidaOffer, sybidaOfferExample);

        SybidaOffer sybidaOffer1 = sybidaOfferMapper.selectByPrimaryKey(offerId);
        Integer offerStudentId = sybidaOffer1.getOfferStudentId();
        SybidaOffer sybidaOffer2 = new SybidaOffer();
        sybidaOffer2.setOfferPersonisjob((byte) 1);
        SybidaOfferExample sybidaOfferExample2 = new SybidaOfferExample();
        sybidaOfferExample2.createCriteria().andOfferStudentIdEqualTo(offerStudentId);
        int row2 = sybidaOfferMapper.updateByExampleSelective(sybidaOffer2, sybidaOfferExample2);

        ResponseResult responseResult = new ResponseResult();
        if (row2> 0) {
            responseResult.setCode(1);
            responseResult.setMessage("修改成功");
        } else {
            responseResult.setCode(0);
            responseResult.setMessage("修改失败");
        }
        return responseResult;
    }



    @Transactional
    @Override
    public ResponseResult updateSybidaOfferCancelJob(Integer offerId) {
        SybidaOffer sybidaOffer3 = new SybidaOffer();
        sybidaOffer3.setOfferIsjob((byte) 0);
        SybidaOfferExample sybidaOfferExample3 = new SybidaOfferExample();
        sybidaOfferExample3.createCriteria().andOfferIdEqualTo(offerId);
        int row1 = sybidaOfferMapper.updateByExampleSelective(sybidaOffer3, sybidaOfferExample3);

        SybidaOffer sybidaOffer4 = sybidaOfferMapper.selectByPrimaryKey(offerId);
        Integer offerStudentId2 = sybidaOffer4.getOfferStudentId();
        SybidaOffer sybidaOffer5 = new SybidaOffer();
        sybidaOffer5.setOfferPersonisjob((byte) 0);
        SybidaOfferExample sybidaOfferExample4 = new SybidaOfferExample();
        sybidaOfferExample4.createCriteria().andOfferStudentIdEqualTo(offerStudentId2);
        int row2 = sybidaOfferMapper.updateByExampleSelective(sybidaOffer5, sybidaOfferExample4);

        ResponseResult responseResult = new ResponseResult();
        if (row2> 0) {
            responseResult.setCode(1);
            responseResult.setMessage("修改成功");
        } else {
            responseResult.setCode(0);
            responseResult.setMessage("修改失败");
        }
        return responseResult;
    }

}
