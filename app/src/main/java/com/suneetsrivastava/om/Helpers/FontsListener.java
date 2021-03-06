package com.suneetsrivastava.om.Helpers;

import android.content.Context;
import android.graphics.Typeface;

import com.suneetsrivastava.om.MyApplication;

import java.lang.reflect.Type;

/**
 * Created by suneetsrivastava on 30/01/18.
 */

public class FontsListener {

    Typeface typeface;
    Context c;
    String name;

    public FontsListener(Context c, String fontName){
        this.c = c;
        typeface = Typeface.createFromAsset(c.getAssets(),"fonts/"+fontName+".ttf");
    }

    public Typeface getFont(){
        return typeface;
    }

    public Typeface getFontByName(String fontName){
        typeface = Typeface.createFromAsset(c.getAssets(),"fonts/"+fontName+".ttf");
        return typeface;
    }
}
