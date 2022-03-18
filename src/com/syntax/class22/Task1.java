package com.syntax.class22;
//Create 1 class in which create a methods that will calculate the area (volume in case of box) of Rectangle Square Box
public class Task1 {
    int width, length, height;

    static int calculateArea(int width) { return (int) Math.pow(width, 2); }

    static int calculateArea(int width, int length) { return width * length; }

    static int calculateArea(int width, int length, int height) {
        return width * length * height;
    }

    public static void main(String[] args) {
        System.out.println("Square Area: "+calculateArea(10));
        System.out.println("Rectangle Area: "+calculateArea(10, 5));
        System.out.println("Box Area: "+calculateArea(10, 5, 5));
    }
}
