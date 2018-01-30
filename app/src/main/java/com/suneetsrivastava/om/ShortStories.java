package com.suneetsrivastava.om;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ShortStories extends Activity {
    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short_stories);
        listView = findViewById(R.id.shortStorylistview);
        String[] data = {"A Pound Butter","The Obstacle in Our Path","Everyone Has a Story in Life","BE PATIENT","LET GO"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,android.R.id.text1,data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int itemposition = i;
                Intent intent = new Intent(ShortStories.this,SleepStory.class);
                intent.putExtra("position",itemposition);
                startActivity(intent);
            }
        });
    }
}
