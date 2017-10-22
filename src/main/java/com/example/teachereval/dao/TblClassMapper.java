package com.example.teachereval.dao;

import com.example.teachereval.pojo.TblClass;
import com.example.teachereval.pojo.TblClassExample;
import java.util.List;

public interface TblClassMapper {
    int countByExample(TblClassExample example);

    int deleteByPrimaryKey(Integer claid);

    int insert(TblClass record);

    int insertSelective(TblClass record);

    List<TblClass> selectByExample(TblClassExample example);

    TblClass selectByPrimaryKey(Integer claid);

    int updateByPrimaryKeySelective(TblClass record);

    int updateByPrimaryKey(TblClass record);
}