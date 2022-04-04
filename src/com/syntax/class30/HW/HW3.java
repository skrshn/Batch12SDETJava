package com.syntax.class30.HW;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//Create a Map that will store Employee name and salary. Write a logic to retrieve an employee
//        who gets the highest salary. Output should be in the below format
//        John Smith=$100000
public class HW3 {

//    static void findHighestSalary() {
//        double highest=0;
//        String name="";
//        for (String m : map.keySet()
//        ) {
//            if(map.get(m)>highest){
//                highest=map.get(m);
//                name=m;
//
//            }
//        }
//        System.out.println(name+"=$"+highest);
//
//    }
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("Sakir", 50000.0);
        map.put("Michael", 60000.0);
        map.put("Joe", 95000.0);
        map.put("John", 80000.0);
        map.put("Patrick", 85000.0);

        double highestSalary = Collections.max(map.values());
        for (Map.Entry<String,Double> key:map.entrySet()
             ) {
            if(key.getValue()==highestSalary) {
                System.out.println(key.getKey() + "= $" + key.getValue());
            }
        }
    }
}
