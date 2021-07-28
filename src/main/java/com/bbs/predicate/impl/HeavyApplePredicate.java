package com.bbs.predicate.impl;

import com.bbs.Apple;
import com.bbs.predicate.ApplePredicate;

public class HeavyApplePredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
