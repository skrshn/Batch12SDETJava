package com.syntax.AlexLeeExamples.HashMaps;

import java.util.HashMap;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds= new HashMap<String, Integer>();

        empIds.put("John",123);

        System.out.println(empIds);
        empIds.putIfAbsent("Steve",222);
        System.out.println(empIds);
        empIds.remove("Steve");
        System.out.println(empIds);


    }
}
