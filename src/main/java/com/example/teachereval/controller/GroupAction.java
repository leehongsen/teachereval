package com.example.teachereval.controller;

import com.example.teachereval.pojo.TblCourse;
import com.example.teachereval.pojo.TblGroup;
import com.example.teachereval.pojo.TblTeacherInfo;
import com.example.teachereval.service.CourseService;
import com.example.teachereval.service.GroupService;
import com.example.teachereval.service.TeacherInfoService;
import org.apache.ibatis.annotations.Param;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/group")
public class GroupAction {
    @Autowired
    private GroupService groupService;
    @Autowired
    private TeacherInfoService teacherInfoService;
    @Autowired
    private CourseService courseService;

    @RequestMapping("/getList")
    public List<TblGroup> getList(TblGroup group){
        Map<String,Object> map = new HashMap<>();
        List<TblGroup> pageInfo = groupService.getList(map);
        return pageInfo;
    }

    @RequestMapping("/editGroup")
    public TblGroup editGroup(@Param("json") String json) throws JSONException {
        JSONArray jsonArray = new JSONArray(json);
        Object o=jsonArray.getJSONObject(0).get("groupid");
        TblGroup group=new TblGroup();
        group.setBeginTime((String)jsonArray.getJSONObject(0).get("beginTime"));
        group.setEndTime((String)jsonArray.getJSONObject(0).get("endTime"));
        if(o.hashCode()!=0){
            group.setGroupid((int)jsonArray.getJSONObject(0).get("groupid"));
            edit(group);
            return group;
        }else{
            add(group);
            return group;
        }
    }


    @RequestMapping("/delete")
    public int delete(int groupid){ groupService.delete(groupid);return groupid;}

    public void edit(TblGroup group){ groupService.update(group);}

    public void add(TblGroup group){ groupService.save(group);}

    @RequestMapping("/getTeacherInfo")
    public List<TblTeacherInfo> getTeacherInfo(){
        Map<String,Object> map=new HashMap<>();
        return teacherInfoService.getList(map);
    }

    @RequestMapping("/addCourse")
    @Transactional
    public boolean addCourse(int groupid,@RequestParam(value = "ids[]")int[] ids){
        for(int i:ids){
            TblCourse course=new TblCourse();
            course.setCouid(Integer.valueOf(i));
            course.setGroupid(groupid);
            courseService.update(course);
        }
        return true;
    }
}
