package com.syntax.Replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Replit216 {
    public static int[] arraySumToZero(int n) {
        int[] result = new int[n];

        for (int i = 0; i < n - 1; i += 2) {
            result[i] = i - n;
            result[i + 1] = n - i;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = arraySumToZero(5);

        //first way
//        for (int a : arr
//        ) {
//            System.out.print(a + " ");
//
//        }
//
        //second way
        List<Integer> list = Arrays.stream(arr)        // IntStream
                .boxed()          // Stream<Integer>
                .collect(Collectors.toList());

        System.out.println(list);
    }
}

