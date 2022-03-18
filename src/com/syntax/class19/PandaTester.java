package com.syntax.class19;

public class PandaTester {

    public static void main(String[] args) {
        Panda p= new Panda("sakir","Polar","black",12.4,45,66.89);
        Panda p2= new Panda("sakir2");
        Panda p3= new Panda("sakir3","Indonesian");

        p.pandaJumps();
        p.printInfo();

        p2.pandaJumps();
        p2.printInfo();

        p3.pandaJumps();
        p3.printInfo();
    }
}
