package com.syntax.class22;
//        Create 1 class with a static method that has 3 overloaded forms.
//        Then call each overloaded method with specific arguments and observe result.
public class Task3 {
    int num1;
    int num2;
    int num3;

    static void sum(int num1){ System.out.println(num1); }
    static void sum(int num1, int num2){System.out.println(num1+num2);}
    static void sum(int num1, int num2, int num3){System.out.println(num1+num2+num3);}

    public static void main(String[] args) {
        sum(10);
        sum(10, 10);
        sum(10, 10, 10);
    }
}
