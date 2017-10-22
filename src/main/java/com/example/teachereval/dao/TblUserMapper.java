package com.example.teachereval.dao;

import com.example.teachereval.pojo.TblUser;
import com.example.teachereval.pojo.TblUserExample;
import java.util.List;

public interface TblUserMapper {
    int countByExample(TblUserExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(TblUser record);

    int insertSelective(TblUser record);

    List<TblUser> selectByExample(TblUserExample example);

    TblUser selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(TblUser record);

    int updateByPrimaryKey(TblUser record);
}