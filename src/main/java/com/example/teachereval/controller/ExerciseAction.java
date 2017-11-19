package com.example.teachereval.controller;

import com.example.teachereval.pojo.Bar;
import com.example.teachereval.pojo.Exercise;
import com.example.teachereval.pojo.TblUser;
import com.example.teachereval.util.Constant;
import com.example.teachereval.util.ScoreStatistics;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/exercise")
public class ExerciseAction {
    @Autowired
    private Bar bar;

    @RequestMapping("getList")
    public Exercise getExercise(String role) {
        if(role.equals("学生")){
            return bar.getRoleList().get(0);
        }else if(role.equals("系主任")){
            return bar.getRoleList().get(1);
        }else if(role.equals("教研组主任")){
            return bar.getRoleList().get(2);
        }else{
            return bar.getRoleList().get(3);
        }
    }

    @RequestMapping("getOne")
    public Exercise getOne(HttpSession session){
        String role=(String)session.getAttribute("rolename");
        if(role.indexOf("学生")>-1){
            return bar.getRoleList().get(0);
        }else if(role.indexOf("系主任")>-1){
            return bar.getRoleList().get(1);
        }else if(role.indexOf("教研组主任")>-1){
            return bar.getRoleList().get(2);
        }else{
            return bar.getRoleList().get(3);
        }
    }

    @RequestMapping("/setScore")
    public void setScore(int claid,int userid,int teacherid,double score){
        ScoreStatistics scoreStatistics=new ScoreStatistics();
        scoreStatistics.setScore(score);
        scoreStatistics.setClaid(claid);
        scoreStatistics.setTeacherid(teacherid);
        Constant.Statistics.put(userid,scoreStatistics);
    }

    /*分数评价逻辑*/
    @RequestMapping("/AddScoreStatistics")
    public boolean AddScoreStatistics(@RequestParam("test[]") List<String> list, int userid, int claid,
                                      HttpSession session){
        double right;
        double score=0;
        Exercise exer;
        String role=(String)session.getAttribute("rolename");
        if(role.indexOf("学生")>-1){
            exer=bar.getRoleList().get(0);
        }else if(role.indexOf("系主任")>-1){
            exer=bar.getRoleList().get(1);
        }else if(role.indexOf("教研组主任")>-1){
            exer=bar.getRoleList().get(2);
        }else{
            exer=bar.getRoleList().get(3);
        }
        right=exer.getRight();
        for(int i=0;i<list.size();i++){
            switch (list.get(i)){
                case "A":score+=1*(Double.valueOf(exer.getExerciseList().get(i).get("value")));break;
                case "B":score+=0.85*(Double.valueOf(exer.getExerciseList().get(i).get("value")));break;
                case "C":score+=0.65*(Double.valueOf(exer.getExerciseList().get(i).get("value")));break;
                case "D":score+=0.45*(Double.valueOf(exer.getExerciseList().get(i).get("value")));break;
            }
        }
        score*=right*100;
        TblUser u=(TblUser)session.getAttribute("userinfo");
        this.setScore(claid,u.getUserid(),userid,score);
        return true;
    }
}