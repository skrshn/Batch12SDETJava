package com.syntax.class28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//Create an arraylist of cars and retrieve all the values using 3 different ways.
public class Task1 {
    public static void main(String[] args) {
        List<String> cars = Arrays.asList("Ford", "BMW", "Mercedes", "Opel");

        System.out.println(cars);

        for (String car : cars
        ) {
            System.out.println(car);
        }
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}
