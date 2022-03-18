package com.syntax.class19;
//Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected) and create 4 objects of this class:
//    1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.
//
//Write program that have static constructor and observe result.
//
//Write a Student class   that have instance variables name and address. Create a constructor that will initialize those variables.
//        Print name & address of given  student using displayInfo method.
//
//Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
//    Instance variables are being initialized
//    Both Constructors are being executed

public class HW1 {
    int v1,v2,v3;

    private HW1(int v1, int v2, int v3){
        System.out.println("Private Constructor");
    }
    public HW1(int v1, int v2){
        System.out.println("Public Constructor");
    }
    protected HW1(int v1){
        System.out.println("Protected Constructor");
    }
    HW1(){
        System.out.println("Default Constructor");
    }

    public static void main(String[] args) {
        HW1 h1 = new HW1();
        HW1 h2 = new HW1(1);
        HW1 h3 = new HW1(1,2);
        HW1 h4 = new HW1(1,2,3);

    }
}
