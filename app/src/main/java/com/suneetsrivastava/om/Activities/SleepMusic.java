package com.suneetsrivastava.om.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.suneetsrivastava.om.R;
import com.suneetsrivastava.om.ShortStories;
import com.suneetsrivastava.om.SleepStory;

public class SleepMusic extends Activity {
    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep_music);
        listView = findViewById(R.id.musiclistview);
        String[] data = {"Track 1","Track 2","Track 3","Track 4","Track 5"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,android.R.id.text1,data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int itemposition = i;
                //Intent intent = new Intent(.this,SleepStory.class);
                //intent.putExtra("position",itemposition);
                //startActivity(intent);
            }
        });

    }
}
