package com.sy.service;

import com.sy.pojo.PartStudent;
import com.sy.pojo.SybidaClass;
import com.sy.pojo.SybidaClassExample;
import com.sy.pojo.SybidaUser;

import java.util.List;

public interface RegisterService {
    int insertSelective(SybidaUser record, PartStudent partStudent);

    List<SybidaClass> selectByExample(SybidaClassExample example);
}
