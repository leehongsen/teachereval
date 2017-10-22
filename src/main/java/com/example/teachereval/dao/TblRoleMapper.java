package com.example.teachereval.dao;

import com.example.teachereval.pojo.TblRole;
import com.example.teachereval.pojo.TblRoleExample;
import java.util.List;

public interface TblRoleMapper {
    int countByExample(TblRoleExample example);

    int deleteByPrimaryKey(Integer roleid);

    int insert(TblRole record);

    int insertSelective(TblRole record);

    List<TblRole> selectByExample(TblRoleExample example);

    TblRole selectByPrimaryKey(Integer roleid);

    int updateByPrimaryKeySelective(TblRole record);

    int updateByPrimaryKey(TblRole record);
}