package com.example.teachereval.dao;

import com.example.teachereval.pojo.TblTeacherInfo;
import com.example.teachereval.pojo.TblTeacherInfoExample;
import java.util.List;

public interface TblTeacherInfoMapper {
    int countByExample(TblTeacherInfoExample example);

    int insert(TblTeacherInfo record);

    int insertSelective(TblTeacherInfo record);

    List<TblTeacherInfo> selectByExample(TblTeacherInfoExample example);
}