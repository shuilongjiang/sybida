package com.sy.mapper;

import com.sy.pojo.StudentInfo;
import com.sy.pojo.SybidaUser;
import com.sy.pojo.SybidaUserExample;
import com.sy.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
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
    StudentInfo selectStuInfo(@Param("UserId")Integer UserId);
}