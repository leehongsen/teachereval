package com.example.teachereval.service;

import com.example.teachereval.dao.TblScoreMapper;
import com.example.teachereval.pojo.TblScore;
import com.example.teachereval.pojo.TblScoreExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Component
@Service("scoreService")
public class ScoreService implements IService<TblScore> {
    @Autowired
    private TblScoreMapper scoreMapper;

    @Override
    public Integer save(TblScore tblScore)  {
        return scoreMapper.insertSelective(tblScore);
    }

    @Override
    public Integer delete(String[] ids) {
        Integer r=1;
        for (String a:ids){
            int demo = scoreMapper.deleteByPrimaryKey(Integer.valueOf(a));
            if(demo==0){
                r=0;
            }
        }
        return r;
    }

    @Override
    public Integer update(TblScore tblScore) { return scoreMapper.updateByPrimaryKeySelective(tblScore); }

    public List<TblScore> getList(Map<?, ?> m) {
        TblScoreExample example=new TblScoreExample();
        TblScoreExample.Criteria criteria=example.createCriteria();

        List<TblScore> list=scoreMapper.selectByExample(example);
        return list;
    }

    @Override
    public Integer getTotal(Object obj) {
        return null;
    }

    @Override
    public Object getRecord(TblScore tblScore) {
        return null;
    }
}
