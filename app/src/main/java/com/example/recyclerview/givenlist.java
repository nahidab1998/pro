package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class givenlist extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[] , s2[] ,s3 [] , s4[] ;
    private Button button;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_givenlist);
        s1=getResources().getStringArray(R.array.username);
        s2=getResources().getStringArray(R.array.condition);
        s3=getResources().getStringArray(R.array.address);
        s4=getResources().getStringArray(R.array.request_title);
        recyclerView =findViewById(R.id.recyclerview);

        Myadapter myadapter=new Myadapter(this,s1,s2 ,s3,s4);
        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dialog=new Dialog(this);

        button=(Button) findViewById(R.id.add_request);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

    }

    public void openDialog(){
        dialog.setContentView(R.layout.activity_layout_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageviewclose=dialog.findViewById(R.id.imageView2);
        Button btnsend=dialog.findViewById(R.id.send_btn);

        imageviewclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(givenlist.this, "درخواست شما ارسال شد.", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.show();
    }

    public void back(View view) {
        Intent a= new Intent(givenlist.this,login.class);
        startActivity(a);
    }


}