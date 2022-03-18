package com.syntax.class24;

//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//        Define common behavior within and some fields in parent class and override some of the methods in child classes
//        Define some methods specific to child classes
//        Create objects of child classes and store them into array. Loop through each object and execute available methods.
abstract class Computer {
    void browseInternet() {
        System.out.println("Browsing on Internet");
    }

    void sendMessage() {
        System.out.println("Sending a message");
    }

    abstract void osType();

    abstract void ramStatus();
}

class Apple extends Computer {
    @Override
    void osType() {
        System.out.println("Mac OS");
    }

    @Override
    void ramStatus() {
        System.out.println("16 GB RAM");
    }
}

class Lenovo extends Computer {
    void osType() {
        System.out.println("Lenovo Windows OS");
    }

    @Override
    void ramStatus() {
        System.out.println("8 GB RAM");
    }
}

class HP extends Computer {
    void osType() {
        System.out.println("HP Windows OS");
    }

    @Override
    void ramStatus() {
        System.out.println("4 GB RAM");
    }
}

class Dell extends Computer {
    void osType() {
        System.out.println("Dell Windows OS");
    }

    @Override
    void ramStatus() {
        System.out.println("2 GB RAM");
    }
}

public class HW {
    public static void main(String[] args) {

        Computer[] comp = new Computer[]{new Apple(), new Lenovo(), new HP(), new Dell()};

        for (Computer elements : comp) {
            elements.browseInternet();
            elements.sendMessage();
            elements.osType();
            elements.ramStatus();
        }
    }
}
