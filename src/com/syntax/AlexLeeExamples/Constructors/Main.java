package com.syntax.AlexLeeExamples.Constructors;

public class Main {
    public static void main(String[] args) {
        Shirt s = new Shirt("White",'M');


//        s.setColor("White");
//        s.setSize('M');
//        s.putOn();
//        s.putOff();

        System.out.println(s.color);
        System.out.println(s.size);

    }
}
