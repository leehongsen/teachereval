package com.example.teachereval.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "Mybar")
public class Bar {
    private List<Exercise> roleList;

    public List<Exercise> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Exercise> roleList) {
        this.roleList = roleList;
    }
}
