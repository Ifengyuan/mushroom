package com.qfedu.pojo;

public class Broker {
    private Integer brokerid;

    private Integer userid;

    private Integer prictureid;

    private String brokertel;

    private String workyear;

    private String describe;

    private Integer telflag;

    private Integer regionid;

    private Integer communityid;

    private Integer usersex;

    private Integer userage;

    private String truename;

    private String qq;

    public Integer getBrokerid() {
        return brokerid;
    }

    public void setBrokerid(Integer brokerid) {
        this.brokerid = brokerid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPrictureid() {
        return prictureid;
    }

    public void setPrictureid(Integer prictureid) {
        this.prictureid = prictureid;
    }

    public String getBrokertel() {
        return brokertel;
    }

    public void setBrokertel(String brokertel) {
        this.brokertel = brokertel == null ? null : brokertel.trim();
    }

    public String getWorkyear() {
        return workyear;
    }

    public void setWorkyear(String workyear) {
        this.workyear = workyear == null ? null : workyear.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public Integer getTelflag() {
        return telflag;
    }

    public void setTelflag(Integer telflag) {
        this.telflag = telflag;
    }

    public Integer getRegionid() {
        return regionid;
    }

    public void setRegionid(Integer regionid) {
        this.regionid = regionid;
    }

    public Integer getCommunityid() {
        return communityid;
    }

    public void setCommunityid(Integer communityid) {
        this.communityid = communityid;
    }

    public Integer getUsersex() {
        return usersex;
    }

    public void setUsersex(Integer usersex) {
        this.usersex = usersex;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename == null ? null : truename.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }
}