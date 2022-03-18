package com.syntax.class22;
//        Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
//        then the message "I love programming languages" should be printed. If some String is passed to it,
//        then in place of "programming languages" the value variable should be printed.
//        Example, if we pass "Java", then "I love Java" should be printed.
public class Task2Programming {
    Task2Programming(){
        System.out.println("I love programming languages");
    }

    Task2Programming(String s){
        System.out.println("I love "+s);
    }


    public static void main(String[] args) {
        new Task2Programming();
        new Task2Programming("Java");
    }

}
