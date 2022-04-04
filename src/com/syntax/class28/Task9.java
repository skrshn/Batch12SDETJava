package com.syntax.class28;
//Create a Set of cities in which you want to make sure that insertion order is maintained.
//        Then remove any city that starts with “A”;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Task9 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>(Arrays.asList("Ford", "BMW", "Mercedes", "Opel","Adana"));
        cities.add("Istanbul");
        cities.add("New York");
        cities.add("Abu Dabi");
        cities.add("Los Angeles");
        cities.add("Honolulu");
        cities.add("Berlin");
        cities.add("London");
        cities.add("Casablanca");
        cities.add("Ankara");
        System.out.println(cities);


        Iterator<String> iterator=cities.iterator();
        while(iterator.hasNext()){
            if(iterator.next().toLowerCase().startsWith("a")){
                iterator.remove();
            }
        }//cities.removeIf(s -> s.toLowerCase().startsWith("a"));


        for (String city:cities
             ) {
            System.out.println(city);
        }
    }
}
