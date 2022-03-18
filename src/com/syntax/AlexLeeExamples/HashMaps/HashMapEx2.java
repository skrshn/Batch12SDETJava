package com.syntax.AlexLeeExamples.HashMaps;

import java.util.HashMap;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<String, String>();
        hash.put("admin","12345");
        hash.put("joedoe","98765");
        hash.put("michael","00000");

        System.out.println(hash);
    }
}
