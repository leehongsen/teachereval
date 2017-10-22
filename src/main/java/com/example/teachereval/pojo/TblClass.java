package com.example.teachereval.pojo;

public class TblClass {
    private Integer claid;

    private String claName;

    public Integer getClaid() {
        return claid;
    }

    public void setClaid(Integer claid) {
        this.claid = claid;
    }

    public String getClaName() {
        return claName;
    }

    public void setClaName(String claName) {
        this.claName = claName == null ? null : claName.trim();
    }
}