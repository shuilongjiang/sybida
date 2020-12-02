package com.sy.mapper;

import com.sy.pojo.SybidaUser;
import com.sy.pojo.SybidaUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SybidaUserMapper {
    int countByExample(SybidaUserExample example);

    int deleteByExample(SybidaUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(SybidaUser record);

    int insertSelective(SybidaUser record);

    List<SybidaUser> selectByExample(SybidaUserExample example);

    SybidaUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") SybidaUser record, @Param("example") SybidaUserExample example);

    int updateByExample(@Param("record") SybidaUser record, @Param("example") SybidaUserExample example);

    int updateByPrimaryKeySelective(SybidaUser record);

    int updateByPrimaryKey(SybidaUser record);
}