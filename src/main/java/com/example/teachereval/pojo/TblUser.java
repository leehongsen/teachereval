package com.example.teachereval.pojo;

public class TblUser {
    private Integer userid;

    private Integer claid;

    private String username;

    private String password;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getClaid() {
        return claid;
    }

    public void setClaid(Integer claid) {
        this.claid = claid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}