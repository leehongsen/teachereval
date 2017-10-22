package com.example.teachereval.dao;

import com.example.teachereval.pojo.TblMenu;
import com.example.teachereval.pojo.TblMenuExample;
import java.util.List;

public interface TblMenuMapper {
    int countByExample(TblMenuExample example);

    int deleteByPrimaryKey(Integer menid);

    int insert(TblMenu record);

    int insertSelective(TblMenu record);

    List<TblMenu> selectByExample(TblMenuExample example);

    TblMenu selectByPrimaryKey(Integer menid);

    int updateByPrimaryKeySelective(TblMenu record);

    int updateByPrimaryKey(TblMenu record);
}