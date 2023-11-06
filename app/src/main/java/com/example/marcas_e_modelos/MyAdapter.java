package com.example.marcas_e_modelos;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> implements View.OnClickListener{

    Context context;
    List<Car> cars;


    public MyAdapter(Context context, ArrayList<Car> cars){
        this.context = context;
        this.cars = cars;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.activity_viewer, parent, false);
        //return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_viewer, parent, false));
        MyViewHolder myViewHolder = new MyViewHolder(view);
        view.setOnClickListener(this);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position){
        holder.textView.setText(cars.get(position).getName());
        holder.imageView.setImageResource(cars.get(position).getImage());
        holder.imageView.setTag(cars.get(position).getImage());


    }

    @Override
    public int getItemCount(){
        return cars.size();
    }


    @Override
    public void onClick(View v) {
        TextView carBrand = (TextView) v.findViewById(R.id.textView2);

        String brand = carBrand.getText().toString();

        Toast.makeText(v.getContext(), brand, Toast.LENGTH_LONG).show();

        Intent intent = new Intent(v.getContext(), ShowModels.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra(MainActivity.brandKey, brand);
        //intent.putExtra(MainActivity.arrayKey, cars);
        v.getContext().startActivity(intent);
    }
}
