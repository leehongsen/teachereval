package com.example.teachereval.controller;

import com.example.teachereval.pojo.MenuJson;
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

    @RequestMapping("/getAll")
    public List<MenuJson> getAll(){
        return menuService.getAll();
    }

    @RequestMapping("/editMenu")
    public TblMenu editMenu(@Param("json") String json) throws JSONException {
        JSONArray jsonArray = new JSONArray(json);
        Object o=jsonArray.getJSONObject(0).get("id");
        TblMenu menu=new TblMenu();
        String pidString=(String)jsonArray.getJSONObject(0).get("pid");
        String pid=pidString.split("m")[1];
        Object b=jsonArray.getJSONObject(0).get("url");
        if(b.toString()!="null"){
            menu.setMenUrl((String)jsonArray.getJSONObject(0).get("url"));
        }
        if(o.hashCode()!=0){
            String idString=(String)jsonArray.getJSONObject(0).get("id");
            String id=idString.split("m")[1];
            menu.setMenid(Integer.valueOf(id));
            menu.setParMen(Integer.valueOf(pid));
            menu.setMenName((String)jsonArray.getJSONObject(0).get("name"));
            edit(menu);
            return menu;
        }else{
            menu.setParMen(Integer.valueOf(pid));
            menu.setMenName((String)jsonArray.getJSONObject(0).get("name"));
            add(menu);
            return menu;
        }
    }

    @RequestMapping("/modify")
    public void modify(@Param("json") String json) throws JSONException {
        JSONArray jsonArray = new JSONArray(json);
        for(int i=0;i<jsonArray.length();i++){
            TblMenu menu=new TblMenu();
            String idString=(String)jsonArray.getJSONObject(i).get("id");
            String id=idString.split("m")[1];
            String pidString=(String)jsonArray.getJSONObject(i).get("pid");
            String pid=pidString.split("m")[1];
            menu.setMenid(Integer.valueOf(id));
            menu.setParMen(Integer.valueOf(pid));
            Object o=jsonArray.getJSONObject(i).get("url");
            if(o.toString()!="null"){
                menu.setMenUrl((String)jsonArray.getJSONObject(i).get("url"));
            }
            menu.setSort((int)jsonArray.getJSONObject(i).get("order"));
            menu.setMenName((String)jsonArray.getJSONObject(i).get("name"));
            edit(menu);
        }
    }

    @RequestMapping("/delete")
    public int delete(int menid){ menuService.delete(menid);return menid;}

    public void edit(TblMenu menu){
        menuService.update(menu);
    }

    public void add(TblMenu menu){ menuService.save(menu);}
}
