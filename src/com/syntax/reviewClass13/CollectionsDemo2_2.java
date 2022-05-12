package com.syntax.reviewClass13;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionsDemo2_2 {
    public static void main(String[] args) {
        ArrayList<Object> names = new ArrayList<>();
        names.add("John");
        names.add("Smith");
        names.add("Jones");
        names.add("Snow");
        names.add("asfhadskjlflh");
        names.add(10);


        //  Iterator<String> iterator=names.iterator();
        //   while (iterator.hasNext()){
        //     if (iterator.next().length()>5){
        //      iterator.remove();
        //   }
        //  }
        //   System.out.println(names);


        ListIterator<Object> stringListIterator = names.listIterator();
        while (stringListIterator.hasNext()) {
            String name = String.valueOf(stringListIterator.next());
            System.out.println(name);

        }
    }

}
