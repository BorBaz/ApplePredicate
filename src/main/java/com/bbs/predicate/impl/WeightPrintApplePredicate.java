package com.bbs.predicate.impl;

import com.bbs.Apple;
import com.bbs.predicate.ApplePrintPredicate;

public class WeightPrintApplePredicate implements ApplePrintPredicate {
    @Override
    public String print(Apple apple) {
        return "La manzana es pesa " + apple.getWeight();
    }
}
