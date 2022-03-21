package com.syntax.class26;

import java.util.ArrayList;

public class Collections2 {
    public static void main(String[] args) {
        ArrayList<String> countries= new ArrayList<>();
        countries.add("USA");
        countries.add("Turkey");
        countries.add("Germany");

        System.out.println(countries.get(2));
        System.out.println(countries);

        countries.add(2,"Belgium");
        System.out.println(countries);
    }
}
