package com.syntax.class30.HW;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//Create a collection of integers in which you can keep duplicates.
//        Write a logic to find sum of all integers
public class HW5 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(5);

        Iterator<Integer> it=list.iterator();
        int sum=0;
        while(it.hasNext()){
            sum+=it.next();
        }
        System.out.println(sum);
    }
}
