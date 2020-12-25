package com.sy.register;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularUtil {
    public static int regularPhone(String name,String phone){
        if ("".equals(name) || name.length()>10){
            return 0;
        }
        String regex = "^1[3|4|5|6|7|8|9]\\d{9}$";
        if(phone.length() != 11){
            System.out.println("手机号应为11位数");
            return 0;
        }else{
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phone);
            boolean isMatch = m.matches();
            if(isMatch){
                System.out.println("您的手机号" + phone + "是正确格式@——@");
            } else {
                System.out.println("您的手机号" + phone + "是错误格式！！！");
                return 0;
            }
        }
        return 1;
    }
}
