package com.example.ali.phonedirectory;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    List<Data> dataList;
    LayoutInflater inflater;
    public CustomAdapter(Context c, List<Data>d){
        inflater=LayoutInflater.from(c);
        this.dataList=d;

    }
    @NonNull
    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v=inflater.inflate(R.layout.rowitem_custom,viewGroup,false);
        MyViewHolder mHolder=new MyViewHolder(v);
        return mHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyViewHolder myViewHolder, int i) {
            Data item=dataList.get(i);
            myViewHolder.setData(item,i);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name,number;
        ImageView img;
        int pos=0;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.rowitem_Name);
            number=itemView.findViewById(R.id.rowitem_Number);
            img=itemView.findViewById(R.id.rowitem_ImgView);

        }
        public void setData(Data item,int i){
            this.name.setText(item.getPersonName());
            this.number.setText(item.getPersonNumber());
            this.pos=i;
        }
    }
}
