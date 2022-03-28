package com.syntax.class25;

public class Task01 {
    public static void main(String[] args) {
        Computer[] comp = {new Apple("Apple"),new Lenovo("Lenovo"), new HP("HP"), new Dell("Dell")};
        for (Computer c:comp
             ) {
            c.login();

        }
    }
}

abstract class Computer{
    String make;
    Computer(String make){
        this.make=make;
    }
    abstract void login();

}

class Apple extends Computer{
    Apple(String make){
        super(make);
    }
    void login(){
        System.out.println("Apple - Use username and pass word to login");
    }
}
class Lenovo extends Computer{
    Lenovo(String make){
        super(make);
    }
    void login(){
        System.out.println("Lenovo - Use username and pass word to login");
    }
}
class HP extends Computer{
    HP(String make){
        super(make);
    }
    void login(){
        System.out.println("HP - Use username and pass word to login");
    }
}
class Dell extends Computer{
    Dell(String make){
        super(make);
    }
    void login(){
        System.out.println("Dell - Use username and pass word to login");
    }
}
