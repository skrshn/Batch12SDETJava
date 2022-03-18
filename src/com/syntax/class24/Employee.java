package com.syntax.class24;

public interface Employee {
    int age = 10;
    void work();
}

class Tester implements Employee {

    @Override
    public void work() {
        System.out.println("Testing a website");
    }

    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.work();
       // Employee.age=12;
        System.out.println(Employee.age);
        Employee tester2=new Tester();   //Polymorphism
    }
}
