package com.sy.controller;

import com.alibaba.fastjson.JSONObject;
import com.qiniu.util.Json;
import com.sy.QNY.Qnyutil;
import com.sy.basepath.BasePath;
import com.sy.dto.StudentExcel;
import com.sy.dto.util.ExcelUtil;
import com.sy.pojo.SybidaStudent;
import com.sy.pojo.SybidaTeach;
import com.sy.pojo.SybidaUser;
import com.sy.pojo.SybidaVitaeEvaluate;
import com.sy.redis.RedisUtil;
import com.sy.register.DateUtil;
import com.sy.service.TeacherSerivce;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequestMapping("teacher")
@RestController
@CrossOrigin
public class TeacherServlet {
    @Autowired
    TeacherSerivce teacherSerivce;
    @Autowired
    ResponseResult responseResult;
    @Autowired
    SybidaTeach sybidaTeach;
    @Autowired
    RedisUtil redisUtil;

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
    public ResponseResult selectStudentJob(String pageSize, String pageNum) {
        int currPage = (null == pageNum) ? 1 : Integer.parseInt(pageNum);
        int pageSizes = (null == pageSize) ? 8 : Integer.parseInt(pageSize);
        ResponseResult responseResult = teacherSerivce.selectStudentJob(pageSizes, currPage);
        return responseResult;
    }

    @RequestMapping("selectjobbyid")
    public ResponseResult selectJobByStuId(int id) {
        ResponseResult responseResult = teacherSerivce.selectJobByStuId(id);
        return responseResult;
    }

    @RequestMapping("selectallstudent")
    public ResponseResult selectAllStudent(String pageSize, String pageNum) {
        int currPage = (null == pageNum) ? 1 : Integer.parseInt(pageNum);
        int pageSizes = (null == pageSize) ? 6 : Integer.parseInt(pageSize);
        ResponseResult responseResult = teacherSerivce.selcetAllStudent(pageSizes, currPage);
        return responseResult;
    }

    @RequestMapping("selectstudentbyid")
    public ResponseResult selectStudentById(int id) {
        ResponseResult responseResult = teacherSerivce.selcetStudentById(id);
        return responseResult;
    }

    @RequestMapping(value = "/updatestudentinfo", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult updateInfoStudent(@RequestParam("file") MultipartFile file, SybidaStudent object) {
        object.setStudentAlterTime(new Date());
        if (file.isEmpty()) {
        } else {
            String photoUrl = Qnyutil.uploadFile(file);
            object.setStudentPhoto(photoUrl);
        }
        ResponseResult responseResult = teacherSerivce.updateInfoStudent(object);
        return responseResult;
    }


    @RequestMapping(value = "/updateteacherinfo", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult updateTeacherInfo(@RequestParam("file") MultipartFile file, SybidaTeach object) {
        if (file.isEmpty()) {
        } else {

            String photoUrl = Qnyutil.uploadFile(file);
            object.setTeachPhoto(photoUrl);
        }
        ResponseResult responseResult = teacherSerivce.updateTeacherInfo(object);
        return responseResult;

    }

    @RequestMapping("selectteacherbyid")
    public ResponseResult selectStudentById(String userid) {
        redisUtil.expire(userid, 60);
        String userId = String.valueOf(redisUtil.getObj(userid));
        ResponseResult responseResult = teacherSerivce.selectTeacherById(Integer.valueOf(userId));
        return responseResult;
    }
    @RequestMapping("selectteacherbyidone")
    public ResponseResult selectStudentByIdOne(Integer userid) {

        ResponseResult responseResult = teacherSerivce.selectTeacherById(userid);
        return responseResult;
    }

    @RequestMapping("insertteacher")
    public ResponseResult insertTeacher(String userName, String userPhone, String userPassword, int userNote, Byte userAuthority) {
        SybidaUser sybidaUser = new SybidaUser();
        sybidaUser.setUserName(userName);
        sybidaUser.setUserPhone(userPhone);
        sybidaUser.setUserPassword(userPassword);
        sybidaUser.setUserNote(userNote);
        sybidaUser.setUserAuthority(userAuthority);
        ResponseResult responseResult = teacherSerivce.insertTeacher(sybidaUser);
        System.out.println(sybidaUser);

        if (responseResult.getCode() == 1) {
            SybidaTeach sybidaTeach = new SybidaTeach();
            sybidaTeach.setTeachId(sybidaUser.getUserId());
            sybidaTeach.setTeachName(sybidaUser.getUserName());
            sybidaTeach.setTeachTel(sybidaUser.getUserPhone());
            return teacherSerivce.insertTeachtwo(sybidaTeach);
        }
        return null;
    }

    @RequestMapping("selectstudentclassid")
    public ResponseResult selectStudentByClassId(HttpServletResponse response, String classId) throws IOException {
        ResponseResult responseResult = new ResponseResult();
        List<StudentExcel> list = new ArrayList<>();
        List<SybidaStudent> studentList = teacherSerivce.selectStudentByClassId(classId);
        if (studentList.size() > 0) {
            for (int i = 0; i < studentList.size(); i++) {
                StudentExcel studentExcel = new StudentExcel();
                studentExcel.setStudentId(studentList.get(i).getStudentId());
                studentExcel.setStudentName(studentList.get(i).getStudentName());
                studentExcel.setStudentSex(studentList.get(i).getStudentSex());
                studentExcel.setStudentIdentity(studentList.get(i).getStudentIdentity());
                studentExcel.setStudentIsGraduation(studentList.get(i).getStudentIsGraduation());
                studentExcel.setStudentSchool(studentList.get(i).getStudentSchool());
                studentExcel.setStudentSpecialty(studentList.get(i).getStudentSpecialty());
                studentExcel.setStudentWechat(studentList.get(i).getStudentWechat());
                studentExcel.setStudentMailbox(studentList.get(i).getStudentMailbox());
                studentExcel.setStudentStudyId(studentList.get(i).getStudentStudyId());
                studentExcel.setStudentCity(studentList.get(i).getStudentCity());
                studentExcel.setStudentAddress(studentList.get(i).getStudentAddress());
                studentExcel.setStudentParentPhone(studentList.get(i).getStudentParentPhone());
                studentExcel.setStudentParentName(studentList.get(i).getStudentParentName());
                studentExcel.setStudentUrgent(studentList.get(i).getStudentUrgent());
                studentExcel.setStudentPhone(studentList.get(i).getStudentPhone());
                studentExcel.setStudentClassId(studentList.get(i).getStudentClassId());
                studentExcel.setStudentRoom(studentList.get(i).getStudentRoom());
                studentExcel.setStudentPhoto(studentList.get(i).getStudentPhoto());
                studentExcel.setStudentAlterTime(studentList.get(i).getStudentAlterTime());
                studentExcel.setStudentNull1(studentList.get(i).getStudentNull1());
                studentExcel.setStudentNull2(studentList.get(i).getStudentNull2());
                list.add(studentExcel);
            }
        }

//        response.setContentType("application/vnd.ms-excel;");
//        response.setHeader("Content-Disposition", "attachment;filename=" + "Student.xlsx");
//        ExcelUtil.writeExcel(response, list);
//        System.out.println("能看到我吗===========================");
//        if (studentList.size() > 0) {
//            responseResult.setCode(1);
//            responseResult.setMessage("下载成功");
//            return responseResult;
//        } else {
//            responseResult.setCode(0);
//            responseResult.setMessage("下载失败");
//        }
        if (list.size()>0){
            responseResult.setCode(1);
            responseResult.setMessage("返回集合成功");
            responseResult.setData(list);
            return responseResult;
        }else {
            responseResult.setCode(0);
            responseResult.setMessage("返回集合失败");
        }
       return responseResult;
    }


}




