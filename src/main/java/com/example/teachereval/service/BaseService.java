package com.example.teachereval.service;

import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 实现增、改、删、查主键记录，其他需要重写
 * @param <T>
 */
public abstract class BaseService<T> implements IService<T> {
    @Autowired
    protected Mapper<T> mapper;

    public Mapper<T> getMapper(){
        return mapper;
    }

    @Override
    public Integer save(T t) {
        return mapper.insertSelective(t);
    }

    @Override
    public Integer delete(String[] ids) {
        Integer r=1;
        for (String a:ids){
            int demo = mapper.deleteByPrimaryKey(Integer.valueOf(a));
            if(demo==0){
                r=0;
            }
        }
        return r;
    }

    @Override
    public Integer update(T t) {
        return mapper.updateByPrimaryKeySelective(t);
    }



    @Override
    public Object getRecord(T t) {
        return mapper.selectByPrimaryKey(t);
    }
}
