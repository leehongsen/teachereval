package com.example.teachereval.dao;

import com.example.teachereval.pojo.TblGroup;
import com.example.teachereval.pojo.TblGroupExample;
import java.util.List;

public interface TblGroupMapper {
    int countByExample(TblGroupExample example);

    int deleteByPrimaryKey(Integer groupid);

    int insert(TblGroup record);

    int insertSelective(TblGroup record);

    List<TblGroup> selectByExample(TblGroupExample example);

    TblGroup selectByPrimaryKey(Integer groupid);

    int updateByPrimaryKeySelective(TblGroup record);

    int updateByPrimaryKey(TblGroup record);
}