package com.example.teachereval.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 通用接口
 */
@Service
public interface IService<T> {
    /**
     * 添加一个数据
     *
     * @param t
     */
    Integer save(T t);

    /**
     * 根据id数组删除对应数据
     *
     * @param ids
     */
    Integer delete(int ids);

    /**
     * 更新数据
     *
     * @param t
     */
    Integer update(T t);

    /**
     * 获取数据列表
     *
     * @return
     */
    Object getList(Map<?, ?> m);

    /**
     * 获得数据总数
     *
     * @return
     */
    Integer getTotal(Object  obj);

    /**
     * 获取单个记录
     *
     */
    Object getRecord(T t);
}
