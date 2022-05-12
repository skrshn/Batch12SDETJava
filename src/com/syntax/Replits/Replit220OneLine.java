package com.syntax.Replits;

public class Replit220OneLine {
    static String formatString(String str) {
        return (new StringBuilder(str.replaceAll("[^0-9]", "").replaceAll("(.{3})", "$0-")).toString().endsWith("-")) ? new StringBuilder(new StringBuilder(str.replaceAll("[^0-9]", "").replaceAll("(.{3})", "$0-")).toString().replaceAll("[^0-9]", "").replaceAll("(.{3})", "$0-")).toString().substring(0, new StringBuilder(str.replaceAll("[^0-9]", "").replaceAll("(.{3})", "$0-")).toString().length() - 1) : new StringBuilder(str.replaceAll("[^0-9]", "").replaceAll("(.{3})", "$0-")).toString();
    }

    public static void main(String[] args) {
        String str = "00-44 #$% 48 555";
        System.out.println(formatString(str));
    }
}
