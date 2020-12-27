package com.sy.service;

import com.sy.pojo.*;
import com.sy.vo.ResponseResult;

import java.util.List;

public interface RegisterService {

    List<SybidaClass> selectClass();

    List<SybidaStudy> selectStudy();

    List<SybidaUser> selectTeacher();

    ResponseResult inserSelectMulTable(List<RegisterExcel> registerExcels,PartStudent partStudent) throws Exception;

    List<SybidaClass> selectClassName(String name);
}
