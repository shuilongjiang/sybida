package com.sy.controller;

import com.alibaba.fastjson.JSONObject;
import com.qiniu.util.Json;
import com.sy.QNY.Qnyutil;
import com.sy.basepath.BasePath;
import com.sy.pojo.SybidaStudent;
import com.sy.pojo.SybidaVitaeEvaluate;
import com.sy.service.TeacherSerivce;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("teacher")
@RestController
@CrossOrigin
public class TeacherServlet {
    @Autowired
    TeacherSerivce teacherSerivce;
    @Autowired
    ResponseResult responseResult;

    @Transactional
    @RequestMapping("selectpage")
    //按学习方向查询老师的全部信息，并进行分页
    public ResponseResult selectByPage(String pageSize, String pageNum, String teacherStudy) {
        ResponseResult responseResult = teacherSerivce.selectPage(Integer.valueOf(pageSize), Integer.valueOf(pageNum), teacherStudy);
        return responseResult;
    }

    @Transactional
    @RequestMapping("selectStudy")
    //根据学习方向ID查询学习方向的具体内容
    public ResponseResult selectStudy() {
        return teacherSerivce.selectStudy();
    }

    @Transactional
    @RequestMapping("deleteteacher")
    //根据教师ID进行删除教师表，删除用户表，
    public ResponseResult deleteTeacher(Integer deleteTeacherId) {

        return teacherSerivce.deleteTeacher(deleteTeacherId);
    }

    @RequestMapping("deleteallteacher")
    public ResponseResult deleteAllTeacher(@RequestBody List<Integer> list) {
        return teacherSerivce.deleteAllTeacher(list);
    }

    @RequestMapping("selectallvitae")
    public ResponseResult selectAllVitae(String pageSize, String pageNum) {
        int currPage = (null == pageNum) ? 1 : Integer.parseInt(pageNum);
        int pageSizes = (null == pageSize) ? 6 : Integer.parseInt(pageSize);
        ResponseResult responseResult = teacherSerivce.selectAllVitae(pageSizes, currPage);
        return responseResult;
    }

    @RequestMapping("insertvitaeevaluatelevel")
    public ResponseResult insertVitaeEvaluateLevel(String comment, String picUrl, int vitaeId, int studentId) {
        String comments = (null == comment) ? "暂无评价" : comment;
        String picUrls = (null == picUrl) ? "暂无图片" : picUrl;
        SybidaVitaeEvaluate sybidaVitaeEvaluate = new SybidaVitaeEvaluate();
        sybidaVitaeEvaluate.setVitaeEvaluateId(vitaeId);
        sybidaVitaeEvaluate.setVitaeEvaluateComment(comments);
        sybidaVitaeEvaluate.setVitaeEvaluatePicture(picUrls);
        sybidaVitaeEvaluate.setVitaeEvaluateUserId(studentId);
        ResponseResult responseResult = teacherSerivce.insertVitaeEvaluateLevel(sybidaVitaeEvaluate);
        return responseResult;
    }

    @RequestMapping("selectstudentjob")
    public ResponseResult selectStudentJob(String pageSize, String pageNum){
        int currPage = (null == pageNum) ? 1 : Integer.parseInt(pageNum);
        int pageSizes = (null == pageSize) ? 8 : Integer.parseInt(pageSize);
        ResponseResult responseResult = teacherSerivce.selectStudentJob(pageSizes, currPage);
        return responseResult;
    }

    @RequestMapping("selectjobbyid")
    public ResponseResult selectJobByStuId(int id){
        ResponseResult responseResult = teacherSerivce.selectJobByStuId(id);
        return  responseResult;
    }
    @RequestMapping("selectallstudent")
    public ResponseResult selectAllStudent(String pageSize, String pageNum){
        int currPage = (null == pageNum) ? 1 : Integer.parseInt(pageNum);
        int pageSizes = (null == pageSize) ? 6 : Integer.parseInt(pageSize);
        ResponseResult   responseResult = teacherSerivce.selcetAllStudent(pageSizes, currPage);
        return responseResult;
    }

    @RequestMapping("selectstudentbyid")
    public  ResponseResult selectStudentById(int id){
        ResponseResult   responseResult =  teacherSerivce.selcetStudentById(id);
        return  responseResult;
    }

    @RequestMapping(value = "/updatestudentinfo", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult updateInfoStudent(@RequestParam("file") MultipartFile file,SybidaStudent object){
        if (file.isEmpty()) {
        }else{
            Qnyutil.delete(object.getStudentPhoto());
            String photoUrl=Qnyutil.uploadFile(file);
            object.setStudentPhoto(photoUrl);
        }
        ResponseResult responseResult = teacherSerivce.updateInfoStudent(object);
        return responseResult;
    }




}
