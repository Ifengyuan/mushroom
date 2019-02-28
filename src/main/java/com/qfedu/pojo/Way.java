package com.qfedu.pojo;

public class Way {
    private Integer wayid;

    private String wayname;

    public Integer getWayid() {
        return wayid;
    }

    public void setWayid(Integer wayid) {
        this.wayid = wayid;
    }

    public String getWayname() {
        return wayname;
    }

    public void setWayname(String wayname) {
        this.wayname = wayname == null ? null : wayname.trim();
    }
}