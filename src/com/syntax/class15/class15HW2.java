package com.syntax.class15;

public class class15HW2 {

//    Create a String and if the String is not empty perform the following:
//            if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
//    Create a String and print it in reverse order (Sunday → yadnuS).

    public static void main(String[] args) {

        String s1 = "1111-2-3333";
        String s2 = "Sunday Monday";

        //middle char
        if (s1.length() >= 3 && s1.length() % 2 == 1)
            System.out.println(s1.charAt(s1.length() / 2));

        System.out.println("---------------------");

        //reverse
        for (int i = s2.length() - 1; i >= 0; i--)
            System.out.print(s2.charAt(i));

        System.out.println();
        System.out.println("---------------------");

        //substring reverse
        String reverseString = "";
        for(int i = 0; i<s2.length(); i++)
        {
            String subChar = s2.substring(s2.length()-1-i,s2.length()-i);
            reverseString += subChar;
        }
        System.out.println(reverseString);

        //each word reverse
        String words[]=s2.split(" ");
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        System.out.println(reverseWord);


    }
}
