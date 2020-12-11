package com.sy.inteceptor;

import com.sy.basepath.BasePath;
import com.sy.pojo.UserInfo;
import com.sy.redis.RedisOpsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Autowired
    RedisOpsUtil redisOpsUtil;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

//        Cookie[] cookies = request.getCookies();
//        System.out.println("==========redis"+redisOpsUtil.get(cookies[0].getName()));
//        System.out.println(cookies[0].getValue());
        //        String[] strings = new String[]{
//                "*****",
//                "*********"
//        };
//
//        for (String str : strings){
//            if (str.equals(request.getServletPath())){
//                //业务
//                String userId = request.getParameter("userId");
//                if (userId==null){
//                    return false;
//                }
//            }
//        }
      return true;



//            if(userInfo.getIsLoginFirst()==1){
                //第一次登录
//                response.sendRedirect(BasePath.localhostPath+"/student/addStudent.html");
//            }
//            return false;
//
//            response.sendRedirect(BasePath.localhostPath+"/login.html");
//            return false;
//        }


    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
