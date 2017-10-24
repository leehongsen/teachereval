package com.example.teachereval.service;

import com.example.teachereval.dao.TblMenuMapper;
import com.example.teachereval.dao.TblRoleVoMapper;
import com.example.teachereval.dao.TblUserInfoMapper;
import com.example.teachereval.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.*;

public class MenuService extends BaseService<TblMenu> {
    @Resource
    private TblMenuMapper menuMapper;
    @Autowired
    private TblUserInfoMapper userInfoMapper;
    @Autowired
    private TblRoleVoMapper roleVoMapper;

    @Override
    public Object getList(Map m) {
        return null;
    }

    /**
     * 根据用户查询角色，再查询权限
     * @return
     */
    public List<TblMenu> loadUserResources(Map<String,Object> m){
        TblUserInfoExample example=new TblUserInfoExample();
        TblUserInfoExample.Criteria criteria=example.createCriteria();
        criteria.andUseridEqualTo((Integer) m.get("userid"));
        List<TblUserInfo> list=userInfoMapper.selectByExample(example);
        List<TblMenu> menulist=new ArrayList<TblMenu>();
        for(TblUserInfo user:list){
            TblRoleVoExample example1=new TblRoleVoExample();
            TblRoleVoExample.Criteria Criteria1=example1.createCriteria();
            Criteria1.andRoleidEqualTo(user.getRoleid());
            List<TblRoleVo> rolevolist=roleVoMapper.selectByExample(example1);
            for(TblRoleVo role:rolevolist){
                TblMenu menu=new TblMenu();
                menu.setMenid(role.getMenid());
                menu.setMenName(role.getMenName());
                menu.setMenDes(role.getMenDes());
                menu.setParMen(role.getParMen());
                menu.setMenCD(role.getMenCD());
                menu.setMenUrl(role.getMenUrl());
                menu.setSort(role.getSort());
                menulist.add(menu);
            }
        }
        Set<TblMenu> set = new HashSet<TblMenu>();
        List<TblMenu> newList = new  ArrayList<>();
        for (TblMenu a:menulist) {
            if(set.add(a)){
                newList.add(a);
            }
        }
        return newList;
    }

    @Override
    public Integer getTotal(Object obj) {
        return null;
    }

    public List<TblMenu> queryAll(){
        TblMenuExample example=new TblMenuExample();
        return menuMapper.selectByExample(example);
    }
}
