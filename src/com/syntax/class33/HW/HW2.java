package com.syntax.class33.HW;

import com.syntax.AlexLeeExamples.ExceptionsInJava.Exceptions;

import java.util.LinkedList;
import java.util.List;

//Create a static method that will return a List of Exceptions.
//        Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
//        Call your method inside main and print name and details of all Exception objects.
public class HW2 {
    static String arithmeticException() {
        try {
            return String.valueOf(10 / 0);
        } catch (ArithmeticException arithmeticException1) {
            return arithmeticException1.toString();
        }
    }

    static String nullPointerException() {
        try {
            String str = null;
            return String.valueOf(str.length());
        } catch (NullPointerException nullPointerException1) {
            return nullPointerException1.toString();
        }
    }

    static String negativeArraySizeException() {
        try {
            int[] arr = new int[-5];
            return "Array is created, no negative array size.";
        } catch (NegativeArraySizeException negativeArraySizeException1) {
            return negativeArraySizeException1.toString();
        }
    }

    static String indexOutOfBoundsException() {
        try {
            String[] strArr = new String[2];
            return strArr[5];
        } catch (IndexOutOfBoundsException indexOutOfBoundsException1) {
            return indexOutOfBoundsException1.toString();
        }
    }

    static List<String> createListOfExceptions() {
        List<String> listExceptions = new LinkedList<>();
        listExceptions.add(arithmeticException());
        listExceptions.add(nullPointerException());
        listExceptions.add(negativeArraySizeException());
        listExceptions.add(indexOutOfBoundsException());
        return listExceptions;
    }

    public static void main(String[] args) {
        System.out.println(createListOfExceptions());
    }
}