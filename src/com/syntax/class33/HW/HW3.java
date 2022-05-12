package com.syntax.class33.HW;
//Create a method to check age eligibility that will throw a runtime exception.
//        Method should throw an exception age is less than 16.

import com.syntax.class33.InsufficientBalance;

public class HW3 {
    int age;

    public void checkAgeEligibility(int age) {
        if (age < 16) {
            throw new InsufficientAge("Can't be younger than 16 years old.");
        } else {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        HW3 hw3 = new HW3();
        hw3.checkAgeEligibility(15);
    }

}

class InsufficientAge extends RuntimeException {
    InsufficientAge(String msg) {
        super(msg);
    }
}

