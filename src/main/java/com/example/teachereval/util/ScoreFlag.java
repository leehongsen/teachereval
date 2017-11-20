package com.example.teachereval.util;

public class ScoreFlag {
    private int teacherid;
    private int claid;

    public ScoreFlag(){

    }

    public ScoreFlag(int teacherid, int claid) {
        this.teacherid = teacherid;
        this.claid = claid;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public int getClaid() {
        return claid;
    }

    public void setClaid(int claid) {
        this.claid = claid;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(null == obj) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        if(!(obj instanceof ScoreFlag)){
            return false;
        }
        ScoreFlag p = (ScoreFlag)obj;
        return p.getClaid()==this.claid&&p.getTeacherid()==this.teacherid;
    }
}
