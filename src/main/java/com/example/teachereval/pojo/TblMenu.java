package com.example.teachereval.pojo;

import java.util.List;

public class TblMenu {
    private Integer menid;

    private String menName;

    private String menDes;

    private Integer parMen;

    private String menCD;

    private String menUrl;

    private Integer sort;

    private List<TblMenu> childMenus;

    public Integer getMenid() {
        return menid;
    }

    public void setMenid(Integer menid) {
        this.menid = menid;
    }

    public String getMenName() {
        return menName;
    }

    public void setMenName(String menName) {
        this.menName = menName == null ? null : menName.trim();
    }

    public String getMenDes() {
        return menDes;
    }

    public void setMenDes(String menDes) {
        this.menDes = menDes == null ? null : menDes.trim();
    }

    public Integer getParMen() {
        return parMen;
    }

    public void setParMen(Integer parMen) {
        this.parMen = parMen;
    }

    public String getMenCD() {
        return menCD;
    }

    public void setMenCD(String menCD) {
        this.menCD = menCD == null ? null : menCD.trim();
    }

    public String getMenUrl() {
        return menUrl;
    }

    public void setMenUrl(String menUrl) {
        this.menUrl = menUrl == null ? null : menUrl.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public List<TblMenu> getChildMenus() {
        return childMenus;
    }

    public void setChildMenus(List<TblMenu> childMenus) {
        this.childMenus = childMenus;
    }
}