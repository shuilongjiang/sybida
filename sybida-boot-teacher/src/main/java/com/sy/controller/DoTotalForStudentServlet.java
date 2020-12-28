package com.sy.controller;

import com.sy.dto.LayuiData;
import com.sy.pojo.SybidaUser;
import com.sy.service.DoTotalForStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("dototal")
@RestController
public class DoTotalForStudentServlet {
    @Autowired
    DoTotalForStudentService doTotalForStudentService;
    @RequestMapping("countstudentmessage")
    public LayuiData countStudentMessage(Integer classId){
        return doTotalForStudentService.countStudentMessage(classId);
    }

}
