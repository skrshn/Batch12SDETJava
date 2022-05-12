package com.syntax.Replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Replit220 {
    static String formatString(String str) {
        //1st Way
//       StringBuilder stringBuilder = new StringBuilder(str.replaceAll("[^0-9]",""));
//        for (int i = 3; i < stringBuilder.length(); i+=4) {
//            stringBuilder.insert(i,"-");
//        }
//       return stringBuilder.toString();

        //2nd Way
//        str = new StringBuilder(str.replaceAll("[^0-9]", "").replaceAll("(.{3})", "$0-")).toString();
//        if(str.endsWith("-")){
//            return str.substring(0,str.length()-1);
//        }else
//            return str;

        //3rd Way
        str = new StringBuilder(str.replaceAll("[^0-9]", "").replaceAll("(.{3})", "$0-")).toString();
        return (str.endsWith("-")) ? str.substring(0,str.length()-1) : str;

        //4th Way

       // return (str.endsWith("-")) ? str.substring(0, str.length() - 1) : str;
    }

    public static void main(String[] args) {
        String str = "00-44 #$% 48 555";
        //1,2,3 Way
         System.out.println(formatString(str));

        //4th Way
        //System.out.println(formatString(new StringBuilder(str.replaceAll("[^0-9]", "").replaceAll("(.{3})", "$0-")).toString()));

    }
}
