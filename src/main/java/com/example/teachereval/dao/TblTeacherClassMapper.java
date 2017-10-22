package com.example.teachereval.dao;

import com.example.teachereval.pojo.TblTeacherClassExample;
import com.example.teachereval.pojo.TblTeacherClassKey;
import java.util.List;

public interface TblTeacherClassMapper {
    int countByExample(TblTeacherClassExample example);

    int deleteByPrimaryKey(TblTeacherClassKey key);

    int insert(TblTeacherClassKey record);

    int insertSelective(TblTeacherClassKey record);

    List<TblTeacherClassKey> selectByExample(TblTeacherClassExample example);
}