package com.syntax.Replits;

public class replit169 {

    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8
    }


    final static double avgElements(int[] a)
    {
        double sum = 0;
        for(int i:a) sum += i;
        return sum/a.length;

    }
}