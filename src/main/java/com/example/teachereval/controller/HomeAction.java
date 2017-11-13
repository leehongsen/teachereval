package com.example.teachereval.controller;

import com.example.teachereval.pojo.MenuJson;
import com.example.teachereval.pojo.TblMenu;
import com.example.teachereval.pojo.TblUser;
import com.example.teachereval.pojo.TblUserInfo;
import com.example.teachereval.service.MenuService;
import com.example.teachereval.service.UserService;
import com.example.teachereval.util.Encrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeAction {

    @Autowired
    private UserService userService;
    @Autowired
    private MenuService menuService;

    /*登录*/
    @RequestMapping("/doLogin")
    public String login(TblUser user, HttpSession session){
        user.setPassword(Encrypt.MD5(user.getPassword()));
        TblUser u=userService.login(user);
        if(u!=null){
            session.setAttribute("userinfo",u);
            return "index";
        }
        return "404";
    }

    /*确认用户*/
    @RequestMapping("/docheck")
    @ResponseBody
    public Map<String,String> doCheck(HttpSession session){
        TblUser u=(TblUser)session.getAttribute("userinfo");
        List<TblUserInfo> list=userService.getUserInfo(u.getUserid());
        String role="";
        if(null!=list&&list.size()>0){
            for(TblUserInfo a:list){
                role+=a.getRoleName()+" ";
            }
        }
        Map<String,String> map=new HashMap<>();
        map.put("username",u.getUsername());
        map.put("rolename",role);
        return map;
    }

    /*注册*/
    @RequestMapping("/doRegistered")
    public String registered(TblUser user){
        user.setPassword(Encrypt.MD5(user.getPassword()));
        if(userService.save(user)>0){
            return "login";
        }
        return "404";
    }

    @RequestMapping("/editPassword")
    public String editPassword(){ return "changepassword";}

    @RequestMapping("/doEditPassword")
    @ResponseBody
    public Map<String,String> doEditPassword(String oldPassword,String newPassword,HttpSession session){
        TblUser u=(TblUser)session.getAttribute("userinfo");
        String pass=Encrypt.MD5(oldPassword);
        Map<String ,String> map=new HashMap<String,String>();
        if(u.getPassword().equals(Encrypt.MD5(oldPassword))){
            u.setPassword(Encrypt.MD5(newPassword));
            userService.update(u);
            map.put("statusCode","200");
            map.put("message","修改成功！！");
            return map;
        }
        return null;
    }

    /*注册用户名是否可用，false表示已经被注册*/
    @RequestMapping("/doCheck")  @ResponseBody
    public boolean check(String username){
        TblUser user=userService.selectByUsername(username);
        if(null!=user&&user.getUsername()!=null){
            return false;
        }
        return true;
    }

    @RequestMapping("/getTreeMenu")
    @ResponseBody
    public List<MenuJson> getTreeMenu(HttpSession session){
        //获取原始数据
        TblUser user= (TblUser) session.getAttribute("userinfo");
        List<TblMenu> rootMenu = menuService.loadUserResources(user);

        // 最后的结果
        List<MenuJson> menuList = new ArrayList<MenuJson>();

        // 先找到所有的一级菜单
        for (int i = 0; i < rootMenu.size(); i++) {
            // 一级菜单没有parentId
            if (rootMenu.get(i).getParMen()==0) {
                MenuJson mj=new MenuJson(rootMenu.get(i).getMenid(),rootMenu.get(i).getParMen(),
                        rootMenu.get(i).getMenName(),rootMenu.get(i).getMenUrl());
                menuList.add(mj);
            }
        }

        // 为一级菜单设置子菜单，getChild是递归调用的
        for (MenuJson menu : menuList) {
            menu.setChildren(getChild(menu.getId(), rootMenu));
        }

        return menuList;
    }

    @RequestMapping("/getTotalMenu")
    @ResponseBody
    public List<TblMenu> getTotalMenu(HttpSession session){
        //获取原始数据
        TblUser user= (TblUser) session.getAttribute("userinfo");
        List<TblMenu> rootMenu = menuService.loadUserResources(user);
        List<TblMenu> getTotalMenu=new ArrayList<>();

        // 先找到所有的一级菜单
        for (int i = 0; i < rootMenu.size(); i++) {
            // 一级菜单没有parentId
            if (rootMenu.get(i).getParMen()==0) {
                getTotalMenu.add(rootMenu.get(i));
            }
        }
        return getTotalMenu;
    }

    @RequestMapping("/getOne")
    @ResponseBody
    public List<MenuJson> getOne(MenuJson json,HttpSession session){
        //获取原始数据
        TblUser user= (TblUser) session.getAttribute("userinfo");
        List<TblMenu> rootMenu = menuService.loadUserResources(user);

        // 子菜单
        List<MenuJson> childList = new ArrayList<>();
        for (TblMenu menu : rootMenu) {
            // 遍历所有节点，将父菜单id与传过来的id比较
            if (menu.getParMen()==Integer.valueOf(json.getId().split("m")[1])) {
                MenuJson mj=new MenuJson(menu.getMenid(),menu.getParMen(),
                        menu.getMenName(),menu.getMenUrl());
                childList.add(mj);
            }
        }
        return childList;
    }

    /**
     * 递归算法获取菜单
     * @param id
     * @param rootMenu
     * @return
     */
    private List<MenuJson> getChild(String id, List<TblMenu> rootMenu) {
        // 子菜单
        List<MenuJson> childList = new ArrayList<>();
        for (TblMenu menu : rootMenu) {
            // 遍历所有节点，将父菜单id与传过来的id比较
            if (menu.getParMen()==Integer.valueOf(id.split("m")[1])) {
                MenuJson mj=new MenuJson(menu.getMenid(),menu.getParMen(),
                        menu.getMenName(),menu.getMenUrl());
                childList.add(mj);
            }
        }
        // 递归退出条件
        if(childList.size()!=0){
            // 把子菜单的子菜单再循环一遍
            for (MenuJson jsonMenu : childList) {// 没有url子菜单还有子菜单
                // 递归
                jsonMenu.setChildren(getChild(jsonMenu.getId(), rootMenu));
            }
        }else{
            return null;
        }
        return childList;
    }

    //控制跳转
    @RequestMapping("/toMenu")
    public String toMenu(){ return "view/MenuTable";}
    @RequestMapping("/toUser")
    public String toUser(){ return "view/UserTable";}
    @RequestMapping("/toRole")
    public String toRole(){ return "view/RoleTable";}
    @RequestMapping("/toCourse")
    public String toCourse(){ return "view/CourseTable";}
    @RequestMapping("/toScore")
    public String toScore(){ return "view/ScoreTable";}
    @RequestMapping("/toClass")
    public String toClass(){ return "view/ClassTable";}
}
