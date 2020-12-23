package com.sy.mapper;

import com.sy.pojo.SybidaCompanyMark;
import com.sy.pojo.SybidaCompanyMarkExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface SybidaCompanyMarkMapper {
    int countByExample(SybidaCompanyMarkExample example);

    int deleteByExample(SybidaCompanyMarkExample example);

    int deleteByPrimaryKey(Integer markId);

    int insert(SybidaCompanyMark record);

    int insertSelective(SybidaCompanyMark record);

    List<SybidaCompanyMark> selectByExample(SybidaCompanyMarkExample example);

    SybidaCompanyMark selectByPrimaryKey(Integer markId);

    int updateByExampleSelective(@Param("record") SybidaCompanyMark record, @Param("example") SybidaCompanyMarkExample example);

    int updateByExample(@Param("record") SybidaCompanyMark record, @Param("example") SybidaCompanyMarkExample example);

    int updateByPrimaryKeySelective(SybidaCompanyMark record);

    int updateByPrimaryKey(SybidaCompanyMark record);
}