package com.example.teachereval.controller;

import com.example.teachereval.pojo.TblClass;
import com.example.teachereval.pojo.TblClassVo;
import com.example.teachereval.pojo.TblUser;
import com.example.teachereval.service.ClassService;
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
@RequestMapping("/class")
public class ClassAction {
    @Autowired
    private ClassService classService;

    @RequestMapping("/getList")
    public List<TblClass> getList(TblClass theclass){
        Map<String,Object> map = new HashMap<>();
        if(theclass.getClaName()!=""&&null!=theclass.getClaName()){
            map.put("search",theclass);
        }
        List<TblClass> pageInfo = classService.getList(map);
        return pageInfo;
    }

    @RequestMapping("/editClass")
    public TblClass editClass(@Param("json") String json) throws JSONException {
        JSONArray jsonArray = new JSONArray(json);
        Object o=jsonArray.getJSONObject(0).get("claid");
        TblClass theclass=new TblClass();
        theclass.setClaName((String)jsonArray.getJSONObject(0).get("claName"));
        if(o.hashCode()!=0){
            theclass.setClaid((int)jsonArray.getJSONObject(0).get("claid"));
            edit(theclass);
            return theclass;
        }else{
            add(theclass);
            return theclass;
        }
    }

    @RequestMapping("/getClassVoList")
    public List<TblClassVo> getClassVoList(TblClassVo classVo){
        return classService.getClassVoList(classVo);
    }

    @RequestMapping("/delete")
    public int delete(int claid){ classService.delete(claid);return claid;}

    public void edit(TblClass theclass){ classService.update(theclass);}

    public void add(TblClass theclass){ classService.save(theclass);}

    @RequestMapping("/getDetail")
    public TblClassVo getDetail(TblClassVo classVo){ return classService.getDetail(classVo);}

    @RequestMapping("/getClassUser")
    public List<TblUser> getClassUser(TblClass tblClass){ return classService.getClassUser(tblClass);}
}
