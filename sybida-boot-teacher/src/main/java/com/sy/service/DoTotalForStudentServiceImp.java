package com.sy.service;

import com.sy.dto.LayuiData;
import com.sy.dto.SybidaStudentTotal;
import com.sy.mapper.*;
import com.sy.pojo.SybidaAuditionExample;
import com.sy.pojo.SybidaStudent;
import com.sy.pojo.SybidaVitaeExample;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DoTotalForStudentServiceImp implements DoTotalForStudentService {
    @Autowired
    SybidaStudentMapper sybidaStudentMapper;
    @Autowired
    SybidaVitaeMapper sybidaVitaeMapper;
    @Autowired
    SybidaVitaeEvaluateMapper sybidaVitaeEvaluateMapper;
    @Autowired
    SybidaOfferMapper sybidaOfferMapper;
    @Autowired
    SybidaAuditionMapper sybidaAuditionMapper;
    @Transactional
    @Override
    public LayuiData countStudentMessage(Integer classId) {
        LayuiData layuiData=new LayuiData();
        //根据班级ID查询当前班级的学生ID,姓名,学生的级别；
        List<SybidaStudentTotal> sybidaStudentTotals = sybidaStudentMapper.selectByIdList(classId);
        layuiData.setCount(sybidaStudentTotals.size());
        //根据学生ID的集合对简历上传次数查询
        //根据学生ID的集合对简历被评价次数查询
        //根据学生ID的集合对offer个数查询
        //根据学生ID的集合对学生是否就业查询

        for (int i = 0; i < sybidaStudentTotals.size(); i++) {
            sybidaStudentTotals.get(i).setNum(i + 1);
            Integer stuid = sybidaStudentTotals.get(i).getStudentId();
            Integer isJob = sybidaOfferMapper.selectisJobNumByStudentId(stuid);
            if (isJob == 0) {
                sybidaStudentTotals.get(i).setHaveJob("未就业");
            } else {
                sybidaStudentTotals.get(i).setHaveJob("已就业");
            }

            Integer offerNum = sybidaOfferMapper.selectOfferNumByStudentId(stuid);
            sybidaStudentTotals.get(i).setOfferNum(offerNum);
            SybidaVitaeExample example = new SybidaVitaeExample();
            example.createCriteria().andVitaeStudentIdEqualTo(stuid);
            sybidaStudentTotals.get(i).setUploadNum(sybidaVitaeMapper.countByExample(example));
            SybidaAuditionExample sybidaAuditionExample = new SybidaAuditionExample();
            sybidaAuditionExample.createCriteria().andAuditionStudentIdEqualTo(stuid);
            sybidaStudentTotals.get(i).setAuditionNum(sybidaAuditionMapper.countByExample(sybidaAuditionExample));
        }
        layuiData.setData(sybidaStudentTotals);
        return layuiData;
    }
}
