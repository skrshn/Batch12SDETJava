package com.syntax.class28;
//Create a Set collection in which you need to add names of the countries.
//        In this set we want all objects to be sorted in alphabetical order.
//        Using 2 different ways retrieve all elements from set.

import java.util.Iterator;
import java.util.TreeSet;

public class Task8 {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("Turkey");
        countries.add("USA");
        countries.add("Germany");
        countries.add("Morocco");
        countries.add("Canada");
        countries.add("Spain");

        System.out.println(countries);

        for (String country : countries
        ) {
            System.out.println(country);
        }

        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
