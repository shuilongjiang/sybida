package com.sy.mapper;

import com.sy.dto.CompanyAndTeach;
import com.sy.pojo.SybidaCompany;
import com.sy.pojo.SybidaCompanyExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface SybidaCompanyMapper {
    int countByExample(SybidaCompanyExample example);

    int deleteByExample(SybidaCompanyExample example);

    int deleteByPrimaryKey(Integer companyId);

    int insert(SybidaCompany record);

    int insertSelective(SybidaCompany record);

    List<SybidaCompany> selectByExample(SybidaCompanyExample example);

    SybidaCompany selectByPrimaryKey(Integer companyId);

    int updateByExampleSelective(@Param("record") SybidaCompany record, @Param("example") SybidaCompanyExample example);

    int updateByExample(@Param("record") SybidaCompany record, @Param("example") SybidaCompanyExample example);

    int updateByPrimaryKeySelective(SybidaCompany record);

    int updateByPrimaryKey(SybidaCompany record);

    List<CompanyAndTeach>selectCompanyAndTeach();
}