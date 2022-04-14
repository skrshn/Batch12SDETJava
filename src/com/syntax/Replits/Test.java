package com.syntax.Replits;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ONE", "AAA");

        map.put("TWO", "BBB");

        map.put("THREE", "CCC");

        map.put("FOUR", "DDD");

        map.put("FIVE", "EEE");

        System.out.println("HashMap Before Remove :");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("------------------");
        map.remove("ONE");
        map.remove("FOUR");
        System.out.println("HashMap After Remove : ");
        Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, String> entry2 = it2.next();
            System.out.println(entry2.getKey() + " : " + entry2.getValue());
        }
    }
}