package com.sy.service;


import com.sy.pojo.SybidaAudition;
import com.sy.pojo.SybidaOffer;
import com.sy.vo.ResponseResult;

import java.util.List;


public interface OfferSerivce {


    ResponseResult addSybidaOffer(SybidaOffer sybidaoffer);

    ResponseResult selectpageStudentOffer(int pageSize, int pageNum,int userid);


    ResponseResult selectstudentOfferbyOfferId(int offerId);


    ResponseResult updateSybidaOffer(SybidaOffer sybidaOffer);



    ResponseResult deleteStudentOffer (Integer deleteOfferId);

    ResponseResult deleteAllStudentOffer(List<Integer> list);


    ResponseResult selectPage(int pageSize, int pageNum, String classNum,int userid);

}
