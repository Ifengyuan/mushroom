package com.qfedu.pojo;

public class Hothome {
    private Integer hotid;

    private String typename;

    public Integer getHotid() {
        return hotid;
    }

    public void setHotid(Integer hotid) {
        this.hotid = hotid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }
}