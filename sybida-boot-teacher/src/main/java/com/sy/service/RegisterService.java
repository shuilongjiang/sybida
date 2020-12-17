package com.sy.service;

import com.sy.pojo.*;
import com.sy.vo.ResponseResult;

import java.util.List;

public interface RegisterService {

    List<SybidaClass> selectClass();

    List<SybidaStudy> selectStudy();

    List<SybidaTeach> selectTeacher();

    ResponseResult insertSelective(RegisterExcel record, PartStudent partStudent);
}
