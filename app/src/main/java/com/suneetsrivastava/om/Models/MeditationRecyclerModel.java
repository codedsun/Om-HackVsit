package com.suneetsrivastava.om.Models;

/**
 * Created by suneetsrivastava on 30/01/18.
 */

public class MeditationRecyclerModel {

    int img;
    String name;
    String desc;

    public MeditationRecyclerModel(int img, String name) {
        this.img = img;
        this.name = name;
        this.desc = desc;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
