package com.sy.service;

import com.sy.MD5.MD5Utils;
import com.sy.mapper.SybidaUserMapper;
import com.sy.pojo.SybidaUser;
import com.sy.pojo.SybidaUserExample;
import com.sy.pojo.UserInfo;
import com.sy.redis.RedisOpsUtil;
import com.sy.redis.RedisUtil;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.concurrent.TimeUnit;

@CacheConfig(cacheNames ="userid")
@Service
public class LoginServiceImp implements LoginService{
    @Autowired
    RedisUtil redisUtil;
    @Override
    public ResponseResult loginpeople(HttpServletRequest request) {
        ResponseResult responseResult=new ResponseResult();
        responseResult.setCode(redisUtil.count("userid::*"));
        return responseResult;
    }
    @Autowired
    SybidaUserMapper sybidaUserMapper;
    @Autowired
    RedisOpsUtil redisOpsUtil;
    @Override
    public ResponseResult login(HttpServletRequest request,String phone, String psw) {
        ResponseResult responseResult=new ResponseResult();
        SybidaUserExample example=new SybidaUserExample();
        example.createCriteria().andUserPhoneEqualTo(phone).andUserPasswordEqualTo(psw);
        List<SybidaUser> list=sybidaUserMapper.selectByExample(example);
        if(null!=list&&list.size()>0){
            responseResult.setCode(1);
            String id= String.valueOf(list.get(0).getUserId());
            redisOpsUtil.set("userid::"+MD5Utils.encrypt(id),id,60);
            list.get(0).setUserNull2("userid::"+MD5Utils.encrypt(id));
            responseResult.setMessage(String.valueOf(list.get(0).getUserNote()));
        }else{
            responseResult.setCode(0);
        }
        responseResult.setData(list);
        return responseResult;
    }
    @Override
    public ResponseResult resetPsw(String phone, String vCode) {
        ResponseResult responseResult=new ResponseResult();
        SybidaUserExample sybidaUserExample=new SybidaUserExample();
        SybidaUserExample.Criteria criteria=sybidaUserExample.createCriteria();
        criteria.andUserPhoneEqualTo(phone);
        List<SybidaUser> list=sybidaUserMapper.selectByExample(sybidaUserExample);
        if("1234".equals(vCode)){
            if(null!=list&&list.size()>0){
                SybidaUser sybidaUser=new SybidaUser();
                sybidaUser.setUserPassword("1234");
                sybidaUser.setUserNote(1);
                SybidaUserExample sybidaUserExample1=new SybidaUserExample();
                SybidaUserExample.Criteria criteria1=sybidaUserExample1.createCriteria();
                criteria1.andUserPhoneEqualTo(phone);
                int row=sybidaUserMapper.updateByExampleSelective(sybidaUser,sybidaUserExample1);
                responseResult.setCode(2);
            }else{
                responseResult.setCode(1);
            }
        } else{
            responseResult.setCode(0);
        }
        return responseResult;
    }
    @Override
    public ResponseResult checkPhone(String phone) {
        ResponseResult responseResult=new ResponseResult();
        SybidaUserExample sybidaUserExample=new SybidaUserExample();
        SybidaUserExample.Criteria criteria=sybidaUserExample.createCriteria();
        criteria.andUserPhoneEqualTo(phone);
        List<SybidaUser> list=sybidaUserMapper.selectByExample(sybidaUserExample);
        if(null!=list&&list.size()>0){
            responseResult.setCode(1);
        }   else{
            responseResult.setCode(0);
        }
        return responseResult;
    }
    @Override
    public ResponseResult changePsd(String userId, String psd) {
        ResponseResult responseResult=new ResponseResult();
        SybidaUser sybidaUser=new SybidaUser();
        sybidaUser.setUserPassword(psd);
        sybidaUser.setUserNote(0);
        SybidaUserExample sybidaUserExample=new SybidaUserExample();
        sybidaUserExample.createCriteria().andUserIdEqualTo(Integer.parseInt(String.valueOf(redisOpsUtil.get(userId))));
        redisOpsUtil.expire(userId,60);
        int row=sybidaUserMapper.updateByExampleSelective(sybidaUser,sybidaUserExample);
       if(row>0){
           responseResult.setCode(1);
       }   else{
           responseResult.setCode(0);
       }
        return responseResult;
    }
    @Override
    public void exitLogin(String userid) {
        redisUtil.del(userid);
    }
}
