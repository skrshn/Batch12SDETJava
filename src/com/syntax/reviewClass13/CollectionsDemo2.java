package com.syntax.reviewClass13;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("John");
        names.add("Smith");
        names.add("Jones");
        names.add("Snow");
        names.add("asfhadskjlflh");


        //  Iterator<String> iterator=names.iterator();
        //   while (iterator.hasNext()){
        //     if (iterator.next().length()>5){
        //      iterator.remove();
        //   }
        //  }
        //   System.out.println(names);


        ListIterator<String> stringListIterator = names.listIterator();
        while (stringListIterator.hasNext()){
            if(stringListIterator.next().length()>5){
                stringListIterator.remove();
            }
        }
        System.out.println(names);
    }
}

