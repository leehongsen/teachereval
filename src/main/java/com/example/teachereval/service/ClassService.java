package com.example.teachereval.service;

import com.example.teachereval.dao.TblClassMapper;
import com.example.teachereval.dao.TblClassVoMapper;
import com.example.teachereval.dao.TblUserMapper;
import com.example.teachereval.pojo.*;
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
    @Autowired
    private TblClassVoMapper classVoMapper;
    @Autowired
    private TblUserMapper userMapper;

    @Override
    public Integer save(TblClass tblClass) {
        return classMapper.insertSelective(tblClass);
    }

    @Override
    public Integer delete(int ids) { return classMapper.deleteByPrimaryKey(ids); }

    @Override
    public Integer update(TblClass tblClass) {
        return classMapper.updateByPrimaryKeySelective(tblClass);
    }

    @Override
    public List<TblClass> getList(Map<?, ?> m) {
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

    public TblClassVo getDetail(TblClassVo classVo){
        TblClassVoExample example=new TblClassVoExample();
        TblClassVoExample.Criteria criteria=example.createCriteria();
        criteria.andClaidEqualTo(classVo.getClaid());
        List<TblClassVo> list=classVoMapper.selectByExample(example);
        if(list.size()>0){
            if(list.size()>1){
                TblClassVo imp=list.get(0);
                list.remove(0);
                for(TblClassVo i:list){
                    imp.setCouName(imp.getCouName()+","+i.getCouName());
                    imp.setUsername(imp.getUsername()+","+i.getUsername());
                    imp.setCouSem(imp.getCouSem()+","+i.getCouSem());
                }
            }else{
                return list.get(0);
            }
        }
        return null;
    }

    public List<TblUser> getClassUser(TblClass tblClass){
        TblUserExample example=new TblUserExample();
        TblUserExample.Criteria criteria=example.createCriteria();
        if(null!=tblClass.getClaid()){
            criteria.andClaidEqualTo(tblClass.getClaid());
            return userMapper.selectByExample(example);
        }else{
            return null;
        }
    }

    public List<TblClassVo> getClassVoList(TblClassVo classVo){
        TblClassVoExample example=new TblClassVoExample();
        TblClassVoExample.Criteria criteria=example.createCriteria();
        if(null!=classVo.getUserid()){
            criteria.andUseridEqualTo(classVo.getUserid());
        }
        if(null!=classVo.getClaid()){
            criteria.andClaidEqualTo(classVo.getClaid());
        }
        return classVoMapper.selectByExample(example);
    }
}
