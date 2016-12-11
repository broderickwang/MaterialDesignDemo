package com.hannahxian.materialdesigndemo.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hannahxian.materialdesigndemo.R;

/**
 * Created by hannahxian on 2016/12/11.
 */

public class MyRecycleViewAdapter extends RecyclerView.Adapter<MyRecycleViewAdapter.MyViewHolder> {

    private String[] sts;
    private Context context;

    public MyRecycleViewAdapter(Context context) {
        this.context = context;
    }

    public void setSts(String[] sts) {
        this.sts = sts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.recycleview_adaper_layout,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.description.setText(sts[position]);
    }

    @Override
    public int getItemCount() {
        return sts.length;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView description;
        public ImageView img;
        public MyViewHolder(View itemView) {
            super(itemView);
            description = (TextView)itemView.findViewById(R.id.description);
            img = (ImageView)itemView.findViewById(R.id.img);
        }
    }
}
