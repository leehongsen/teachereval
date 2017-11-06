package com.example.teachereval.service;

import com.example.teachereval.dao.TblRoleMapper;
import com.example.teachereval.dao.TblRoleVoMapper;
import com.example.teachereval.pojo.TblRole;
import com.example.teachereval.pojo.TblRoleExample;
import com.example.teachereval.pojo.TblRoleVo;
import com.example.teachereval.pojo.TblRoleVoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Component
@Service("roleService")
public class RoleService implements IService<TblRole> {
    @Autowired
    private TblRoleMapper roleMapper;
    @Autowired
    private TblRoleVoMapper roleVoMapper;

    @Override
    public Integer save(TblRole tblRole) {
        return roleMapper.insertSelective(tblRole);
    }

    @Override
    public Integer delete(String[] ids) {
        Integer r=1;
        for (String a:ids){
            int demo = roleMapper.deleteByPrimaryKey(Integer.valueOf(a));
            if(demo==0){
                r=0;
            }
        }
        return r;
    }

    public List<TblRoleVo> getRoleMenu(int roleid){
        TblRoleVoExample example=new TblRoleVoExample();
        TblRoleVoExample.Criteria criteria=example.createCriteria();
        criteria.andRoleidEqualTo(roleid);
        List<TblRoleVo> list=roleVoMapper.selectByExample(example);
        return list;
    }

    @Override
    public Integer update(TblRole tblRole) {
        return roleMapper.updateByPrimaryKeySelective(tblRole);
    }

    @Override
    public List<TblRole> getList(Map<?, ?> m) {
        TblRoleExample example=new TblRoleExample();
        return roleMapper.selectByExample(example);
    }

    @Override
    public Integer getTotal(Object obj) {
        return null;
    }

    @Override
    public Object getRecord(TblRole tblRole) {
        return null;
    }
}
