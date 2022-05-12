package com.syntax.reviewClass13;

import java.util.ArrayList;

public class CollectionsDemo3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            names.add("asdasdasdadffddgghjfds");
        }

        long startTime1=System.currentTimeMillis();
        long count1 = names.parallelStream().filter(s->s.length()>5).count();
        long endTime1=System.currentTimeMillis();
        System.out.println(endTime1-startTime1);

        long startTime=System.currentTimeMillis();
        long count = names.stream().filter(s->s.length()>5).count();
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);




    }
}
