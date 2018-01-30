package com.suneetsrivastava.om.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.suneetsrivastava.om.Helpers.MeditationAdapter;
import com.suneetsrivastava.om.Models.MeditationRecyclerModel;
import com.suneetsrivastava.om.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MeditationActivity extends Activity {

    @BindView(R.id.recyclerView)
    RecyclerView meditationReycler;


    ArrayList<MeditationRecyclerModel> meditationList = new ArrayList<>();
    MeditationAdapter meditationAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation);
        ButterKnife.bind(this);
        loadData();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        meditationAdapter = new MeditationAdapter(this,meditationList);
        meditationReycler.setLayoutManager(layoutManager);
        meditationReycler.setAdapter(meditationAdapter);
        meditationAdapter.notifyDataSetChanged();

    }

    private void loadData(){
        meditationList.add(new MeditationRecyclerModel(R.drawable.buddhist,"buddhist"));
        meditationList.add(new MeditationRecyclerModel(R.drawable.mindfulness,"mindfulness"));
        meditationList.add(new MeditationRecyclerModel(R.drawable.vipassana,"vipassana"));
        meditationList.add(new MeditationRecyclerModel(R.drawable.zen,"zen"));
        meditationList.add(new MeditationRecyclerModel(R.drawable.guided,"guided"));
        meditationList.add(new MeditationRecyclerModel(R.drawable.hindu,"hindu"));
        meditationList.add(new MeditationRecyclerModel(R.drawable.trancendetal,"trancendetal"));
        meditationList.add(new MeditationRecyclerModel(R.drawable.yoga,"yoga"));
        meditationList.add(new MeditationRecyclerModel(R.drawable.loving,"loving"));
        meditationList.add(new MeditationRecyclerModel(R.drawable.self_enquiry,"Self Enquiry"));
    }
}
