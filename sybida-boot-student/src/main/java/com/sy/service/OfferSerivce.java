package com.sy.service;


import com.sy.pojo.SybidaJob;
import com.sy.pojo.SybidaOffer;
import com.sy.vo.ResponseResult;

import java.util.List;


public interface OfferSerivce {
    ResponseResult selectStudyAspect();
    ResponseResult addSybidaOffer(SybidaOffer sybidaoffer);
    ResponseResult selectpageStudentOffer(int pageSize, int pageNum,int userid);
    ResponseResult selectstudentOfferbyOfferId(int offerId);
    ResponseResult updateSybidaOffer(SybidaOffer sybidaOffer);
    ResponseResult selectStudyBystudyAspect(String studyAspect);
    ResponseResult deleteStudentOffer (Integer deleteOfferId);
    ResponseResult deleteAllStudentOffer(List<Integer> list);
    ResponseResult updateSybidaOfferIsJob(Integer offerId);
    ResponseResult updateSybidaOfferCancelJob(Integer offerId);
}
