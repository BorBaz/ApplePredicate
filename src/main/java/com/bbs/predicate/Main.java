package com.bbs.predicate;

import com.bbs.Apple;
import com.bbs.predicate.impl.ColorPrintApplePredicate;
import com.bbs.predicate.impl.GreenApplePredicate;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        filter();
        print(new ColorPrintApplePredicate());

    }

    private static void print(ApplePrintPredicate predicate) {
        List<Apple> appleList = List.of(new Apple("GREEN", (short) 150), new Apple("RED", (short) 120), new Apple("BLACK", (short) 100));


        for (Apple apple : appleList) {
            String output = predicate.print(apple);
            System.out.println(output);
        }

    }

    private static void filter() {

        List<Apple> appleList = List.of(new Apple("GREEN"), new Apple("RED"), new Apple("BLACK"));
        List<Apple> filteredAppleList = filterGreenApples(appleList, new GreenApplePredicate());

        System.out.println("Result: " + filteredAppleList.toString());
    }

    private static List<Apple> filterGreenApples(List<Apple> appleList, ApplePredicate predicate) {

        List<Apple> results = new ArrayList();


        for (Apple singleApple : appleList) {
            if (predicate.test(singleApple)) {
                results.add(singleApple);
            }
        }

        return results;
    }
}
