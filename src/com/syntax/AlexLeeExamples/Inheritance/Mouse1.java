package com.syntax.AlexLeeExamples.Inheritance;

public class Mouse1 extends Mouse{
    String texture = "Matte";


    public static void setColor(String color){
        System.out.println(color);

    }

    public static void main(String[] args) {
        leftClick();
    }
}
