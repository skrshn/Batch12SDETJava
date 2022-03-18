package com.syntax.AlexLeeExamples.Recursion;

public class RecursionIsCool2 {
    public static void main(String[] args) {
        countBackwards(5);
    }

    public static void countBackwards(int n) {
        if (n == 0) {
            System.out.println("Done!");
        } else {
            System.out.println(n);
            n--;
            countBackwards(n);
        }
    }
    //need a base case
}
