package com.syntax.HackerRankSamples;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

class Result2 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        //Scanner in = new Scanner(System.in);
        int sum = 0;
        int max = 0;
        int min = max;
        for (int i = 0; i < 5; i++){
            int n = arr.get(i);
            sum += n;
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        System.out.println((sum - max) + " " + (sum - min+1));

    }

}

public class Week1MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result2.miniMaxSum(arr);

        bufferedReader.close();
    }
}

