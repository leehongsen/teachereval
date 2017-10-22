package com.example.teachereval.pojo;

public class TblCourse {
    private Integer couid;

    private Integer groupid;

    private String couName;

    private String couSem;

    public Integer getCouid() {
        return couid;
    }

    public void setCouid(Integer couid) {
        this.couid = couid;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getCouName() {
        return couName;
    }

    public void setCouName(String couName) {
        this.couName = couName == null ? null : couName.trim();
    }

    public String getCouSem() {
        return couSem;
    }

    public void setCouSem(String couSem) {
        this.couSem = couSem == null ? null : couSem.trim();
    }
}