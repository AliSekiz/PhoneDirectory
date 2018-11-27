package com.example.ali.phonedirectory;

import android.app.Dialog;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    AppDatabase database;
    Data data;
    CustomAdapter adapter;

    RecyclerView recyclerView;
    List<Data>dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        toolbar=findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.toolbarmenu_items);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.toolbarAddPerson:
                        showDialog();
                }
                return true;
            }
        });
    }
    public void showDialog(){
        final Dialog dialog =new Dialog(this);
        dialog.setContentView(R.layout.customdialog);

        Button numberSave=dialog.findViewById(R.id.diagloSaveNumber);
        final EditText personName=dialog.findViewById(R.id.dialogName);
        final EditText personNumber=dialog.findViewById(R.id.diaglogNumber);
        ImageView personImg=findViewById(R.id.dialogImageView);



        numberSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=new Data(1,personName.getText().toString(),personNumber.getText().toString());
                database.getDao().insertData(data);
                Toast.makeText(getApplicationContext(),data.getPersonNumber()+" Kaydedildi",Toast.LENGTH_SHORT).show();

                dialog.dismiss();
                getData();
            }
        });
        dialog.show();
    }
    public void getData(){
        database=Room.databaseBuilder(getApplicationContext(),AppDatabase.class,"vt.db").allowMainThreadQueries().build();
        dataList=database.getDao().getData();
        adapter=new CustomAdapter(this,dataList);
        recyclerView=findViewById(R.id.dataList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

}