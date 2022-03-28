package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Boolean> flags = new ArrayList<>();
        flags.add(true);
        flags.add(true);
        flags.add(false);
        System.out.println(flags);
        System.out.println(flags.contains(false));


    }
}
