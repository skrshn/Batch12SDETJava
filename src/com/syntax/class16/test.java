package com.syntax.class16;

class Main {

    public static void main(String[] args) {
        String s2 = "Hello Naber nasilsin";
        String reverseString = "";
        for(int i = 0; i<s2.length(); i++)
        {
            String subChar = s2.substring(s2.length()-1-i,s2.length()-i);
            reverseString += subChar;
        }
        System.out.println(reverseString);

    }
}