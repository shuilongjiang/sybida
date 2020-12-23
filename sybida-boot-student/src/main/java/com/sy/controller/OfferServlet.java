package com.sy.controller;


import com.sy.pojo.SybidaAudition;
import com.sy.pojo.SybidaOffer;
import com.sy.redis.RedisUtil;
import com.sy.service.OfferSerivce;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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


    @RequestMapping(value = "/addSybidaOffer",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult addSybidaOffer(SybidaOffer sybidaoffer){
        sybidaoffer.setOfferAlterTime(new Date());
        sybidaoffer.setOfferNull1("1");
        ResponseResult responseResult = offerSerivce.addSybidaOffer(sybidaoffer);
        return responseResult;
    }



    //根据学生用户id查offer记录表表并进行分页
    @RequestMapping("selectpageStudentOffer")
    public ResponseResult selectpageStudentOffer(String pageSize, String pageNum,String userid) {
        redisUtil.expire(userid,60);
        String userId = String.valueOf(redisUtil.getObj(userid));
        return  offerSerivce.selectpageStudentOffer(Integer.valueOf(pageSize), Integer.valueOf(pageNum),Integer.valueOf(userId));

    }




    @Transactional
    @RequestMapping("selectstudentOfferbyOfferId")
    //按offerid查询学生的offer登记，并进行分页
    public ResponseResult selectstudentOfferbyOfferId(String offerId) {

        return  offerSerivce.selectstudentOfferbyOfferId(Integer.valueOf(offerId));

    }



    @RequestMapping(value = "/updateSybidaOffer",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult updateSybidaOffer(SybidaOffer offer){
        offer.setOfferAlterTime(new Date());
        ResponseResult responseResult = offerSerivce.updateSybidaOffer(offer);

        return responseResult;
    }


    @RequestMapping("deleteStudentOffer")
    //根据教师ID进行删除教师表，删除用户表，
    public ResponseResult deleteStudentOffer(Integer deleteOfferId) {

        return offerSerivce.deleteStudentOffer(deleteOfferId);
    }



    @PostMapping("deleteAllStudentOffer")
    public ResponseResult deleteAllStudentOffer(@RequestBody List<Integer> list) {
        return offerSerivce.deleteAllStudentOffer(list);
    }
}
