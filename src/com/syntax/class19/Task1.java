package com.syntax.class19;
//        Write a java class that will have a constructor: one with parameters and second without any parameters.
//        Create a separate Test class where you will execute both of the constructors 1 by 1.


public class Task1 {
    String name;
    int age;

    Task1(String name, int age){
        this.name=name;
        this.age=age;
    }

    Task1(){}

    void printTask1(){
        System.out.println(name+" "+age);
    }
}
