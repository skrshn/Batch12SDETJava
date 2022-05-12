package com.syntax.Replits;

import java.util.*;

//Write a function to check whether two given strings are anagram of each other or not. An anagram of a string is
//        another string that contains the same characters, only the order of characters can be different.
//        For example, “abcd” and “dabc” are an anagram of each other.
public class isAnagram {

    static boolean isAnagram(String s1, String s2) {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        for (char c1 : s1.toCharArray()) {
            list1.add(c1);
        }
        for (char c2 : s2.toCharArray()) {
            list2.add(c2);
        }

        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1 + " " + list2);


        if (list1.equals(list2)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        String s1 = "sakir";
        String s2 = "akirs";
        System.out.println(isAnagram(s1, s2));
    }
}
