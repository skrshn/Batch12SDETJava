package com.syntax.class30.HW;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
//        Check how many entries you have?
//        Update company on a 4th floor
//        Remove company on the 7th floor
//        Print your map
public class Task1 {
    public static void main(String[] args) {
        Map<Integer,String> building= new HashMap<>();
        building.put(1,"Google");
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(2,"Syntax");
        building.put(3,"Yahoo");
        building.put(3,"Yahoo");
        building.put(4,"Apple");
        building.put(4,"Apple");
        building.put(5,"Microsoft");
        building.put(5,"Microsoft");
        building.put(6,"Pepsi");
        building.put(6,"Pepsi");
        building.put(7,"FedEx");
        building.put(7,"FedEx");
        building.put(8,"Usps");
        building.put(8,"Usps");

        System.out.println(building.size());
        building.replace(4,"Tesla");
        building.remove(7);
        System.out.println(building.size());

        System.out.println(building);

        Iterator<Map.Entry<Integer,String>> it= building.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> entry = it.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
