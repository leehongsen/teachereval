package com.example.teachereval.dao;

import com.example.teachereval.pojo.TblClassCourseExample;
import com.example.teachereval.pojo.TblClassCourseKey;
import java.util.List;

public interface TblClassCourseMapper {
    int countByExample(TblClassCourseExample example);

    int deleteByPrimaryKey(TblClassCourseKey key);

    int insert(TblClassCourseKey record);

    int insertSelective(TblClassCourseKey record);

    List<TblClassCourseKey> selectByExample(TblClassCourseExample example);
}