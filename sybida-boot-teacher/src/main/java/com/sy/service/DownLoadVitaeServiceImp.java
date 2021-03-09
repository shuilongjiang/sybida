package com.sy.service;

import com.sy.mapper.SybidaVitaeEvaluateMapper;
import com.sy.pojo.SybidaVitaeEvaluate;
import com.sy.pojo.SybidaVitaeEvaluateExample;
import com.sy.vo.ResponseResult;
import com.sy.zipdownload.ZipDownload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class DownLoadVitaeServiceImp implements DownLoadVitaeService{
    @Override
    public String downloadVitaeZip(Map<String , String> map) {
        return ZipDownload.downloadManyFilesToQny(map);
    }
    @Autowired
    SybidaVitaeEvaluateMapper sybidaVitaeEvaluateMapper;
    @Override

    public ResponseResult selectEvaForVitae(String vitaeId) {
        ResponseResult responseResult=new ResponseResult();
        SybidaVitaeEvaluateExample example =new SybidaVitaeEvaluateExample();
        example.createCriteria().andVitaeEvaluateIdEqualTo(Integer.valueOf(vitaeId));
        List<SybidaVitaeEvaluate> sybidaVitaeEvaluates = sybidaVitaeEvaluateMapper.selectByExample(example);
         if(null!=sybidaVitaeEvaluates&&sybidaVitaeEvaluates.size()>0){
             responseResult.setCode(1);
             responseResult.setData(sybidaVitaeEvaluates.get(0).getVitaeEvaluateComment());
         }else{
             responseResult.setCode(0);
             responseResult.setData("");
         }
        return responseResult;
    }
    @Transactional
    @Override
    public ResponseResult selectComment(String userid) {
        ResponseResult responseResult=new ResponseResult();
        List<SybidaVitaeEvaluate> sybidaVitaeEvaluate=sybidaVitaeEvaluateMapper.selectComment(Integer.valueOf(userid));
        if(null!=sybidaVitaeEvaluate&&sybidaVitaeEvaluate.size()>0){
        responseResult.setMessage(sybidaVitaeEvaluate.get(0).getVitaeEvaluateComment());
        }else{
            responseResult.setMessage("");
        }
        return responseResult;
    }
}
