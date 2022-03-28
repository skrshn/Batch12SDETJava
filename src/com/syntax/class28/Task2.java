package com.syntax.class28;

import java.util.*;

//Create an arrayList of words. Remove every word that ends with “e”.
public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("word1");
        words.add("word2e");
        words.add("word3");
        words.add("word4e");
        words.add("word5e");
        words.add("word6");

        System.out.println(words);
//
//        Iterator<String> iterator = words.iterator();
//
//        while (iterator.hasNext()) {
//            if (iterator.next().toLowerCase().endsWith("e")) {
//                iterator.remove();
//            }
//        }
//        System.out.println(words);


        words.removeIf(s -> s.toLowerCase().endsWith("e"));
        System.out.println(words);


    }
}
