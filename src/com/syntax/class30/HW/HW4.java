package com.syntax.class30.HW;
//Create the collection that will store single uniques Objects of a String type in which order is preserved.
//        Write a logic to concatenate all string from the collection.

import java.util.*;

public class HW4 {
    public static void main(String[] args) {
        Set<String> str = new LinkedHashSet<>();
        str.add("Hello");
        str.add("World");
        str.add("This");
        str.add("is");
        str.add("John");
        str.add("Doe");

//        Iterator<String> it = str.iterator();
//        while (it.hasNext()) {
//            System.out.print(it.next() + " ");
//        }

        for (String s : str) {
            System.out.print(s + " ");
        }
    }
}
