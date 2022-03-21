package com.syntax.AlexLeeExamples.ArrayList;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        String[] fruits = new String[3];
        fruits[0]="Mango";
        fruits[1]="Apple";
        fruits[2]="Berry";
        System.out.println(fruits[1]);

        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Berry");
        fruitList.add(1);

        System.out.println(fruitList);



    }
}
