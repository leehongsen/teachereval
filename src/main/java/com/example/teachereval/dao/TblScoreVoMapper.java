package com.example.teachereval.dao;

import com.example.teachereval.pojo.TblScoreVo;
import com.example.teachereval.pojo.TblScoreVoExample;
import java.util.List;

public interface TblScoreVoMapper {
    int countByExample(TblScoreVoExample example);

    int insert(TblScoreVo record);

    int insertSelective(TblScoreVo record);

    List<TblScoreVo> selectByExample(TblScoreVoExample example);
}