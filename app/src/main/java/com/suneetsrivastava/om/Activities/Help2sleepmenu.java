package com.suneetsrivastava.om.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.suneetsrivastava.om.Helpers.MyAdapter;
import com.suneetsrivastava.om.R;
import com.suneetsrivastava.om.model.Data;

import java.util.ArrayList;

public class Help2sleepmenu extends Activity {
    RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help2sleepmenu);
        Data sample = new Data();
        Data sample1 = new Data();
        Data sample2 = new Data();
        ArrayList<Data> data = new ArrayList<>();
        sample.setImg(R.drawable.book);
        sample.setText("Novel");
        data.add(sample);
        sample1.setImg(R.drawable.music);
        sample1.setText("Music");
        data.add(sample1);
        sample2.setImg(R.drawable.visual);
        sample2.setText("Visual");
        data.add(sample2);
        mRecyclerView = findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyAdapter(this,data);
        mRecyclerView.setAdapter(mAdapter);
    }
}
