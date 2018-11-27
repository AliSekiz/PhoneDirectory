package com.example.ali.phonedirectory;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

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
        Data data;
        AppDatabase database;
        TextView name,number;
        ImageView img;
        int pos=0;
        public MyViewHolder(@NonNull final View itemView) {
            super(itemView);
            database=Room.databaseBuilder(itemView.getContext(),AppDatabase.class,"vt.db").allowMainThreadQueries().build();
            name=itemView.findViewById(R.id.rowitem_Name);
            number=itemView.findViewById(R.id.rowitem_Number);
            img=itemView.findViewById(R.id.rowitem_ImgView);
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    data=new Data(1,name.getText().toString(),number.getText().toString());
                    database.getDao().deleteData(data);
                    dataList.remove(pos);
                    notifyItemRemoved(pos);
                    notifyItemRangeChanged(pos,dataList.size());
                    return false;
                }
            });

        }
        public void setData(Data item,int i){
            this.name.setText(item.getPersonName());
            this.number.setText(item.getPersonNumber());
            this.pos=i;
        }
    }
}
