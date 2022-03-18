package com.syntax.class19;

public class CarTester {
    public static void main(String[] args) {
        Car c = new Car("T80","Volvo", "white", "Convertible");
        c.printCar();
        Car c2 = new Car(); //shows null
        c2.printCar();
    }
}
