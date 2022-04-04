package com.syntax.class30.HW;

import java.util.Map;
import java.util.TreeMap;

//Create a Person class with following private fields: name, lastName, age, salary.
//        Variables should be initialized through constructor.
//        Inside the class also create a method to print user details.
//        In Test Class create a Map that will store key in ascending order.
//        In that map store personId and a Person Object. Print each object details.
public class HW2 {
    public static void main(String[] args) {
        Person person1=new Person("Sakir","Sahin",32,40000);
        Person person2=new Person("Michael","Newman",54,48600);
        Person person3=new Person("John","Doe",28,58070);

        TreeMap<String,Person> newMap=new TreeMap<>();

        newMap.put("a",person1);
        newMap.put("b",person2);
        newMap.put("c",person3);

        for (Map.Entry<String,Person> p:newMap.entrySet()
        ) {
            System.out.println(p);
        }
    }
}

class Person{
    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
