package com.qfedu.pojo;

public class Home {
    private Integer homeid;

    private Integer communityid;

    private Integer regionid;

    private Integer homeprice;

    private Integer homeway;

    private String homearea;

    private Integer homestype;

    private Integer prictureid;

    private String homeurl;

    private Integer homehot;

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

    public String getHomearea() {
        return homearea;
    }

    public void setHomearea(String homearea) {
        this.homearea = homearea == null ? null : homearea.trim();
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
}