package com.sy.controller;

import com.sy.pojo.SybidaAudition;
import com.sy.pojo.SybidaStudent;
import com.sy.redis.RedisUtil;
import com.sy.service.AuditionSerivce;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequestMapping("audition")
@RestController
@CrossOrigin
public class AuditionServlet {
    @Autowired
    AuditionSerivce auditionSerivce;
    @Autowired
    RedisUtil redisUtil;


    @Transactional
    @RequestMapping("selectClass")
    //根据用户ID查询班级信息
    public ResponseResult selectByClass(String userid) {
//        System.out.println(userid+"=================");
        redisUtil.expire(userid,60);
        String userId = String.valueOf(redisUtil.getObj(userid));
        ResponseResult responseResult = auditionSerivce.selectClass(userId);
        return responseResult;
    }


    @Transactional
    @RequestMapping("selectpage")
    //按用户id和班级id查询学生的面试登记，并进行分页
    public ResponseResult selectByPageuserid(String pageSize, String pageNum, String classNum,String userid) {
        redisUtil.expire(userid,60);
        String userId = String.valueOf(redisUtil.getObj(userid));

        return  auditionSerivce.selectPage(Integer.valueOf(pageSize), Integer.valueOf(pageNum),classNum,Integer.valueOf(userId));

    }

    @Transactional
    @RequestMapping("selectstudentInterviewbyauditionId")
    //按auditionId查询学生的面试登记，并进行分页
    public ResponseResult selectstudentInterviewbyauditionId(String auditionId) {

        return  auditionSerivce.selectstudentInterviewbyauditionId(Integer.valueOf(auditionId));

    }



    @Transactional
    @RequestMapping("selectAllClass")
    //根据用户ID查询班级信息
    public ResponseResult selectAllClass() {
        ResponseResult responseResult = auditionSerivce.selectAllClass();
        return responseResult;
    }


    @Transactional
    @RequestMapping("selectStudentById")
    public ResponseResult selectStudentById(String userid) {
//        System.out.println(userid+"===============");
        redisUtil.expire(userid,60);
        String userId = String.valueOf(redisUtil.getObj(userid));
        ResponseResult responseResult = auditionSerivce.selectStudentById(userId);
        return responseResult;
    }


    @Transactional
    @RequestMapping("selectClassByClassId")
    public ResponseResult selectClassByClassId(String classId) {
        System.out.println(classId);
        ResponseResult responseResult = auditionSerivce.selectClassByClassId(classId);
        return responseResult;
    }




    @RequestMapping(value = "/addSybidaAudition",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult addSybidaAudition(SybidaAudition object){
//        object.setAuditionAlterTime(new Date());
        object.setAuditionAlterTime(new Date());
        object.setAuditionNull1("1");
        ResponseResult responseResult = auditionSerivce.addSybidaAudition(object);

        return responseResult;
    }



    @RequestMapping("deleteStudentAudition")
    //根据教师ID进行删除教师表，删除用户表，
    public ResponseResult deleteStudentAudition(Integer deleteAuditionId) {

        return auditionSerivce.deleteStudentAudition(deleteAuditionId);
    }



    @PostMapping("deleteAllStudentAudition")
    public ResponseResult deleteAllStudentAudition(@RequestBody List<Integer> list) {
        return auditionSerivce.deleteAllStudentAudition(list);
    }



    //根据学生用户id查面试经历表并进行分页
    @RequestMapping("selectpageStudentAudition")
    public ResponseResult selectpageStudentAudition(String pageSize, String pageNum,String userid) {
        redisUtil.expire(userid,60);
        String userId = String.valueOf(redisUtil.getObj(userid));
        return  auditionSerivce.selectpageStudentAudition(Integer.valueOf(pageSize), Integer.valueOf(pageNum),Integer.valueOf(userId));

    }




    @RequestMapping(value = "/updateSybidaAudition",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult updateSybidaAudition(SybidaAudition audition){
        audition.setAuditionAlterTime(new Date());
        ResponseResult responseResult = auditionSerivce.updateSybidaAudition(audition);
        return responseResult;
    }


}
