package com.example.teachereval.dao;

import com.example.teachereval.pojo.TblRoleUserExample;
import com.example.teachereval.pojo.TblRoleUserKey;
import java.util.List;

public interface TblRoleUserMapper {
    int countByExample(TblRoleUserExample example);

    int deleteByPrimaryKey(TblRoleUserKey key);

    int insert(TblRoleUserKey record);

    int insertSelective(TblRoleUserKey record);

    List<TblRoleUserKey> selectByExample(TblRoleUserExample example);
}