package com.syntax.class21;
//Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
//In circle class create a method to calculate the area of circle. Test your code

import static java.lang.Math.pow;

public class Shape {
    int radius;

    public Shape(int radius) {
        this.radius = radius;
    }
}

class Circle extends Shape {
    public Circle(int radius) {
        super(radius);
    }

    void area() {
        System.out.println(Math.PI * pow(radius,2));
    }

}

class Tester {
    public static void main(String[] args) {
        new Circle((2)).area();
    }
}
