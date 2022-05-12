package com.syntax.class33;

public class NullPointerDemo {
    public static void main(String[] args) {
        String str=null;
        //we ge the null pointer exception when a method is called on an object which is not
        //initialized
         str.length();
        //Dog dog=null;
        //  dog.toString();
        int [] arr=new int[-5];
    }
}
