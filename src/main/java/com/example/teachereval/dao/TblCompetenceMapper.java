package com.example.teachereval.dao;

import com.example.teachereval.pojo.TblCompetence;
import com.example.teachereval.pojo.TblCompetenceExample;
import com.example.teachereval.pojo.TblCompetenceKey;
import java.util.List;

public interface TblCompetenceMapper {
    int countByExample(TblCompetenceExample example);

    int deleteByPrimaryKey(TblCompetenceKey key);

    int insert(TblCompetence record);

    int insertSelective(TblCompetence record);

    List<TblCompetence> selectByExample(TblCompetenceExample example);

    TblCompetence selectByPrimaryKey(TblCompetenceKey key);

    int updateByPrimaryKeySelective(TblCompetence record);

    int updateByPrimaryKey(TblCompetence record);
}