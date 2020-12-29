package com.sy.service;

import com.sy.Dtt;
import com.sy.mapper.SybidaJobMapper;
import com.sy.pojo.HotList;
import com.sy.redis.RedisOpsUtil;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.DefaultTypedTuple;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


@Service
@CacheConfig(cacheNames="hotpan")
public class HotPanServiceImpl implements HotPanService {
    @Autowired
    SybidaJobMapper sybidaJobMapper;
    @Autowired
    ResponseResult responseResult;
    @Autowired
    RedisOpsUtil redisOpsUtil;
    @Autowired
    RedisTemplate redisTemplate;

    @Cacheable(key="#p0")
    @Override
    public   Set<ZSetOperations.TypedTuple<Object>> selectHotList(String key) {
        List<HotList> listHotList=sybidaJobMapper.selectHotList();
        System.out.println(listHotList);
        //将数据
        Set<ZSetOperations.TypedTuple<Object>> set =new HashSet<ZSetOperations.TypedTuple<Object>>();
        for (int i=0;i<listHotList.size();i++){
//        DefaultTypedTuple<String> p1 = new DefaultTypedTuple<String>(String.valueOf(listHotList.get(i).getStudentName()), Double.valueOf(listHotList.get(i).getJobWeal()));
//        redisTemplate.boundZSetOps("listhot").add(new HashSet<>(Arrays.asList(p1)));

            ZSetOperations.TypedTuple<Object> d=new Dtt<>(String.valueOf(listHotList.get(i).getStudentName()),Double.valueOf(listHotList.get(i).getJobWeal()));
            set.add(d);
        }
     //   redisTemplate.opsForZSet().add("set",set);
        redisTemplate.expire("hotpan::key",6, TimeUnit. MINUTES);
        Set<ZSetOperations.TypedTuple<String>> tuples = redisTemplate.boundZSetOps("hotpan::key").reverseRangeWithScores(0L, 300000L);
        for (ZSetOperations.TypedTuple<String> tuple : tuples) {

        }

        return set;
    }

//    @Cacheable(key="#p0")
//    @Override
//    public String test(String msg){
//        System.out.println("==========test============");
//       return "123";
//    }
}
