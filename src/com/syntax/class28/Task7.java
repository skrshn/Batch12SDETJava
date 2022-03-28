package com.syntax.class28;
//  How can you remove all duplicates from ArrayList?
import java.util.*;

public class Task7 {
    public static void main(String[] args) {

        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);

//        Set<String> set = new HashSet<>(aList);
//        aList.clear();
//        aList.addAll(set);
//
//        System.out.println(aList);

        LinkedHashSet<String> hash=new LinkedHashSet<>(aList);
        aList= new ArrayList<>(hash);
        System.out.println(aList);
    }
}
