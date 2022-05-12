package com.syntax.Replits;

import java.util.Arrays;

public class sumOf2DArray {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 6, 1},
                {5, 1, 1},
                {1, 1, 1}};
        int[][] arr2 = {{1, 1, 1},
                {4, 1, 3},
                {1, 5, 1}};
        //Arrays.deepToString(sum2D(arr1, arr2));
       print2D( sum2D(arr1, arr2));

    }

    static void print2D(int[][] sum2D){
        for (int[] x : sum2D)
        {
            for (int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
    public static int[][] sum2D(int[][] arr1, int[][] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] += arr2[i][j];
            }
        }
        return arr1;
    }

}
