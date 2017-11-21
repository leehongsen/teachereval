package com.example.teachereval.controller;

import com.example.teachereval.pojo.*;
import com.example.teachereval.service.MenuService;
import com.example.teachereval.service.RoleService;
import org.apache.ibatis.annotations.Param;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/role")
public class RoleAction {
    @Autowired
    private RoleService roleService;
    @Autowired
    private MenuService menuService;

    @RequestMapping("/getList")
    public List<TblRole> getList(TblRole role){
        Map<String,Object> map = new HashMap<>();

        List<TblRole> pageInfo = roleService.getList(map);
        return pageInfo;
    }

    @RequestMapping("/getAllMenu")
    public List<MenuJson> getAllMenu(String item){
        List<TblMenu> list= menuService.getList(new HashMap<String,Object>());
        // 最后的结果
        List<MenuJson> menuList = new ArrayList<MenuJson>();
        // 先找到所有的一级菜单
        for (int i = 0; i < list.size(); i++) {
            // 一级菜单没有parentId
            if (list.get(i).getParMen()==0) {
                MenuJson mj=new MenuJson(list.get(i).getMenid(),list.get(i).getParMen(),
                        list.get(i).getMenName(),list.get(i).getMenUrl());
                if(null!=item&&item!=""){
                    mj.setTarget();
                }
                menuList.add(mj);
            }
        }

        // 为一级菜单设置子菜单，getChild是递归调用的
        for (MenuJson menu : menuList) {
            if(null!=item&&item!=""){
                menu.setChildren(getChild(menu.getId(),list,true));
            }else{
                menu.setChildren(getChild(menu.getId(),list,false));
            }

        }
        return menuList;
    }

    /**
     * 递归算法获取菜单
     * @param id
     * @param rootMenu
     * @return
     */
    private List<MenuJson> getChild(String id, List<TblMenu> rootMenu,boolean item) {
        // 子菜单
        List<MenuJson> childList = new ArrayList<>();
        for (TblMenu menu : rootMenu) {
            // 遍历所有节点，将父菜单id与传过来的id比较
            if (menu.getParMen()==Integer.valueOf(id.split("m")[1])) {
                MenuJson mj=new MenuJson(menu.getMenid(),menu.getParMen(),
                        menu.getMenName(),menu.getMenUrl());
                if(item){
                    mj.setTarget();
                }
                childList.add(mj);
            }
        }
        // 递归退出条件
        if(childList.size()!=0){
            // 把子菜单的子菜单再循环一遍
            for (MenuJson jsonMenu : childList) {// 没有url子菜单还有子菜单
                // 递归
                jsonMenu.setChildren(getChild(jsonMenu.getId(), rootMenu,item));
            }
        }else{
            return null;
        }
        return childList;
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
    public int delete(int roleid){
        roleService.delete(roleid);
        return roleid;
    }

    public void edit(TblRole role){
        roleService.update(role);
    }

    public void add(TblRole role){
        roleService.save(role);
    }
}
