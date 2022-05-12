package com.syntax.class33;

public class Math {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void divide(int a, int b) {
     /*   if(b!=0){
            System.out.println(a/b) ;
        }else{
            System.out.println("You are trying to divide by zero which is not possible ");
        }*/

        try {
            System.out.println(a / b);
        } catch (ArithmeticException tristan) {
            System.out.println("You are trying to divide by zero which" +
                    " is not possible " + tristan.getMessage());
        } catch (NullPointerException npe) {

            System.out.println("please initialize the object to avoid this exception");
        }

    }
}