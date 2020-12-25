package com.sy.inteceptor;


import com.sy.redis.RedisOpsUtil;
import com.sy.redis.RedisUtil;
import org.apache.catalina.Session;
import org.apache.commons.collections4.SplitMapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Autowired
     RedisOpsUtil redisOpsUtil;

    @Autowired
    RedisTemplate<String, Object> redisTemplate;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        System.out.println("token--->"+token );
        if (null != token) {
           Object userId = redisOpsUtil.get(token);
           if(null!=userId){
               redisOpsUtil.expire(token,60);
               return true;
           }else{
               response.getOutputStream().print("-1000");
               return false;
           }

        } else {
//            response.getWriter().write("{message:\"abcdefg\"}");
            response.getOutputStream().print("-1000");
            return false;
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
