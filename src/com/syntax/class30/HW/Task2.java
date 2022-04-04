package com.syntax.class30.HW;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

//Create a map of countries with its capital that will store countries in alphabetical order.
//        Print all keys and values from a country map using for each loop and iterator.
//        Print all values from a country map using for each loop and iterator.
public class Task2 {
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Turkey", "Ankara");
        countries.put("USA", "Washington DC");
        countries.put("France", "Paris");
        countries.put("Italy", "Rome");
        countries.put("Sweden", "Stockholm");
        countries.put("Germany", "Berlin");

        for (Map.Entry<String,String> country : countries.entrySet()) {
            System.out.println(country.getKey() + " - " + country.getValue());
        }

        System.out.println("------------------------------------------------");

        Iterator<Map.Entry<String,String>> it = countries.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String,String> entry = it.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());

        }

        System.out.println("------------------------------------------------");

        for (String country : countries.values()) {
            System.out.println(country);
        }

        System.out.println("------------------------------------------------");

        Iterator<String> it2 = countries.values().iterator();
        while (it2.hasNext()) {
            String key = it2.next();
            System.out.println(key);

        }

    }
}
