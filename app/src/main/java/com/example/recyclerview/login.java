package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;


public class login extends AppCompatActivity {

    private Button button;
    //private EditText editText;
    //private CheckBox checkBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button=(Button)findViewById(R.id.buttonlogin);
        //editText=findViewById(R.id.editTextpass);
        //checkBox=findViewById(R.id.checkBox);

        /*checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    editText.setTransformationMethod(null);
                }else {
                    editText.setTransformationMethod(new PasswordTransformationMethod());
                }
            }
        });*/

    }

    public void login1(View view) {
        Intent i= new Intent(login.this,givenlist.class);
        startActivity(i);
    }
}