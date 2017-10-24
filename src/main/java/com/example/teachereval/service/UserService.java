package com.example.teachereval.service;

import com.example.teachereval.dao.TblUserInfoMapper;
import com.example.teachereval.dao.TblUserMapper;
import com.example.teachereval.pojo.TblUser;
import com.example.teachereval.pojo.TblUserInfo;
import com.example.teachereval.pojo.TblUserInfoExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserService extends BaseService<TblUser> {
    @Resource
    private TblUserMapper userMapper;
    @Autowired
    private TblUserInfoMapper userInfoMapper;

    /**
     * 获取列表
     * @param m
     * @return
     */
    @Override
    public PageInfo<TblUserInfo> getList(Map<?, ?> m) {
        TblUserInfoExample example=new TblUserInfoExample();
        TblUserInfoExample.Criteria criteria=example.createCriteria();
        int page=(Integer) m.get("page");
        int limit=(Integer) m.get("limit");
        if(m.get("search")!=null){
            TblUserInfo user=(TblUserInfo) m.get("");
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
        PageHelper.startPage(page,limit);
        List<TblUserInfo> List=userInfoMapper.selectByExample(example);
        return new PageInfo<>(List);
    }

    /**
     * @param obj
     * @return
     */
    @Override
    public Integer getTotal(Object obj) {
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
}
