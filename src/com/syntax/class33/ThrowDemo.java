package com.syntax.class33;

public class ThrowDemo {
    public static void main(String[] args) {
        Account acc= new Account();
        try {
            acc.setBalance(-15);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
