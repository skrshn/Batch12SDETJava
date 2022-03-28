package com.syntax.class28;

import java.util.LinkedList;

public class ListDemo4 {
    public static void main(String[] args) {
        Student sakir = new Student("sakir",30,"basketball");
        Student john = new Student("john",35,"football");
        Student michael = new Student("michael",40,"golf");

        LinkedList<Student> list= new LinkedList<>();
        list.add(sakir);
        list.add(john);
        list.add(michael);
        System.out.println(list);
    }
}


class Student {
    String name;
    int age;
    String hobbies;

    public Student(String name, int age, String hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }
}
