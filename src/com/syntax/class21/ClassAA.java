package com.syntax.class21;
//example of super keyword with constructors
public class ClassAA {
    String name;
    int age;
    //double weight;

    public ClassAA(String name, int age) {
        this.name = name;
        this.age = age;
       // this.weight = weight;
    }


}

class ClassBB extends ClassAA {  //we have to create default constructor if we have any other constructors to inherit.
    double weight;
    public ClassBB(String name, int age, double weight) {
        super(name, age);
        this.weight=weight;
        //because constructors from the parent classes do not participate in inheritance we need to create a
        //matching constructor in the child classes as well we can use super() to call the constructor from the
        //parent class so that we don't have to repeat the code.
    }
    void printInfo() {
        System.out.println(name + " " + age + " " + weight);
    }
}
class Test{
    public static void main(String[] args) {
        //ClassBB bb=new ClassBB("Sakir",12,45.65);
        new ClassBB("Sakir",12,45.65).printInfo();
    }
}

