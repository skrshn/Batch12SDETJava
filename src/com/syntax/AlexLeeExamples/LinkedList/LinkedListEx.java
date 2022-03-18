package com.syntax.AlexLeeExamples.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {

        LinkedList<String> linky = new LinkedList<String>();
        linky.add("Rob");
        linky.add("Alex");
        linky.add("Sakir");
       // linky.add(1);
       // linky.clear();
        System.out.println(linky.get(1));

        Iterator it = linky.iterator();
        while(it.hasNext()){
            if(it.next().equals("Alex")){
                System.out.println("We Found Alex");
            }
        }
    }
}
