package com.example.teachereval.dao;

import com.example.teachereval.pojo.TblRoleVo;
import com.example.teachereval.pojo.TblRoleVoExample;
import java.util.List;

public interface TblRoleVoMapper {
    int countByExample(TblRoleVoExample example);

    int insert(TblRoleVo record);

    int insertSelective(TblRoleVo record);

    List<TblRoleVo> selectByExample(TblRoleVoExample example);
}