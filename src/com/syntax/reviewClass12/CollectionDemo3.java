package com.syntax.reviewClass12;

import com.syntax.class20.Task1.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionDemo3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains("A"));
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        System.out.println(Collections.frequency(arrayList,"A"));
        char[] arr="Maha".toCharArray();
        System.out.println(arr[2]);
        System.out.println(Character.isAlphabetic('c'));

//        for (char c:arr
//             ) {
//            System.out.println(Character.isAlphabetic('c'));
//
//            System.out.println(Character.isAlphabetic('c'));
//        }



    }
}
