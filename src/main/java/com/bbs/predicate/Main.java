package com.bbs.predicate;

import com.bbs.Apple;
import com.bbs.Car;
import com.bbs.predicate.impl.ColorPrintApplePredicate;
import com.bbs.predicate.impl.GreenApplePredicate;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final List<Apple> appleList = List.of(new Apple("GREEN", (short) 150), new Apple("RED", (short) 120), new Apple("BLACK", (short) 100));
    private static final List<Car> carList = List.of(new Car("AUDI", "A4"), new Car("AUDI", "A5"), new Car("BMW", "M3"));

    public static void main(String[] args) {

        filtroConImplementaciones();
        filtroConClasesAnonimas();
        filtroConLambda();
        filtroAbstraidoDeList();

    }

    private static void filtroConImplementaciones() {

        System.out.println("\n Con implementaciones de un Predicate \n");

        filterGreenApples();
        print(new ColorPrintApplePredicate());
    }

    private static void filtroConClasesAnonimas() {

        System.out.println("\n Con clases anonimas \n");

        filter(appleList, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("BLACK");
            }
        });
    }

    private static void filtroConLambda() {
        System.out.println("\n Con LAMBDA \n");
        filter(appleList, (Apple apple) -> "RED".equals(apple.getColor()));
    }

    private static void filtroAbstraidoDeList() {
        System.out.println("\n Con List abstraída \n");
        System.out.println(filter(carList, (Car car) -> car.getBrand().equals("AUDI")).toString());
    }

    private static void print(ApplePrintPredicate predicate) {

        for (Apple apple : appleList) {
            String output = predicate.print(apple);
            System.out.println(output);
        }
    }

    private static void filterGreenApples() {
        List<Apple> filteredAppleList = filter(appleList, new GreenApplePredicate());
    }

    private static List<Apple> filter(List<Apple> appleList, ApplePredicate predicate) {

        List<Apple> results = new ArrayList();


        for (Apple singleApple : appleList) {
            if (predicate.test(singleApple)) {
                results.add(singleApple);
            }
        }

        System.out.println("Result: " + results.toString());

        return results;
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();

        for (T item : list) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
