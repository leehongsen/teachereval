package com.example.teachereval.service;

import com.example.teachereval.dao.TblClassMapper;
import com.example.teachereval.pojo.TblClass;
import com.example.teachereval.pojo.TblClassExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Component
@Service("classService")
public class ClassService implements IService<TblClass> {
    @Autowired
    private TblClassMapper classMapper;

    @Override
    public Integer save(TblClass tblClass) {
        return classMapper.insertSelective(tblClass);
    }

    @Override
    public Integer delete(String[] ids) {
        Integer r=1;
        for (String a:ids){
            int demo = classMapper.deleteByPrimaryKey(Integer.valueOf(a));
            if(demo==0){
                r=0;
            }
        }
        return r;
    }

    @Override
    public Integer update(TblClass tblClass) {
        return classMapper.updateByPrimaryKeySelective(tblClass);
    }

    @Override
    public Object getList(Map<?, ?> m) {
        TblClassExample example=new TblClassExample();
        TblClassExample.Criteria criteria=example.createCriteria();
        if(null!=m.get("search")){
            TblClass tblclass=(TblClass) m.get("search");
            if(tblclass.getClaName()!=null){
                criteria.andClaNameLike("%"+tblclass.getClaName()+"%");
            }
        }
        List<TblClass> list=classMapper.selectByExample(example);
        return list;
    }

    @Override
    public Integer getTotal(Object obj) {
        return null;
    }

    @Override
    public Object getRecord(TblClass tblClass) {
        return null;
    }
}
