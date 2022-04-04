package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo6 {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap=new HashMap<>();
        //fruitMap.put("Apple",20); auto casting does not work in collections and maps
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Kiwi",105.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",20.0);

        System.out.println( fruitMap.keySet());
        System.out.println( fruitMap.values());
        System.out.println( fruitMap.entrySet());
        //getting keys and values in the form of an entry(Map.Entry)
      Iterator<Map.Entry<String,Double>> iterator=fruitMap.entrySet().iterator();
      while (iterator.hasNext()){
          //System.out.println(iterator.next());
          System.out.println(iterator.next().getValue());
      }
    }
}
