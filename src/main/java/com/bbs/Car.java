package com.bbs;

import lombok.Data;

@Data
public class Car {

    private String model;
    private String brand;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}
