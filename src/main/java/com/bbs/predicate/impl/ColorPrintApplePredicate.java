package com.bbs.predicate.impl;

import com.bbs.Apple;
import com.bbs.predicate.ApplePrintPredicate;

public class ColorPrintApplePredicate implements ApplePrintPredicate {

    @Override
    public String print(Apple apple) {
        return "La puta manzana es " + apple.getColor();
    }
}
