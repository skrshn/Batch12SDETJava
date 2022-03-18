package com.syntax.AlexLeeExamples.GetterSetter;

public class GettersNSetters {

    String name;
    int age;

    public static void main(String[] args) {
        GettersNSetters a = new GettersNSetters();
        a.sayHappyBirthday("Alex");

    }

    public static void sayHappyBirthday(String name){
        System.out.println("Happy Birthday "+ name);
    }

}
