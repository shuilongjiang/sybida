package com.sy.service;

import com.sy.vo.ResponseResult;

public interface RegisterTeacherService {
   public ResponseResult redistTeacherCheckPhone(String phone);
   public ResponseResult insertTeacher(String phone,String name,Byte studyId);
}
