package com.sy.controller;

import com.sy.redis.RedisUtil;
import com.sy.service.DownLoadVitaeService;
import com.sy.vo.ResponseResult;
import com.sy.zipdownload.ZipDownload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("teacherdownload")
@RestController
public class DownLoadVitaeServlet {
    @Autowired
    RedisUtil redisUtil;
    @Autowired
    DownLoadVitaeService downLoadVitaeService;
    @RequestMapping("downloadvitaezip")
    public String  downloadVitaeZip(){
        String targetPath = "http://qldlxgj0k.hn-bkt.clouddn.com/defaultpicture1.jpg";
        String targetPath1 = "http://qldlxgj0k.hn-bkt.clouddn.com/defaultpicture2.jpg";
        //模拟文件路径下再添加个文件夹，验证穷举
        String targetPath2 = "http://qldlxgj0k.hn-bkt.clouddn.com/defaultpicture3.jpg";
        String targetPath3 = "http://qldlxgj0k.hn-bkt.clouddn.com/defaultpicture1.jpg";
        String targetPath4 = "http://qldlxgj0k.hn-bkt.clouddn.com/cab72ae091fd455cb311175cda743e4c.pdf";
        Map<String ,String> map=new HashMap<>();
        map.put(targetPath,"李军");
        map.put(targetPath1,"李军1");
        map.put(targetPath2,"李军2");
        map.put(targetPath3,"李军3");
        map.put(targetPath4,"李军4");
        String QnyName = downLoadVitaeService.downloadVitaeZip(map);
        redisUtil.setObj("zipdownload::"+QnyName,new Date());
        return QnyName;
    }
}
