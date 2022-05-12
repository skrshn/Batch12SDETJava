package com.syntax.class33;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("Opening the application");
        System.out.println("Displaying the welcome messages");
        System.out.println("User is trying to use some feature 1");
        System.out.println("User is trying to use some feature 2");
        try{System.out.println(10/0);}catch(Exception e){
            System.out.println(e);
        }
        System.out.println("User is trying to use some feature 3");
        System.out.println("User is trying to use some feature 4");
        System.out.println("User is trying to use some feature 5");
    }
}
