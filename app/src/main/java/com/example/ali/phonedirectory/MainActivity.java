package com.example.ali.phonedirectory;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        final Dialog dialog =new Dialog(context);
        dialog.setContentView(R.layout.customdialog);

        Button numberSave=dialog.findViewById(R.id.diagloSaveNumber);
        final EditText personName=dialog.findViewById(R.id.dialogName);
        final EditText personNumber=dialog.findViewById(R.id.diaglogNumber);
        ImageView personImg=findViewById(R.id.dialogImageView);

        numberSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),personName.getText()+" "+
                        personNumber.getText()
                        ,Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        dialog.show();
    }

}