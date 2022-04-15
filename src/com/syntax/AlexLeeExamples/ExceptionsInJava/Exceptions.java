package com.syntax.AlexLeeExamples.ExceptionsInJava;

import java.util.ArrayList;

public class Exceptions {
    public static void main(String[] args) {
//        String[] pets= {"dog","cat","monkey"};
//        System.out.println(pets[3]);

        ArrayList<String> list = new ArrayList<>();
        list.add("Book");
        System.out.println(list.get(0));
    }
}
