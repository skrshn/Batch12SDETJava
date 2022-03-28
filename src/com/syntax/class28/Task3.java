package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Tequila");
        drinks.add("Coke");
        drinks.add("Gin");
        drinks.add("Orange");
        drinks.add("Kiwi");

        System.out.println(drinks);
        //drinks.removeIf(s -> s.toLowerCase().contains("e") || s.toLowerCase().contains("a"));


        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.set(i,"Water");
            }
        }

        System.out.println(drinks);
    }
}
