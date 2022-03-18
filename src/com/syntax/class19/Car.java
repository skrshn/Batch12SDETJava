package com.syntax.class19;

public class Car {
    String name;
    String make;
    String color;
    String type;

    public Car(String name, String make, String color, String type) {
        this.name = name;
        this.make = make;
        this.color = color;
        this.type = type;
    }
    Car(){

    }
    void printCar(){
        System.out.println(name+" "+make+" "+color+" "+type);
    }
}
