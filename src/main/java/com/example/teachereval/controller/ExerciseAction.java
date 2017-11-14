package com.example.teachereval.controller;

import com.example.teachereval.pojo.Bar;
import com.example.teachereval.pojo.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
}