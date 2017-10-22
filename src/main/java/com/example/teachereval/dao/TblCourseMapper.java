package com.example.teachereval.dao;

import com.example.teachereval.pojo.TblCourse;
import com.example.teachereval.pojo.TblCourseExample;
import java.util.List;

public interface TblCourseMapper {
    int countByExample(TblCourseExample example);

    int deleteByPrimaryKey(Integer couid);

    int insert(TblCourse record);

    int insertSelective(TblCourse record);

    List<TblCourse> selectByExample(TblCourseExample example);

    TblCourse selectByPrimaryKey(Integer couid);

    int updateByPrimaryKeySelective(TblCourse record);

    int updateByPrimaryKey(TblCourse record);
}