package com.example.teachereval.controller;

import com.example.teachereval.pojo.TblScore;
import com.example.teachereval.service.ScoreService;
import org.apache.ibatis.annotations.Param;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/score")
public class ScoreAction {
    @Autowired
    private ScoreService scoreService;

    @RequestMapping("/getList")
    public List<TblScore> getList(TblScore score){
        Map<String,Object> map = new HashMap<>();

        List<TblScore> pageInfo = scoreService.getList(map);
        return pageInfo;
    }

    @RequestMapping("/editScore")
    public TblScore editScore(@Param("json") String json) throws JSONException {
        JSONArray jsonArray = new JSONArray(json);
        Object o=jsonArray.getJSONObject(0).get("scoid");
        TblScore score=new TblScore();
        score.setUserid((int)jsonArray.getJSONObject(0).get("userid"));
        score.setClaid((int)jsonArray.getJSONObject(0).get("claid"));
        score.setScore((Double)jsonArray.getJSONObject(0).get("score"));
        if(o.hashCode()!=0){
            score.setScoid((int)jsonArray.getJSONObject(0).get("scoid"));
            edit(score);
            return score;
        }else{
            add(score);
            return score;
        }
    }

    @RequestMapping("/delete")
    public void delete(int scoid){ scoreService.delete(scoid);}

    public void edit(TblScore score){ scoreService.update(score);}

    public void add(TblScore score){ scoreService.save(score);}
}
