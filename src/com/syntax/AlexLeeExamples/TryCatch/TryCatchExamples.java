package com.syntax.AlexLeeExamples.TryCatch;

public class TryCatchExamples {

    public static void main(String[] args) {
        int[] a = {4, 5, 1};

        try {
            System.out.println(a[3]);
        } catch (Exception e) {
            //System.out.println(e);
            System.out.println("An exception happened!");
        }

    }


}
