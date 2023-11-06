package com.example.marcas_e_modelos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShowModels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_models);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        Intent intent = getIntent();
        String brand = intent.getStringExtra(MainActivity.brandKey);

        Button back = findViewById(R.id.button);

        ArrayList<Car> modelos = new ArrayList<>();

        modelos.add(new Car("A1", R.drawable.a1, "Audi"));
        modelos.add(new Car("A3", R.drawable.a3, "Audi"));
        modelos.add(new Car("A4", R.drawable.a4, "Audi"));
        modelos.add(new Car("R8", R.drawable.r8, "Audi"));

        modelos.add(new Car("FLYING SPUR MULLINER", R.drawable.flying_spur_mulliner, "Bentley"));
        modelos.add(new Car("CONTINENTAL GT SPEED", R.drawable.continental_gt_speed, "Bentley"));
        modelos.add(new Car("BENTAYGA", R.drawable.bentayga, "Bentley"));

        modelos.add(new Car("X1", R.drawable.x1, "BMW"));
        modelos.add(new Car("X3", R.drawable.x3, "BMW"));
        modelos.add(new Car("X5", R.drawable.x5, "BMW"));
        modelos.add(new Car("M3", R.drawable.m3, "BMW"));
        modelos.add(new Car("M5", R.drawable.m5, "BMW"));

        modelos.add(new Car("C3", R.drawable.c3, "Citroen"));
        modelos.add(new Car("C4 Cactus", R.drawable.c4_cactus, "Citroen"));
        modelos.add(new Car("C5 Aircross", R.drawable.c5_aircross, "Citroen"));
        modelos.add(new Car("C3 Aircross", R.drawable.c3_aircross, "Citroen"));
        modelos.add(new Car("C5 Exclusive", R.drawable.c5_exclusive, "Citroen"));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter2(getApplicationContext(), filterModelsByBrand(modelos, brand)));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    public ArrayList<Car> filterModelsByBrand(ArrayList<Car> models, String brand) {
        ArrayList<Car> filteredModels = new ArrayList<>();
        for (Car car : models) {
            if (car.getBrand().equals(brand)) {
                filteredModels.add(car);
            }
        }
        return filteredModels;
    }

}
