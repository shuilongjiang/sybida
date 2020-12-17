package com.sy.controller;

import com.sy.service.QnyService;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


@RestController
@RequestMapping("qny")
public class QnyServlet {
    @Autowired
    private QnyService qnyService;
    @RequestMapping("deletemp")
    public  ResponseResult deletemap(String fileKey){
       return qnyService.delete(fileKey);
    }
    @RequestMapping(value = "testUpload", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult uploadImage(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        return qnyService.test(file);
    }
}
