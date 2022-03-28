package com.syntax.class28;
//Create a Card class that will have implemented  and unimplemented methods and a constructor that will
//        initializes credit card type.  Create 3 subclasses of a Card card. Create 3 objects of different card
//        and store them into LinkedList. Using for loop/advanced for loop/ iterator access all methods of the class.

import java.util.LinkedList;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<Card> cards = new LinkedList<>();
        cards.add(new Card1("AMEX"));
        cards.add(new Card2("Chase"));
        cards.add(new Card3("Bank of America"));

        for (Card card : cards
        ) {
           card.unimplementedMethod();
           card.implementedMethod();
        }
    }
}

abstract class Card{
    String cardType;

    public Card(String cardType) {
        this.cardType = cardType;
    }
    abstract void unimplementedMethod();
    void implementedMethod(){
        System.out.println("Implemented Method of "+cardType);
    }
}
class Card1 extends Card{
    public Card1(String cardType) {
        super(cardType);
    }

    @Override
    void unimplementedMethod() {
        System.out.println("Unimplemented Method of "+cardType);
    }
}
class Card2 extends Card{
    public Card2(String cardType) {
        super(cardType);
    }
    @Override
    void unimplementedMethod() {
        System.out.println("Unimplemented Method of "+cardType);
    }
}
class Card3 extends Card{
    public Card3(String cardType) {
        super(cardType);
    }
    @Override
    void unimplementedMethod() {
        System.out.println("Unimplemented Method of "+cardType);
    }
}
