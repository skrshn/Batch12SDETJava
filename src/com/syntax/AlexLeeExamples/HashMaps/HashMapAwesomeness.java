package com.syntax.AlexLeeExamples.HashMaps;

import java.util.HashMap;

public class HashMapAwesomeness {
    public static void main(String[] args) {
        int a = 10;
        String b = "hello";
        int[] c = {1, 2, 3};

        int d = 3;
        int e = 88;

        HashMap<String, Integer> happy = new HashMap<String, Integer>();
        happy.put("a", a);
        happy.put("d", d);
        happy.put("e", e);

        System.out.println(happy);
        System.out.println(happy.get("d"));

    }
}
