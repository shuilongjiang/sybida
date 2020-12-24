package com.sy.controller;

import com.sy.service.HotPanService;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RequestMapping("hot")
@RestController
@CrossOrigin
public class HotServlet {
    @Autowired
    HotPanService hotPanService;

    @RequestMapping("hotpan")
    public Set<ZSetOperations.TypedTuple<Object>> hotPan(){
   //   ResponseResult responseResult= hotPanService.selectSybidaJob();
   //        redisUtil.expire(userId,60);
   //        String userId = String.valueOf(redisUtil.getObj(userid));
        return hotPanService.selectHotList("key");
    }
//    @RequestMapping("hotpan1")
//    public  String hotPan1(){
//        //   ResponseResult responseResult= hotPanService.selectSybidaJob();
//        //        redisUtil.expire(userId,60);
//        //        String userId = String.valueOf(redisUtil.getObj(userid));
//        hotPanService.test("abc");
//        return "succ";
//    }

}
