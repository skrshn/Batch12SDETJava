package com.syntax.class33.HW;

import java.util.Scanner;

//How would handle InputMismatchException? Input Mismatch Exception
//        when user enters mismatch value then programmer expected.
public class HW1 {
    int age;
    String name;

    public HW1(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void display() {
        System.out.println("Name of the student is: " + name);
        System.out.println("Age of the student is: " + age);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        HW1 obj = new HW1(name, age);
        obj.display();
    }


}
