package com.syntax.reviewClass13;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> personInfo =new HashMap<>(); //Map is storing Integer as keys and String as values
        personInfo.put(11111,"Teyfur");
        personInfo.put(12352,"Salim");
        personInfo.put(456656,"Gulden");
        personInfo.put(848568,"Pot");
        personInfo.put(84678,"Eric");

        for(Map.Entry<Integer,String> entry: personInfo.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
