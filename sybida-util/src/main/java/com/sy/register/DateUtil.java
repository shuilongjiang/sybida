package com.sy.register;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static String date2String(Date date, String pattern){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }
    public static String date2String(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date);
    }


    public static Date string2Date(String dateStr, String pattern){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        try {
           Date date1= simpleDateFormat.parse(dateStr);
            java.sql.Date resultStDate = new java.sql.Date(date1.getTime());
            return resultStDate;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static Date string2Date(String dateStr){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
           Date date1= simpleDateFormat.parse(dateStr);
            java.sql.Date resultStDate = new java.sql.Date(date1.getTime());
            return resultStDate;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
