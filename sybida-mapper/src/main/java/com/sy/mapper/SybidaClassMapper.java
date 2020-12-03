package com.sy.mapper;

import com.sy.pojo.SybidaClass;
import com.sy.pojo.SybidaClassExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SybidaClassMapper {
    int countByExample(SybidaClassExample example);

    int deleteByExample(SybidaClassExample example);

    int deleteByPrimaryKey(Integer classId);

    int insert(SybidaClass record);

    int insertSelective(SybidaClass record);

    List<SybidaClass> selectByExample(SybidaClassExample example);

    SybidaClass selectByPrimaryKey(Integer classId);

    int updateByExampleSelective(@Param("record") SybidaClass record, @Param("example") SybidaClassExample example);

    int updateByExample(@Param("record") SybidaClass record, @Param("example") SybidaClassExample example);

    int updateByPrimaryKeySelective(SybidaClass record);

    int updateByPrimaryKey(SybidaClass record);
}