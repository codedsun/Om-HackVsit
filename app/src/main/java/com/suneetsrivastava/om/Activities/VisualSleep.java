package com.suneetsrivastava.om.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.suneetsrivastava.om.R;

public class VisualSleep extends Activity {
    public ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visual_sleep);
        imageView =findViewById(R.id.SleepImageview);
        View view = findViewById(R.id.SleepImageview);
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        });
    }
}
