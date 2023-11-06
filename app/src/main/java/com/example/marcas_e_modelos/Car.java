package com.example.marcas_e_modelos;

import java.util.ArrayList;

public class Car {

    String name;
    int image;
    String brand;

    public Car(String name, int image, String brand){
        this.name = name;
        this.image = image;
        this.brand = brand;
    }

    public Car(String name, int image){
        this.name = name;
        this.image = image;
        this.brand = name;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getBrand() {
        return brand;
    }
}
