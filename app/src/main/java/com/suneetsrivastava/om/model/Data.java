package com.suneetsrivastava.om.model;

/**
 * Created by MARK_42 on 30-01-2018.
 */

public class Data {
        String text;
        int img;

        public Data(){
            //Default constructor
        }

        public Data(String text, int img, String total) {
            this.text = text;
            this.img = img;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public int getImg() {
            return img;
        }

        public void setImg(int img) {
            this.img = img;
        }
    }
