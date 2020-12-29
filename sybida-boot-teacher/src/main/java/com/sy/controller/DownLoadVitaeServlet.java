package com.sy.controller;

import com.sy.redis.RedisUtil;
import com.sy.register.DateUtil;
import com.sy.service.DownLoadVitaeService;
import com.sy.vo.ResponseResult;
import com.sy.zipdownload.ZipDownload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("teacherdownload")
@RestController
public class DownLoadVitaeServlet {
    @Autowired
    RedisUtil redisUtil;
    @Autowired
    DownLoadVitaeService downLoadVitaeService;
    @RequestMapping("downloadvitaezip")

    public String  downloadVitaeZip(@RequestBody List<String> list){
        Map<String ,String> map=new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String allanme=list.get(i);
            String FileName=allanme.substring(allanme.indexOf("=")+1)+"工程师";
            String FilePath="http://qldlxgj0k.hn-bkt.clouddn.com/"+allanme.substring(0,allanme.indexOf("="));
            map.put(FilePath,FileName);
        }
       String QnyName = downLoadVitaeService.downloadVitaeZip(map);
       redisUtil.setObj("zipdownload::"+QnyName, DateUtil.date2String(new Date()));
        return QnyName;
    }
    @RequestMapping("selectevaforvitae")
    public ResponseResult selectEvaForVitae(String vitaeId){
        return downLoadVitaeService.selectEvaForVitae(vitaeId);
    }
}
