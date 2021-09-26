package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyViewHolder> {

    String data1[] , data2[] , data3[] ,data4[];
    Context context;

    public Myadapter(Context ct , String s1[],String s2[] , String s3[], String s4[]){
        context=ct;
        data1=s1;
        data2=s2;
        data3=s3;
        data4=s4;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.my_row ,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(data1[position]);
        holder.tv_condition.setText(data2[position]);
        holder.tv_address.setText(data3[position]);
        holder.tv_request_title.setText(data4[position]);

    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_name ,tv_condition ,tv_address,tv_request_title;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name=itemView.findViewById(R.id.tv_name);
            tv_condition=itemView.findViewById(R.id.tv_condition);
            tv_address=itemView.findViewById(R.id.tv_address);
            tv_request_title=itemView.findViewById(R.id.tv_request_title);

        }
    }
}
