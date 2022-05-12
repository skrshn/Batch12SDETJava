package com.syntax.Replits;

public class TestReplit220 {
    static String formatString(String str) {
        StringBuilder stringBuilder = new StringBuilder(str.replaceAll("[^0-9]",""));
        for (int i = 3; i < stringBuilder.length(); i+=4) {
            stringBuilder.insert(i,"-");
        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        String str = "00-44 #$% 48 555";

        System.out.println(formatString(str));
    }
}
