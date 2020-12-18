package com.sy.mapper;

import com.sy.pojo.SybidaNews;
import com.sy.pojo.SybidaNewsAndReceive;
import com.sy.pojo.SybidaNewsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SybidaNewsMapper {
    int countByExample(SybidaNewsExample example);

    int deleteByExample(SybidaNewsExample example);

    int deleteByPrimaryKey(Integer newsId);

    int insert(SybidaNews record);

    int insertSelective(SybidaNews record);

    List<SybidaNews> selectByExample(SybidaNewsExample example);

    SybidaNews selectByPrimaryKey(Integer newsId);

    int updateByExampleSelective(@Param("record") SybidaNews record, @Param("example") SybidaNewsExample example);

    int updateByExample(@Param("record") SybidaNews record, @Param("example") SybidaNewsExample example);

    int updateByPrimaryKeySelective(SybidaNews record);

    int updateByPrimaryKey(SybidaNews record);
    List<SybidaNewsAndReceive> selectNewsAndReceive(Integer receiveId);
    int selectNewsCount(String userId);
}