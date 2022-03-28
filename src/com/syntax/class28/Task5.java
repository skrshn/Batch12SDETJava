package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

//Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and
//        cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and
//        Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList.
//        Using for loop/advanced for loop/ iterator access all methods of the class.
public class Task5 {
    public static void main(String[] args) {
        ArrayList<Insurance> ins = new ArrayList<>();
        ins.add(new Car("Basic Insurance", "BMW"));
        ins.add(new Pet("Basic Insurance", "Dog"));
        ins.add(new Health("Basic Insurance"));

        for (Insurance i : ins
        ) {
            i.getQuote();
            i.cancelInsurance();
        }

        Iterator<Insurance> iterator= ins.iterator();
        while(iterator.hasNext()){
            iterator.next().getQuote();
        }

        Iterator<Insurance> iterator2= ins.iterator();

        while(iterator2.hasNext()){
            iterator2.next().cancelInsurance();
        }
    }
}

abstract class Insurance {
    String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    abstract void getQuote();

    abstract void cancelInsurance();
}

class Car extends Insurance {
    String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName + ": Here is your Quote for " + carModel);
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName + ": Your insurance cancelled for " + carModel);
    }
}

class Pet extends Insurance {
    String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName + ": Here is your Quote for " + petType);
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName + ": Your insurance cancelled for " + petType);
    }
}

class Health extends Insurance {
    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName + ": Here is your Quote for Health");
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName + ": Your insurance cancelled for Health");
    }
}
