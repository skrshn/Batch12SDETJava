package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

//Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 1; i <=500 ; i+=2) {
            evenNumbers.add(i);
        }

        //System.out.println(evenNumbers);


        //evenNumbers.removeIf(i -> i % 5 == 0);

        Iterator<Integer> iterator=evenNumbers.iterator();
        while(iterator.hasNext()){
            if(iterator.next()%5==0){
                iterator.remove();
            }
        }
        System.out.println(evenNumbers);
    }
}
