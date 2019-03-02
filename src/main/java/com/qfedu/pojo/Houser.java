package com.qfedu.pojo;

public class Houser {
    private Integer homeid;

    private Integer communityid;

    private Integer regionid;

    private Integer homeprice;

    private Integer homeway;

    private Integer homearea;

    private Integer homestype;

    private Integer prictureid;

    private String homeurl;

    private Integer homehot;

    private String fittype;

    private String homedetails;

    private String comjieshao;

    public Integer getHomeid() {
        return homeid;
    }

    public void setHomeid(Integer homeid) {
        this.homeid = homeid;
    }

    public Integer getCommunityid() {
        return communityid;
    }

    public void setCommunityid(Integer communityid) {
        this.communityid = communityid;
    }

    public Integer getRegionid() {
        return regionid;
    }

    public void setRegionid(Integer regionid) {
        this.regionid = regionid;
    }

    public Integer getHomeprice() {
        return homeprice;
    }

    public void setHomeprice(Integer homeprice) {
        this.homeprice = homeprice;
    }

    public Integer getHomeway() {
        return homeway;
    }

    public void setHomeway(Integer homeway) {
        this.homeway = homeway;
    }

    public Integer getHomearea() {
        return homearea;
    }

    public void setHomearea(Integer homearea) {
        this.homearea = homearea;
    }

    public Integer getHomestype() {
        return homestype;
    }

    public void setHomestype(Integer homestype) {
        this.homestype = homestype;
    }

    public Integer getPrictureid() {
        return prictureid;
    }

    public void setPrictureid(Integer prictureid) {
        this.prictureid = prictureid;
    }

    public String getHomeurl() {
        return homeurl;
    }

    public void setHomeurl(String homeurl) {
        this.homeurl = homeurl == null ? null : homeurl.trim();
    }

    public Integer getHomehot() {
        return homehot;
    }

    public void setHomehot(Integer homehot) {
        this.homehot = homehot;
    }

    public String getFittype() {
        return fittype;
    }

    public void setFittype(String fittype) {
        this.fittype = fittype == null ? null : fittype.trim();
    }

    public String getHomedetails() {
        return homedetails;
    }

    public void setHomedetails(String homedetails) {
        this.homedetails = homedetails == null ? null : homedetails.trim();
    }

    public String getComjieshao() {
        return comjieshao;
    }

    public void setComjieshao(String comjieshao) {
        this.comjieshao = comjieshao == null ? null : comjieshao.trim();
    }
}