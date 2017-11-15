package com.example.teachereval.service;

import com.example.teachereval.dao.TblTeacherInfoMapper;
import com.example.teachereval.pojo.TblTeacherInfo;
import com.example.teachereval.pojo.TblTeacherInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Component
@Service("teacherInfoService")
public class TeacherInfoService implements IService<TeacherInfoService> {
    @Autowired
    private TblTeacherInfoMapper teacherInfoMapper;

    @Override
    public Integer save(TeacherInfoService teacherInfoService) {
        return null;
    }

    @Override
    public Integer delete(int ids) {
        return null;
    }

    @Override
    public Integer update(TeacherInfoService teacherInfoService) {
        return null;
    }

    @Override
    public List<TblTeacherInfo> getList(Map<?, ?> m) {
        TblTeacherInfoExample example=new TblTeacherInfoExample();
        return teacherInfoMapper.selectByExample(example);
    }

    @Override
    public Integer getTotal(Object obj) {
        return null;
    }

    @Override
    public Object getRecord(TeacherInfoService teacherInfoService) {
        return null;
    }
}
