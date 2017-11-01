package com.example.teachereval.controller;

import com.example.teachereval.pojo.TblMenu;
import com.example.teachereval.service.MenuService;
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
@RequestMapping("/menu")
public class MenuAction {
    @Autowired
    private MenuService menuService;

    @RequestMapping("/getList")
    public List<TblMenu> getList(TblMenu menu){
        Map<String,Object> map = new HashMap<>();
        if(menu.getMenName()!=""&&null!=menu.getMenName()){
            map.put("search",menu);
        }
        List<TblMenu> pageInfo = menuService.getList(map);
        return pageInfo;
    }

    @RequestMapping("/editMenu")
    public TblMenu editMenu(@Param("json") String json) throws JSONException {
        JSONArray jsonArray = new JSONArray(json);
        if(jsonArray.getJSONObject(0).has("menid")){
            TblMenu menu=new TblMenu();
            menu.setMenid((int)jsonArray.getJSONObject(0).get("menid"));
            menu.setMenName((String)jsonArray.getJSONObject(0).get("menName"));
            menu.setMenDes((String)jsonArray.getJSONObject(0).get("menDes"));
            menu.setParMen((int)jsonArray.getJSONObject(0).get("parMen"));
            menu.setMenUrl((String)jsonArray.getJSONObject(0).get("menUrl"));
            menu.setSort((int)jsonArray.getJSONObject(0).get("sort"));
            edit(menu);
            return menu;
        }else{
            TblMenu menu=new TblMenu();
            menu.setMenName((String)jsonArray.getJSONObject(0).get("menName"));
            menu.setMenDes((String)jsonArray.getJSONObject(0).get("menDes"));
            menu.setParMen((int)jsonArray.getJSONObject(0).get("parMen"));
            menu.setMenUrl((String)jsonArray.getJSONObject(0).get("menUrl"));
            menu.setSort((int)jsonArray.getJSONObject(0).get("sort"));
            add(menu);
            return menu;
        }
    }

    @RequestMapping("/delete")
    public void delete(String[] ids){ menuService.delete(ids);}

    public void edit(TblMenu menu){
        menuService.update(menu);
    }

    public void add(TblMenu menu){ menuService.save(menu);}
}
