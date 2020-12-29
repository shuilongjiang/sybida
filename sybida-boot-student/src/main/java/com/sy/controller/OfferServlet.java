package com.sy.controller;

import com.sy.QNY.Qnyutil;
import com.sy.pojo.SybidaJob;
import com.sy.pojo.SybidaOffer;
import com.sy.pojo.SybidaStudy;
import com.sy.redis.RedisUtil;
import com.sy.service.JobSerivce;
import com.sy.service.OfferSerivce;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@RequestMapping("offer")
@RestController
@CrossOrigin
public class OfferServlet {
    @Autowired
    OfferSerivce offerSerivce;
    @Autowired
    RedisUtil redisUtil;


    @RequestMapping("selectStudyAspect")
    //查询Offer学习方向
    public ResponseResult selectStudyAspect() {

        return  offerSerivce.selectStudyAspect();

    }


    @RequestMapping(value = "/addSybidaOffer",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult addSybidaJob(@RequestParam("file") MultipartFile file, SybidaOffer sybidaoffer){
        if (file.isEmpty()){

        }else {
            String photoUrl = Qnyutil.uploadFile(file);
            sybidaoffer.setOfferPicture(photoUrl);
        }
        ResponseResult responseResult = offerSerivce.addSybidaOffer(sybidaoffer);
        return responseResult;
    }


    //根据学生用户id查Offer记录表并进行分页
    @RequestMapping("selectpageStudentOffer")
    public ResponseResult selectpageStudentOffer(String pageSize, String pageNum,String userid) {
        redisUtil.expire(userid,60);
        String userId = String.valueOf(redisUtil.getObj(userid));
        return  offerSerivce.selectpageStudentOffer(Integer.valueOf(pageSize), Integer.valueOf(pageNum),Integer.valueOf(userId));

    }


    @RequestMapping("selectstudentOfferbyOfferId")
    //按offerid查询学生的offer登记，并进行分页
    public ResponseResult selectstudentOfferbyOfferId(String offerId) {

        return  offerSerivce.selectstudentOfferbyOfferId(Integer.valueOf(offerId));

    }

    @RequestMapping(value = "/updateSybidaOffer",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult updateSybidaOffer(@RequestParam("file") MultipartFile file, SybidaOffer sybidaoffer){
        if (file.isEmpty()){

        }else {
            String photoUrl = Qnyutil.uploadFile(file);
            sybidaoffer.setOfferPicture(photoUrl);
        }
        sybidaoffer.setOfferAlterTime(new Date());
        ResponseResult responseResult = offerSerivce.updateSybidaOffer(sybidaoffer);

        return responseResult;
    }


    @RequestMapping("selectStudyBystudyAspect")
    public ResponseResult selectStudyBystudyAspect(String studyAspect){
        return offerSerivce.selectStudyBystudyAspect(studyAspect);
    }

    @RequestMapping("deleteStudentOffer")
    //根据OfferId删除Offer
    public ResponseResult deleteStudentOffer(Integer deleteOfferId) {

        return offerSerivce.deleteStudentOffer(deleteOfferId);
    }

    @PostMapping("deleteAllStudentOffer")
    public ResponseResult deleteAllStudentOffer(@RequestBody List<Integer> list) {
        return offerSerivce.deleteAllStudentOffer(list);
    }



    @RequestMapping("updateSybidaOfferIsJob")
    public ResponseResult updateSybidaOfferIsJob(String offerId){
        System.out.println(offerId);
        ResponseResult responseResult = offerSerivce.updateSybidaOfferIsJob(Integer.valueOf(offerId));
        return responseResult;
    }

    @RequestMapping("updateSybidaOfferCancelJob")
    public ResponseResult updateSybidaOfferCancelJob(String offerId){
        System.out.println(offerId);
        ResponseResult responseResult = offerSerivce.updateSybidaOfferCancelJob(Integer.valueOf(offerId));
        return responseResult;
    }





}
