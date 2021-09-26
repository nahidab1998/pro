package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;


public class layout_dialog extends AppCompatActivity {

    String[] items={"مشکل شبکه","مشکل اینترنت","مشکل شبکه","مشکل اینترنت"};

    AutoCompleteTextView autocompletetxt;
    ArrayAdapter<String> adapteritems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_dialog);

        autocompletetxt=findViewById(R.id.auto_complete_txt);
        adapteritems = new ArrayAdapter<String>(this,R.layout.list_item,items);
        autocompletetxt.setAdapter(adapteritems);
        autocompletetxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), "item"+item, Toast.LENGTH_SHORT).show();
            }
        });

    }

}