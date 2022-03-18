package com.syntax.class18;
//Create a method that will accept an array as parameters and will
//return a sum of all elements from that array.
//Method should be visibly only within same package and accessible
//by the creating an instance of the class.
//Create a method that will take a String as a
//parameter and returns reversed String.
//Method should be available to all classes within
//your project and accessible by class name.
//Create a method that will accept a String as
//a parameter and return a new String that consist only of vowels.
//Method should be available inside the class only where
//it was declared and executed by calling it is name.


public class Test1 {
     int sumArray(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++)
            sum+=arr[i];

        return sum;
    }

    public static String reverse(String str){
//        String reverseStr="";
//        StringBuilder s1=new StringBuilder(str);
//        reverseStr=s1.reverse().toString();
//
//        return reverseStr;
        return new StringBuilder(str).reverse().toString();
    }

    private static String vowels(String str1){
//        String vowelsOnly="";
//        for(int i=0;i<str1.length();i++) {
//            if (str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i' || str1.charAt(i)=='u' || str1.charAt(i)=='o')
//            {
//            vowelsOnly += str1.charAt(i);
//
//            }
//        }
//        return vowelsOnly;

        return str1.replaceAll("[^aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        Test1 t= new Test1();
        int[] arr = new int[]{1,4,5,6};
        System.out.println(t.sumArray(arr));
        System.out.println(t.reverse("sakir elonu"));
        System.out.println(t.vowels("sakir elonu"));
    }
}
