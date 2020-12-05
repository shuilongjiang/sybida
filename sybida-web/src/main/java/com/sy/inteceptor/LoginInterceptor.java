package com.sy.inteceptor;

import com.sy.basepath.BasePath;
import com.sy.pojo.UserInfo;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();
        UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");

        System.out.println(userInfo+"{}{}{]");
        if(null == userInfo) {
//            if(userInfo.getIsLoginFirst()==1){
                //第一次登录
                response.sendRedirect(BasePath.localhostPath+"/student/addStudent.html");
//            }
            return false;
        } else{
            response.sendRedirect(BasePath.localhostPath+"/login.html");
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
