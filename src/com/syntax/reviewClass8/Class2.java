package com.syntax.reviewClass8;

import java.util.Locale;

public class Class2 {

//    String userName;
//    String password;

    String generateUsername(String firstName, String lastName) {
        return firstName + "123" + lastName + ".com";
    }

    static void moreedDemand() {
        System.out.println("This is method");
    }

    public static void main(String[] args) {

       // moreedDemand();

StringBuilder s = new StringBuilder("asd asd");
        System.out.println(s);


String t="Asda sd";
        System.out.println(t.startsWith("[Aa]"));
        System.out.println( t.toLowerCase().startsWith("a"));
String[] asd=t.split(" ");
        for (String asdd:asd
             ) {
            System.out.println(asdd);

        }
    }

}
