package com.suneetsrivastava.om.Helpers;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.suneetsrivastava.om.Activities.MeditationDetails;
import com.suneetsrivastava.om.Models.MeditationRecyclerModel;
import com.suneetsrivastava.om.R;

import java.util.ArrayList;

/**
 * Created by suneetsrivastava on 30/01/18.
 */

public class MeditationAdapter extends RecyclerView.Adapter<MeditationAdapter.ViewHolder> {

    Context c;
    ArrayList<MeditationRecyclerModel> meditationAdapterArrayList;

    public MeditationAdapter(Context c, ArrayList<MeditationRecyclerModel> meditationAdapterArrayList) {
        this.c = c;
        this.meditationAdapterArrayList = meditationAdapterArrayList;
    }

    @Override
    public MeditationAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(c).inflate(R.layout.meditation_adapter,parent,false));
    }

    @Override
    public void onBindViewHolder(MeditationAdapter.ViewHolder holder, final int position) {
            holder.imageButton.setImageResource(meditationAdapterArrayList.get(position).getImg());
            holder.imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = (new Intent(c.getApplicationContext(), MeditationDetails.class));
                    i.putExtra("value",position);
                    c.startActivity(i);
                }
            });
    }

    @Override
    public int getItemCount() {
        return meditationAdapterArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageButton imageButton;
        public ViewHolder(View itemView) {
            super(itemView);
            imageButton = itemView.findViewById(R.id.meditation_image);
            imageButton.setScaleType(ImageView.ScaleType.CENTER_CROP);

        }
    }
}
