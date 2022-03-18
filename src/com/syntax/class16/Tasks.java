package com.syntax.class16;
//Create a String that should be combination of letters, numbers and special characters. Find out how many Alphanumeric characters are there in the String.
//        You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” How would you find out how many sentences are in that String?
//        How would you reverse a String word by word? for example
//        // input=>This is sentence i want to reverse
//        // output=>sihT si ecnetnes i tnaw ot esrever
//        How would you check if String is palindrome or not? aba=> true
//        Abbc =>false
//        How would you swap  2 strings without a temporary variable?

import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
        String s ="1234!@#$%esdfAZSX123";
        System.out.println(s.length());
        System.out.println(s.replaceAll("[^A-Za-z0-9]","").length());
        System.out.println("--------------------------------------------------");
        String a1="Is it saturday? Is it raining? Do we have a Java Class today?";
        String[] s1= a1.split("[?]");
        System.out.println(Arrays.toString(s1));
        System.out.println(s1.length);
        System.out.println("--------------------------------------------------");
        StringBuilder a2 = new StringBuilder("This is sentence i want to reverse");
        System.out.println(a2);
        System.out.println(a2.reverse());
        System.out.println("--------------------------------------------------");
        String newStr="";
        StringBuilder a3 = new StringBuilder("This is sentence i want to reverse");
        String a4= a3.toString();
        System.out.println(a4);
        a4= a3.reverse().toString();
        String[] a5=a4.split(" ");
        for (int i = a5.length-1; i >=0 ; i--) {
            newStr=newStr+a5[i]+" ";

        }
        System.out.println(newStr);

        System.out.println("--------------------------------------------------");
        String myString = "anna";
        StringBuilder myString2 = new StringBuilder(myString);
        myString2.reverse();
        String data = myString2.toString();
        if(myString.equals(data)){
            System.out.println("Given String is palindrome");
        }else{
            System.out.println("Given String is not palindrome");
        }
        System.out.println("--------------------------------------------------");
        // Declare two strings
        String a = "Hello";
        String b = "World";

        // Print String before swapping
        System.out.println("Strings before swap: a = " +
                a + " and b = "+b);

        // append 2nd string to 1st
        a = a + b;

        // store initial string a in string b
        b = a.substring(0,a.length()-b.length());

        // store initial string b in string a
        a = a.substring(b.length());

        // print String after swapping
        System.out.println("Strings after swap: a = " +
                a + " and b = " + b);






    }
}
