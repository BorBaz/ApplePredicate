package com.bbs.predicate.impl;

import com.bbs.Apple;
import com.bbs.predicate.ApplePredicate;

public class GreenApplePredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("GREEN");
    }
}
