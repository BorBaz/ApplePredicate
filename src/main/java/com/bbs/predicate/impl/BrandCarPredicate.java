package com.bbs.predicate.impl;

import com.bbs.Car;
import com.bbs.predicate.Predicate;

public class BrandCarPredicate implements Predicate<Car> {
    @Override
    public boolean test(Car car) {
        return car.getBrand().equals("AUDI");
    }
}
