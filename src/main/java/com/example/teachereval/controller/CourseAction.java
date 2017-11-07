package com.example.teachereval.controller;

import com.example.teachereval.pojo.TblCourse;
import com.example.teachereval.service.CourseService;
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
@RequestMapping("/course")
public class CourseAction {
    @Autowired
    private CourseService courseService;
    
    @RequestMapping("/getList")
    public List<TblCourse> getList(TblCourse course){
        Map<String,Object> map = new HashMap<>();
        if(course.getCouName()!=""&&null!=course.getCouName()){
            map.put("search",course);
        }
        List<TblCourse> pageInfo = courseService.getList(map);
        return pageInfo;
    }

    @RequestMapping("/editCourse")
    public TblCourse editCourse(@Param("json") String json) throws JSONException {
        JSONArray jsonArray = new JSONArray(json);
        Object o=jsonArray.getJSONObject(0).get("couid");
        TblCourse course=new TblCourse();
        course.setCouName((String)jsonArray.getJSONObject(0).get("couName"));
        course.setCouSem((String)jsonArray.getJSONObject(0).get("couSem"));
        if(o.hashCode()!=0){
            course.setCouid((int)jsonArray.getJSONObject(0).get("couid"));
            edit(course);
            return course;
        }else{

            add(course);
            return course;
        }
    }

    @RequestMapping("/delete")
    public int delete(int couid){ courseService.delete(couid);return couid;}

    public void edit(TblCourse course){ courseService.update(course);}

    public void add(TblCourse course){ courseService.save(course);}
}
