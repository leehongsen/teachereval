package com.example.teachereval.service;

import com.example.teachereval.dao.TblUserInfoMapper;
import com.example.teachereval.dao.TblUserMapper;
import com.example.teachereval.pojo.TblUser;
import com.example.teachereval.pojo.TblUserExample;
import com.example.teachereval.pojo.TblUserInfo;
import com.example.teachereval.pojo.TblUserInfoExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Component
@Service("userService")
public class UserService implements IService<TblUser> {
    @Autowired
    private TblUserMapper userMapper;
    @Autowired
    private TblUserInfoMapper userInfoMapper;

    @Override
    public Integer save(TblUser tblUser) {
        return userMapper.insertSelective(tblUser);
    }

    @Override
    public Integer delete(String[] ids) {
        Integer r=1;
        for (String a:ids){
            int demo = userMapper.deleteByPrimaryKey(Integer.valueOf(a));
            if(demo==0){
                r=0;
            }
        }
        return r;
    }

    @Override
    public Integer update(TblUser tblUser) {
        return userMapper.updateByPrimaryKeySelective(tblUser);
    }

    /**
     * 获取列表
     * @param m
     * @return
     */
    @Override
    public List<TblUserInfo> getList(Map<?, ?> m) {
        TblUserInfoExample example=new TblUserInfoExample();
        TblUserInfoExample.Criteria criteria=example.createCriteria();
        if(null!=m.get("search")){
            TblUserInfo user=(TblUserInfo) m.get("search");
            if(user.getClaid()!=null){
                criteria.andUseridEqualTo(user.getClaid());
            }
            if(user.getRoleid()!=null){
                criteria.andUseridEqualTo(user.getUserid());
            }
            if(user.getUsername()!=null&&user.getUsername()!=""){
                criteria.andUsernameLike("%"+user.getUsername()+"%");
            }
            if(user.getUserid()!=null){
                criteria.andUseridEqualTo(user.getUserid());
            }
        }
        List<TblUserInfo> list=userInfoMapper.selectByExample(example);
        return list;
    }

    /**
     * 获取全部
     * @param obj
     * @return
     */
    @Override
    public Integer getTotal(Object obj) {
        return null;
    }

    @Override
    public Object getRecord(TblUser tblUser) {
        return null;
    }

    /**
     * 查询指定用户信息
     * @param userInfo
     * @return
     */
    public Object getRecord(TblUserInfo userInfo) {
        TblUserInfoExample example=new TblUserInfoExample();
        TblUserInfoExample.Criteria criteria=example.createCriteria();
        criteria.andUseridEqualTo(userInfo.getUserid());
        return userInfoMapper.selectByExample(example);
    }

    /**
     *根据用户名查询用户
     * @param username
     * @return
     */
    public TblUser selectByUsername(String username){
        TblUserExample example=new TblUserExample();
        TblUserExample.Criteria criteria=example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<TblUser> list=userMapper.selectByExample(example);
        if(list.size()!=0){
            return list.get(0);
        }
        return null;
    }

    /**
     * 登录
     * @param user
     * @return
     */
    public TblUser login(TblUser user) {
        TblUserExample example=new TblUserExample();
        TblUserExample.Criteria criteria=example.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername()).andPasswordEqualTo(user.getPassword());
        List<TblUser> list=userMapper.selectByExample(example);
        if (list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
