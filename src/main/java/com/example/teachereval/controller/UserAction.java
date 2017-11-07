package com.example.teachereval.controller;

import com.example.teachereval.pojo.TblUser;
import com.example.teachereval.pojo.TblUserInfo;
import com.example.teachereval.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserAction {
    @Autowired
    private UserService userService;

    @RequestMapping("/getList")
    public List<TblUserInfo> getList(TblUserInfo user){
        Map<String,Object> map = new HashMap<>();
        if(user.getUsername()!=""&&null!=user.getUsername()){
            map.put("search",user);
        }
        List<TblUserInfo> pageInfo = userService.getList(map);
        return pageInfo;
    }

    @RequestMapping("/editUser")
    public TblUser editUser(@Param("json") String json) throws JSONException {
        JSONArray jsonArray = new JSONArray(json);
        Object o=jsonArray.getJSONObject(0).get("userid");
        if(o.hashCode()!=0){
            TblUser user=new TblUser();
            user.setUserid((int)jsonArray.getJSONObject(0).get("userid"));
            user.setUsername((String)jsonArray.getJSONObject(0).get("username"));
            edit(user);
            return user;
        }else{
            TblUser user=new TblUser();
            user.setUsername((String)jsonArray.getJSONObject(0).get("username"));
            add(user);
            return user;
        }
    }

    @RequestMapping("/delete")
    public int delete(int userid){
        userService.delete(userid);
        return userid;
    }

    public void edit(TblUser user){
        userService.update(user);
    }

    public void add(TblUser user){
        userService.save(user);
    }

}
