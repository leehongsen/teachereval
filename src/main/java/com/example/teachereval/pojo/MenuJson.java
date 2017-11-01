package com.example.teachereval.pojo;

import java.util.List;

public class MenuJson {
    private String id;
    private String pid;
    private String name;
    private List<MenuJson> children;
    private String url;
    private static String target="navtab";

    public MenuJson(){

    }

    public MenuJson(int id, int pid, String name,  String url) {
        this.id = "m"+id;
        this.pid = "m"+pid;
        this.name = name;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(int id) {
        this.id ="m"+id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = "m"+pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MenuJson> getChildren() {
        return children;
    }

    public void setChildren(List<MenuJson> children) {
        this.children = children;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
