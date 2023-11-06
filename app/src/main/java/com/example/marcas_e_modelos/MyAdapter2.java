package com.example.marcas_e_modelos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter2 extends RecyclerView.Adapter<MyViewHolder>{


    Context context;
    List<Car> model;


    public MyAdapter2(Context context, List<Car> model){
        this.context = context;
        this.model = model;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        //View view;
        //view = LayoutInflater.from(context).inflate(R.layout.activity_viewer, parent, false);
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_viewer, parent, false));
        //MyViewHolder myViewHolder = new MyViewHolder(view);
        //view.setOnClickListener(this);
        //return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position){
        holder.textView.setText(model.get(position).getName());
        holder.imageView.setImageResource(model.get(position).getImage());
        holder.imageView.setTag(model.get(position).getImage());
    }

    @Override
    public int getItemCount(){
        return model.size();
    }
}
