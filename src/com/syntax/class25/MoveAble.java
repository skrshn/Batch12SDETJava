package com.syntax.class25;

public interface MoveAble {
    void move();
}

interface DriveAble{
    void drive();
}
interface Car extends DriveAble,MoveAble {

}

class BMW implements Car{
    @Override
    public void drive(){
        System.out.println("we can move the BMW");
    }

    @Override
    public void move(){

        System.out.println("we can drive the BMW");


    }

}

class CarTester{
    public static void main(String[] args) {
        new BMW().drive();
        new BMW().move();

        DriveAble driveAble = new BMW();
        driveAble.drive();

        MoveAble moveAble=new BMW();
        moveAble.move();

        Car car= new BMW();
        car.drive();
        car.move();
    }
}
