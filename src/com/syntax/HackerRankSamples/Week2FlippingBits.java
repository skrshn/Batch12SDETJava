package com.syntax.HackerRankSamples;

public class Week2FlippingBits {

    public static long flippingBits(long n) {
        // Write your code here
        long maxInt=(long)Math.pow(2, 32)-1;
        System.out.println( maxInt);
        System.out.println( n);

        return maxInt - n;}

    public static void main(String[] args) {

        Week2FlippingBits w=new Week2FlippingBits();

        System.out.println( flippingBits(429496799));

    }
}
