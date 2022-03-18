package com.syntax.AlexLeeExamples.GetterSetter;
//trick is you can generate getters and setters, right click, generate and click getters and setters.
public class Account {
    String name;
    int age;

    public static void main(String[] args) {
        Account a=new Account();
        a.setName("Rick");
        a.setAge(14);
        System.out.println(a.getName());
        System.out.println(a.getAge());

//        a.age = 34;
//        a.name="Pablo";

        //System.out.println(a.age);
        //System.out.println(a.name);
        a.printDetails();
    }
//    public void setName(String name){
//        this.name=name;
//    }
//    public void setAge(int age){
//        this.age=age;
//    }
//    public String getName(){
//        return this.name;
//    }
//    public int getAge(){
//        return this.age;
//    }
    public void printDetails(){
        System.out.println(getName() +", "+ getAge());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
