package com.bbs;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Apple {

    public Apple(String color) {
        this.color = color;
    }

    public Apple(String color, short weight) {
        this.color = color;
        this.weight = weight;
    }

    private String color;
    private short weight;
}
