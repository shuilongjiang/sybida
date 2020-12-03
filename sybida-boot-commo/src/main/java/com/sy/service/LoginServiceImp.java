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
 @Autowired
 ResponseResult responseResult;
    @Override
    public ResponseResult loginpeople(HttpServletRequest request) {

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

}
