package com.example.teachereval.service;

import com.example.teachereval.dao.TblCourseMapper;
import com.example.teachereval.dao.TblGroupMapper;
import com.example.teachereval.pojo.TblCourse;
import com.example.teachereval.pojo.TblCourseExample;
import com.example.teachereval.pojo.TblGroup;
import com.example.teachereval.pojo.TblGroupExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Component
@Service("groupService")
public class GroupService {
    @Autowired
    private TblGroupMapper groupMapper;
    @Autowired
    private TblCourseMapper courseMapper;

    
    public Integer save(TblGroup tblGroup) { return groupMapper.insertSelective(tblGroup); }

    
    public Integer delete(int ids) { return groupMapper.deleteByPrimaryKey(ids); }

    
    public Integer update(TblGroup tblGroup) { return groupMapper.updateByPrimaryKeySelective(tblGroup); }

    
    public List<TblGroup> getList(Map<?, ?> m) {
        TblGroupExample example=new TblGroupExample();
        return groupMapper.selectByExample(example);
    }

    public List<TblCourse> getCourseList(TblGroup group){
        TblCourseExample example=new TblCourseExample();
        TblCourseExample.Criteria criteria=example.createCriteria();
        criteria.andGroupidEqualTo(group.getGroupid());
        return courseMapper.selectByExample(example);
    }

    /**
     * 设置课程所属批次
     * @param ids 课程id数组
     * @param groupid 分组id
     * @return
     */
    @Transactional
    public int setCourseToGroup(int[] ids,int groupid){
        int r=1;
        for(int id:ids){
            TblCourse course=new TblCourse();
            course.setCouid(id);
            course.setGroupid(groupid);
            int demo=courseMapper.updateByPrimaryKeySelective(course);
            if(demo==0){
                r=demo;
            }
        }
        return r;
    }

    
    public TblGroup getTotal() {
        TblGroupExample example=new TblGroupExample();
        example.setOrderByClause("groupid");
        List<TblGroup> list=groupMapper.selectByExample(example);
        int i=list.size()-1;
        return list.get(i);
    }

    
    public Object getRecord(TblGroup tblGroup) { return null; }

}