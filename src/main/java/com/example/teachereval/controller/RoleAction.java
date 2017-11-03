package com.example.teachereval.controller;

import com.example.teachereval.pojo.TblRole;
import com.example.teachereval.service.RoleService;
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
@RequestMapping("/role")
public class RoleAction {
    @Autowired
    private RoleService roleService;

    @RequestMapping("/getList")
    public List<TblRole> getList(TblRole role){
        Map<String,Object> map = new HashMap<>();

        List<TblRole> pageInfo = roleService.getList(map);
        return pageInfo;
    }

    @RequestMapping("/editRole")
    public TblRole editRole(@Param("json") String json) throws JSONException {
        JSONArray jsonArray = new JSONArray(json);
        Object o=jsonArray.getJSONObject(0).get("roleid");
        if(o.hashCode()!=0){
            TblRole role=new TblRole();
            role.setRoleid((int)jsonArray.getJSONObject(0).get("roleid"));
            role.setRoleName((String)jsonArray.getJSONObject(0).get("roleName"));
            role.setRoleDes((String)jsonArray.getJSONObject(0).get("roleDes"));
            edit(role);
            return role;
        }else{
            TblRole role=new TblRole();
            role.setRoleName((String)jsonArray.getJSONObject(0).get("roleName"));
            role.setRoleDes((String)jsonArray.getJSONObject(0).get("roleDes"));
            add(role);
            return role;
        }
    }

    @RequestMapping("/delete")
    public void delete(String[] ids){
        roleService.delete(ids);
    }

    public void edit(TblRole role){
        roleService.update(role);
    }

    public void add(TblRole role){
        roleService.save(role);
    }
}
