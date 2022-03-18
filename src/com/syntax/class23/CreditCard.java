package com.syntax.class23;

//Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
//        Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//        Call the method by creating an object of each of the three classes.
public class CreditCard {
    public static void main(String[] args) {
        Card c = new Card(100,.15);
        c.calcInterest();
        Visa v = new Visa(100,.15);
        v.calcInterest();
        AX a = new AX(100,.15);
        a.calcInterest();
        Object asd= new String();


    }
}

class Card {
    double balance;
    double interest;

    void calcInterest() {
        System.out.println( balance * interest);
    }

    Card(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }
}

class Visa extends Card {
    Visa(double balance, double interest) {
        super(balance, interest);
    }
}

class AX extends Card {
    AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    void calcInterest() {
        System.out.println( (balance * interest) + 2);
    }
}

