package com.suneetsrivastava.om.Helpers;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.suneetsrivastava.om.R;
import com.suneetsrivastava.om.model.Data;

import java.util.ArrayList;

/**
 * Created by MARK_42 on 30-01-2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<Data> data ;
    LayoutInflater inflater;

    public MyAdapter(Context context, ArrayList<Data> data) {
        this.context = context;
        this.data = data;
        inflater= LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.sleep_card,parent,false);
        MyAdapter.MyViewHolder holder = new MyAdapter.MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.text.setText(data.get(position).getText());
        holder.img.setImageResource(data.get(position).getImg());
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"You have clicked"+position,Toast.LENGTH_SHORT).show();
                Log.d("AdapterClass","Hi, you clicked item "+position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView text;
        public MyViewHolder(View itemView) {
            super(itemView);
          img=itemView.findViewById(R.id.sleepImage);
          text = itemView.findViewById(R.id.sleepText);
        }
    }
}

