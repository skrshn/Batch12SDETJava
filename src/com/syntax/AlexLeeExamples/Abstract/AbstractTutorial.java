package com.syntax.AlexLeeExamples.Abstract;
interface DogInterface{       //everything inside interface is abstract. You cannot write code inside abstract methods. it has to be empty.
    void poop();
        }

abstract class Dog{        //abstract method means define variables and method for future use. Abstract methods has to be empty. Every obj that create with abstract class must have same functions/methods.
    String breed;          //help to organize your class for future use.

    public void bark() {
        System.out.println("Bark!");
    }
    public abstract void poop();

}

class Chihuahua2 implements DogInterface{   //for Interface, you have to use implements keyword instead of extends like inheritance. Because we are not extending/inheriting the class.
                                            //Extending means adding on to previously implementing methods.
    public void poop(){
        System.out.println("Dog pooped.");
    }

}

class Chihuahua extends Dog{   //you have to inherit to invoke abstract class variables and methods.

    public void poop(){
        System.out.println("Dog pooped.");
    }

}
public class AbstractTutorial {

    public static void main(String[] args) {
        Chihuahua c = new Chihuahua();
        c.bark();
        c.poop();



    }

}
