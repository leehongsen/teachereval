package com.example.teachereval.service;

import com.example.teachereval.dao.TblClassMapper;
import com.example.teachereval.dao.TblCourseMapper;
import com.example.teachereval.pojo.TblClass;
import com.example.teachereval.pojo.TblCourse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class CLassCourseService implements IService<TblClass>{
    @Autowired
    private TblClassMapper classMapper;

    @Override
    public Integer save(TblClass tblClass) {
        return null;
    }

    @Override
    public Integer delete(String[] ids) {
        return null;
    }

    @Override
    public Integer update(TblClass tblClass) {
        return null;
    }

    @Override
    public Object getList(Map<?, ?> m) {
        return null;
    }

    @Override
    public Integer getTotal(Object obj) {
        return null;
    }

    @Override
    public Object getRecord(TblClass tblClass) {
        return null;
    }
}
