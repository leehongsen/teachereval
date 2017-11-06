package com.example.teachereval.service;

import com.example.teachereval.dao.TblCourseMapper;
import com.example.teachereval.pojo.TblCourse;
import com.example.teachereval.pojo.TblCourseExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Component
@Service("courseService")
public class CourseService implements IService<TblCourse> {
    @Autowired
    private TblCourseMapper courseMapper;

    @Override
    public Integer save(TblCourse tblCourse) {
        return courseMapper.insertSelective(tblCourse);
    }

    @Override
    public Integer delete(String[] ids) {
        Integer r=1;
        for (String a:ids){
            int demo = courseMapper.deleteByPrimaryKey(Integer.valueOf(a));
            if(demo==0){
                r=0;
            }
        }
        return r;
    }

    @Override
    public Integer update(TblCourse tblCourse) {
        return courseMapper.updateByPrimaryKeySelective(tblCourse);
    }

    @Override
    public List<TblCourse> getList(Map<?, ?> m) {
        TblCourseExample example=new TblCourseExample();
        TblCourseExample.Criteria criteria=example.createCriteria();
        if(null!=m.get("search")){
            TblCourse course=(TblCourse) m.get("search");
            if(course.getCouName()!=null){
                criteria.andCouNameLike("%"+course.getCouName()+"%");
            }
        }
        List<TblCourse> list=courseMapper.selectByExample(example);
        return list;
    }

    @Override
    public Integer getTotal(Object obj) {
        return null;
    }

    @Override
    public Object getRecord(TblCourse tblCourse) {
        return null;
    }
}
