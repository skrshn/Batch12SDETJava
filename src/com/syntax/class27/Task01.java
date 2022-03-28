package com.syntax.class27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Create an ArrayList that will store 5 names into it.
//        Find out whether the given ArrayList is empty or not?
//        Check whether the specific name is present in an ArrayList or not?
//        Find the size of your arrayList and print all values from that
public class Task01 {
    public static void main(String[] args) {
        ArrayList<String> arrList1 = new ArrayList<>();
        arrList1.add("Michael");
        arrList1.add("John");
        arrList1.add("Mary");
        arrList1.add("Hans");
        arrList1.add("James");
        System.out.println(arrList1.isEmpty());
        System.out.println(arrList1.contains("James"));
        System.out.println(arrList1.size());
        System.out.println(arrList1);


        List<String> greceries = Arrays.asList("Apple","Orange","Banana");
        System.out.println(greceries);

    }
}
