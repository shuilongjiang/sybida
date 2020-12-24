package com.sy.service;


import com.sy.pojo.SybidaStudent;
import com.sy.vo.ResponseResult;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


public interface StudentSerivce {


    ResponseResult selectstudentbyid(int userId);

    ResponseResult deleteOneStudent(String studentId);

    ResponseResult deleteAllStudent(List<Integer> list);

    ResponseResult selectStudentByName(String stuName,String classId);

    ResponseResult selcetStudentVitaeById(int userid);

}
