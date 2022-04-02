package com.syntax.AlexLeeExamples.HashMaps;

import java.util.HashMap;

public class HashMapAwesomeness2 {
    public static void main(String[] args) {
        HashMap<String,String> fun = new HashMap<String,String>();

        fun.put("BobbyJoe1996","FluffyPonies!");
        fun.put("helloKittyFan21","Aloavera?");
        fun.put("coolguy","pass123!");

        System.out.println(fun);
        System.out.println(fun.keySet());
        System.out.println(fun.values());

        fun.remove("helloKittyFan21");
        System.out.println(fun);
        System.out.println(fun.containsValue("pass123!"));
        System.out.println(fun.containsKey("coolguy"));
        fun.replace("BobbyJoe1996"," ");
        System.out.println(fun);


    }
}
