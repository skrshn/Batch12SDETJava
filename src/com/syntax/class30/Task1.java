package com.syntax.class30;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a map of a building. Store floor number and it is associated company name.
        (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
         */

       /* List<String> list=new LinkedList<>();
        list.addFirst("Anton");*/

        HashMap<Integer,String> buildings=new HashMap<>();
        buildings.put(1,"Google");
        buildings.put(2,"Apple");
        buildings.put(3,"Tesla");
        buildings.put(1,"Amazon");
        buildings.put(5,"Amazon");
        buildings.put(4,"Syntax");
        buildings.put(7,"Multiverse");
//        List<String> list=new LinkedList<>();
//        list.addFirst("Anton");
        System.out.println(buildings.size());
        System.out.println(buildings);
        buildings.replace(4,"Facebook"); // update teh value
        System.out.println(buildings);
        buildings.remove(7);
        Iterator<Map.Entry<Integer,String>> it= buildings.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> entry = it.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        //System.out.println(buildings);






    }
}
