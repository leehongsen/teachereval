package com.example.teachereval.pojo;

public class TblScoreVo {
    private Integer scoid;

    private Integer claid;

    private Integer userid;

    private Double score;

    private String claName;

    private String username;

    private String couName;

    public Integer getScoid() {
        return scoid;
    }

    public void setScoid(Integer scoid) {
        this.scoid = scoid;
    }

    public Integer getClaid() {
        return claid;
    }

    public void setClaid(Integer claid) {
        this.claid = claid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getClaName() {
        return claName;
    }

    public void setClaName(String claName) {
        this.claName = claName == null ? null : claName.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getCouName() {
        return couName;
    }

    public void setCouName(String couName) {
        this.couName = couName == null ? null : couName.trim();
    }
}