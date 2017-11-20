package com.example.teachereval.util;

public class LetAdd {
    private Double score;
    private int add;

    public LetAdd(){

    }

    public LetAdd(Double score, int add) {
        this.score = score;
        this.add = add;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public int getAdd() {
        return add;
    }

    public void setAdd(int add) {
        this.add = add;
    }
}
