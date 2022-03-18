package com.syntax.class21;

public class ClassA {
    void method(){
        System.out.println("Method from ClassA");
    }
}
class ClassB extends ClassA {
    void method(){
        System.out.println("Method from ClassB");
    }
        void test(){
        method();
        this.method();
        super.method();
    }
}
class Test3{
    public static void main(String[] args) {
        ClassB classB= new ClassB();
        classB.test();
    }
}
