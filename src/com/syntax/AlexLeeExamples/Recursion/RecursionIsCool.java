package com.syntax.AlexLeeExamples.Recursion;

public class RecursionIsCool {
    public static void main(String[] args) {
        sayHi(3);

    }

    public static void sayHi(int n){
    if (n==0){
        System.out.println("Done!");}
    else{
        System.out.println("hi");
        n--;
        sayHi(n);
    }
    }

    //Need a base case
}
