package com.example.teachereval.dao;

import com.example.teachereval.pojo.TblClassVo;
import com.example.teachereval.pojo.TblClassVoExample;
import java.util.List;

public interface TblClassVoMapper {
    int countByExample(TblClassVoExample example);

    int insert(TblClassVo record);

    int insertSelective(TblClassVo record);

    List<TblClassVo> selectByExample(TblClassVoExample example);
}