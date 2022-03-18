package com.syntax.class17;

public class HealthyDog {
    String name; //instance
    String color; //instance
    static int numberOfLegs; //static
     void eat(){
        int noOfTimes=3; //local
        System.out.println(name+" eats "+noOfTimes+" times in a day");
    }

    public static void main(String[] args) {
        HealthyDog dog=new HealthyDog(); //local

        dog.name="scooby";
        dog.color="Pink";
        numberOfLegs=4;
        dog.eat();

        HealthyDog dog2=new HealthyDog();
        dog2.name="tomy";
        dog2.color="Navi Blue";
        numberOfLegs=4;
        dog2.eat();
    }
}
