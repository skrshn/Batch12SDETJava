package com.syntax.class25;

interface Human {
     int legs = 2;
     void walk();
     static void printLegs(){
         System.out.println(legs);
     }
     default void noNeedToWorry(){
         System.out.println("Default Methods are there to functional programming");
     }


}
class LivingBeing {
    static void printLegs(){
        System.out.println("Not sure");
    }
}

class Sak implements Human{

    @Override
    public void walk(){
        System.out.println("I can walk");

    }
}
class HumanTester{
    public static void main(String[] args) {
    Sak s = new Sak();
    s.walk();
    Human.printLegs();
    s.noNeedToWorry();
    LivingBeing.printLegs();
}
}
