package com.example.teachereval.controller;

import com.example.teachereval.pojo.TblUser;
import com.example.teachereval.service.MenuService;
import com.example.teachereval.service.UserService;
import com.example.teachereval.util.Encrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class HomeAction {
    @Autowired
    private UserService userService;
    @Autowired
    private MenuService menuService;

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

    @RequestMapping("/doRegistered")
    public String registered(TblUser user){
        user.setPassword(Encrypt.MD5(user.getPassword()));
        if(userService.save(user)>0){
            return "login";
        }
        return "404";
    }

    @RequestMapping("/doCheck")
    @ResponseBody
    public boolean check(String username){
        TblUser user=userService.selectByUsername(username);
        if(null!=user&&user.getUsername()!=null){
            return false;
        }
        return true;
    }
}
