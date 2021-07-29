package com.bbs;


import lombok.Data;

@Data
public class Apple {

    private String color;
    private short weight;

    public Apple(String color) {
        this.color = color;
    }

    public Apple(String color, short weight) {
        this.color = color;
        this.weight = weight;
    }
}
