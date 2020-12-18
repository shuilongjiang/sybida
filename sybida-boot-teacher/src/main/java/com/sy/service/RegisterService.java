package com.sy.service;

import com.sy.pojo.*;
import com.sy.vo.ResponseResult;

import java.util.List;

public interface RegisterService {

    List<SybidaClass> selectClass();

    List<SybidaStudy> selectStudy();

    List<SybidaTeach> selectTeacher();

    int insertSelective(RegisterExcel record, PartStudent partStudent);

    ResponseResult inserSelectMulTable(List<RegisterExcel> registerExcels,PartStudent partStudent) throws Exception;

    int createClass(PartStudent partStudent);

    List<SybidaClass> selectClassName(String name);
}
