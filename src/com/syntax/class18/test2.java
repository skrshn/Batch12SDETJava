package com.syntax.class18;

import java.text.DecimalFormat;
import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();

        df.setMinimumFractionDigits(6);
        int[] arr = new int[]{-4, 3, -9, 1, 4, 0};
        Arrays.sort(arr);


        double zero=0;
        double min=0;
        double plus=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == 0){
                zero+=1;
            }
            else if(arr[i] > 0){
                plus+=1;
            }
            else
                min=+1;

        }
        System.out.println(df.format(plus/arr.length));
        System.out.println(df.format(min/arr.length));
        System.out.println(df.format(zero/arr.length));


    }
}
