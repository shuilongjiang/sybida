package com.sy.mapper;

import com.sy.pojo.SybidaOffer;
import com.sy.pojo.SybidaOfferExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SybidaOfferMapper {
    int countByExample(SybidaOfferExample example);

    int deleteByExample(SybidaOfferExample example);

    int deleteByPrimaryKey(Integer offerId);

    int insert(SybidaOffer record);

    int insertSelective(SybidaOffer record);

    List<SybidaOffer> selectByExample(SybidaOfferExample example);

    SybidaOffer selectByPrimaryKey(Integer offerId);

    int updateByExampleSelective(@Param("record") SybidaOffer record, @Param("example") SybidaOfferExample example);

    int updateByExample(@Param("record") SybidaOffer record, @Param("example") SybidaOfferExample example);

    int updateByPrimaryKeySelective(SybidaOffer record);

    int updateByPrimaryKey(SybidaOffer record);
}