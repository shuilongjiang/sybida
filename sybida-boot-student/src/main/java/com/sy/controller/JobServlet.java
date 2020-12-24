package com.sy.controller;

import com.sy.QNY.Qnyutil;

import com.sy.pojo.SybidaJob;
import com.sy.redis.RedisUtil;

import com.sy.service.JobSerivce;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@RequestMapping("job")
@RestController
@CrossOrigin
public class JobServlet {
    @Autowired
    JobSerivce jobSerivce;
    @Autowired
    RedisUtil redisUtil;


    @RequestMapping(value = "/addSybidaJob",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult addSybidaJob(@RequestParam("file") MultipartFile file,SybidaJob sybidaJob){
       if (file.isEmpty()){

       }else {
           sybidaJob.setJobAlterTime(new Date());
           String photoUrl = Qnyutil.uploadFile(file);
           sybidaJob.setJobPicture(photoUrl);

       }

        sybidaJob.setJobAlterTime(new Date());
        sybidaJob.setJobNull1("1");
        ResponseResult responseResult = jobSerivce.addSybidaJob(sybidaJob);
        return responseResult;
    }



    @RequestMapping("selectSybidaJobByStudentId")
    @ResponseBody
    public ResponseResult selectSybidaJobByStudentId(Integer jobStudentId){


        return jobSerivce.selectSybidaJobByStudentId(jobStudentId);
    }




    @Transactional
    @RequestMapping("selectstudentJobbyJobStudentId")
    //按userid查询学生的job登记
    public ResponseResult selectstudentJobbyJobStudentId(String userid) {
        redisUtil.expire(userid,60);
        String jobStudentId = String.valueOf(redisUtil.getObj(userid));
        return  jobSerivce.selectstudentJobbyJobStudentId(Integer.valueOf(jobStudentId));

    }



    @RequestMapping(value = "/updateSybidaJob",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult updateSybidaJob(@RequestParam("file") MultipartFile file,SybidaJob sybidaJob){
        if (file.isEmpty()){

        }else {
            sybidaJob.setJobAlterTime(new Date());
            String photoUrl = Qnyutil.uploadFile(file);
            sybidaJob.setJobPicture(photoUrl);

        }

        sybidaJob.setJobAlterTime(new Date());
        ResponseResult responseResult = jobSerivce.updateSybidaJob(sybidaJob);
        return responseResult;
    }


    @RequestMapping("selectpage")
    //按用户id和班级id查询学生的offer登记，并进行分页
    public ResponseResult selectByPageuserid(String pageSize, String pageNum, String classNum,String userid) {
        redisUtil.expire(userid,60);
        String userId = String.valueOf(redisUtil.getObj(userid));
        return  jobSerivce.selectPage(Integer.valueOf(pageSize), Integer.valueOf(pageNum),classNum,Integer.valueOf(userId));

    }


    @RequestMapping("deleteStudentJob")
    //根据教师ID进行删除教师表，删除用户表，
    public ResponseResult deleteStudentJob(Integer deleteJobId) {

        return jobSerivce.deleteStudentJob(deleteJobId);
    }


    @PostMapping("deleteAllStudentJob")
    public ResponseResult deleteAllStudentJob(@RequestBody List<Integer> list) {
        return jobSerivce.deleteAllStudentJob(list);
    }



    @Transactional
    @RequestMapping("selectstudentJobbyJobId")
    //按offerid查询学生的offer登记，并进行分页
    public ResponseResult selectstudentJobbyJobId(String jobId) {

        return  jobSerivce.selectstudentJobbyJobId(Integer.valueOf(jobId));

    }


}
