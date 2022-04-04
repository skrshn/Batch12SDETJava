package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> fruit=new HashMap<>();
        fruit.put("Orange",10);
        fruit.put("Apple",1000);
        fruit.put("Banana",15);
        Map<String,Integer> vegetables=new HashMap<>();
        vegetables.put("potato",4);
        vegetables.put("tomato",10);
        vegetables.put("Apple2",1000);
        vegetables.put("Banana",15);
        vegetables.put("Banana",25);
        System.out.println(vegetables.get("Banana"));

        Map<String,Integer> grocers=new HashMap<>();
        grocers.putAll(fruit);
        grocers.putAll(vegetables);
        System.out.println(grocers);


    }
}
