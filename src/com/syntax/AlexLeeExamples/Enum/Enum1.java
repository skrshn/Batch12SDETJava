package com.syntax.AlexLeeExamples.Enum;

public class Enum1 {

    //static String[] levels = {"Low", "Medium", "High"};

    public static void main(String[] args) {
//        System.out.println(levels[0]);
//        System.out.println(levels[1]);
//        System.out.println(levels[2]);
        Level l = Level.LOW;
        System.out.println(l);
        System.out.println(Level.HIGH);

        switch(l){
            case LOW:
                System.out.println("Low Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
        }
    }
}

enum Level {
    LOW, MEDIUM, HIGH;
}
