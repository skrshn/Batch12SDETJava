package com.syntax.class30.HW;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Create a map of Best Buy store. Place
//        item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//        Retrieve all keys and values from a Best Buy map using EntrySet.
public class HW1 {
    public static void main(String[] args) {
        Map<Integer,String> bestBuyStore = new HashMap<>();
        bestBuyStore.put(7664847,"Printer");
        bestBuyStore.put(7879885,"TV");
        bestBuyStore.put(7577842,"Laptop");
        bestBuyStore.put(7572841,"Camera");
        bestBuyStore.put(7577847,"Game Console");
        //bestBuyStore.entrySet();

        for (Map.Entry<Integer, String> entry : bestBuyStore.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

//        Iterator<Map.Entry<Integer,String>> iterator=bestBuyStore.entrySet().iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
