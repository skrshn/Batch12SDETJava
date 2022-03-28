package com.syntax.class26;

import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        String name1="Sakir";
        String name2="Carla";
    String[] name3={"A","B","C"};
        ArrayList<String> a= new ArrayList<String>();
        a.add(name1);
        a.add(name2);
        a.add(name3[0]);

        System.out.println(a);
    }
}
