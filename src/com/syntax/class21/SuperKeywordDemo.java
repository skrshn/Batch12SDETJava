package com.syntax.class21;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.printColor();
    }
}
class GrandParent {
    String color="Blue";
    void printInfo(){
        System.out.println("");
    }
}
class Parent extends GrandParent {
    String color="Black";
    String c= super.color;
}
class Child extends Parent{
    String color="Red";

    void printColor(){
        String color="Green";
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
        System.out.println(c);


    }
}
