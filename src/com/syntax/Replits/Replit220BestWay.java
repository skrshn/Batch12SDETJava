package com.syntax.Replits;

public class Replit220BestWay {
    static String formatString(String str) {
        str = new StringBuilder(str.replaceAll("[^0-9]", "").replaceAll("(.{3}),(.{5})", "$0-")).toString();
        return (str.endsWith("-")) ? str.substring(0, str.length() - 1) : str;
    }

    public static void main(String[] args) {
        String str = "00-44 #$% 48 51223423423423423423423423123123334&&*^$%&%^*%xbvcvmnc/b,qw.dsdfw324";
        System.out.println(formatString(str));
    }
}
