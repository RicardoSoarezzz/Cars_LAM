package com.example.marcas_e_modelos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String brandKey = "BrandKey";
    public static final String arrayKey = "ArrayKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Audi", R.drawable.audi));
        cars.add(new Car("Bentley", R.drawable.bentley));
        cars.add(new Car("BMW", R.drawable.bmw));
        cars.add(new Car("Citroen", R.drawable.citroen));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), cars));
    }


}