package com.syntax.class21;

public class MethodOverloadingDemo {

    static void printInfo(String name, int age, double weight) {
        System.out.println("M1");
        System.out.println(name + " " + age + " " + weight);
    }

    static void printInfo(int age, String name, double weight) {
        System.out.println("M2");
        System.out.println(name + " " + age + " " + weight);
    }

    static void printInfo(int age, double weight, String name) {
        System.out.println("M3");
        System.out.println(name + " " + age + " " + weight);
    }

    static void printInfo(double weight, int age, String name) {
        System.out.println("M4");
        System.out.println(name + " " + age + " " + weight);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo m = new MethodOverloadingDemo();
        m.printInfo("Zulfiya", 16, 28.0);
        m.printInfo(16, "Zulfiya", 28.0);
        m.printInfo(16, 28.0, "Zulfiya");
        m.printInfo(28.0, 16, "Zulfiya");


    }
}
