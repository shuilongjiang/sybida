package com.sy.service;

import com.sy.mapper.SybidaUserMapper;
import com.sy.pojo.SybidaUser;
import com.sy.pojo.SybidaUserExample;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class LoginServiceImp implements LoginService{
    @Override
    public ResponseResult loginpeople(HttpServletRequest request) {
        ResponseResult responseResult=new ResponseResult();
        Integer num1= (Integer)request.getServletContext().getAttribute("num");
        if(null==num1){
            num1=1;
        } else{
        }
        responseResult.setCode(num1);
        return responseResult;
    }
    @Autowired
    SybidaUserMapper sybidaUserMapper;
    @Autowired
    SybidaUserExample example;
    @Override
    public ResponseResult login(HttpServletRequest request,String phone, String psw) {
        ResponseResult responseResult=new ResponseResult();
        Integer num1= (Integer)request.getServletContext().getAttribute("num");
        if(null==num1){
            num1=1;
        } else{
            num1++;
        }
        example.createCriteria().andUserPhoneEqualTo(phone).andUserPasswordEqualTo(psw);
        List<SybidaUser> list=sybidaUserMapper.selectByExample(example);
        if(null!=list&&list.size()>0){
            responseResult.setCode(1);
            request.getSession().setAttribute("userinfo",list);
        }else{
            responseResult.setCode(0);
        }
        request.getServletContext().setAttribute("num",num1);
        responseResult.setData(list);
        return responseResult;
    }
    @Override
    public ResponseResult changePsw(String phone, String vCode) {
        ResponseResult responseResult=new ResponseResult();
        SybidaUserExample sybidaUserExample=new SybidaUserExample();
        SybidaUserExample.Criteria criteria=sybidaUserExample.createCriteria();
        criteria.andUserPhoneEqualTo(phone);
        List<SybidaUser> list=sybidaUserMapper.selectByExample(sybidaUserExample);
        if("1234".equals(vCode)){
            if(null!=list&&list.size()>0){
                SybidaUser sybidaUser=new SybidaUser();
                sybidaUser.setUserPassword("1234");
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
    public ResponseResult changePhone(String phone) {
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

}
