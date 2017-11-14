package com.example.teachereval.pojo;

import java.util.List;
import java.util.Map;

public class Exercise {
    private String role;
    private double right;
    private List<Map<String,String>> exerciseList;
    private List<Map<String,String>> answerList;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public List<Map<String, String>> getExerciseList() {
        return exerciseList;
    }

    public void setExerciseList(List<Map<String, String>> exerciseList) {
        this.exerciseList = exerciseList;
    }

    public List<Map<String, String>> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Map<String, String>> answerList) {
        this.answerList = answerList;
    }
}