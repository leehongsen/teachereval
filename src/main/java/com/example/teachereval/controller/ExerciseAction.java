package com.example.teachereval.controller;

import com.example.teachereval.pojo.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercise")
public class ExerciseAction {
    @Autowired
    private Exercise exercise;

    @RequestMapping("getList")
    public Exercise getExercise() {
        return exercise;
    }
}