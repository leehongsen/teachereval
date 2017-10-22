package com.example.teachereval.dao;

import com.example.teachereval.pojo.TblScore;
import com.example.teachereval.pojo.TblScoreExample;
import java.util.List;

public interface TblScoreMapper {
    int countByExample(TblScoreExample example);

    int deleteByPrimaryKey(Integer scoid);

    int insert(TblScore record);

    int insertSelective(TblScore record);

    List<TblScore> selectByExample(TblScoreExample example);

    TblScore selectByPrimaryKey(Integer scoid);

    int updateByPrimaryKeySelective(TblScore record);

    int updateByPrimaryKey(TblScore record);
}