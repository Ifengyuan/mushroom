package com.qfedu.pojo;

public class Picture {
    private Integer pictureid;

    private String pictureurl;

    private Integer pictureflag;

    public Integer getPictureid() {
        return pictureid;
    }

    public void setPictureid(Integer pictureid) {
        this.pictureid = pictureid;
    }

    public String getPictureurl() {
        return pictureurl;
    }

    public void setPictureurl(String pictureurl) {
        this.pictureurl = pictureurl == null ? null : pictureurl.trim();
    }

    public Integer getPictureflag() {
        return pictureflag;
    }

    public void setPictureflag(Integer pictureflag) {
        this.pictureflag = pictureflag;
    }
}