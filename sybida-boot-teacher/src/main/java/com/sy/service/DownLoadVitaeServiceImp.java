package com.sy.service;

import com.sy.vo.ResponseResult;
import com.sy.zipdownload.ZipDownload;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DownLoadVitaeServiceImp implements DownLoadVitaeService{
    @Override
    public String downloadVitaeZip(Map<String , String> map) {
        return ZipDownload.downloadManyFilesToQny(map);
    }
}
