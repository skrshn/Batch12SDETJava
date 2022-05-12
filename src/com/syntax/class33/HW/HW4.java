package com.syntax.class33.HW;
//Create a method checkUserName that will throw a runtime exception.
//        Method should throw an exception when entered username is less than 5 characters.
public class HW4 {
    String username;

    public void checkUsernameEligibility(String username) {
        if (username.length() < 5) {
            throw new InsufficientUsername("Username cannot be less than 5 characters.");
        } else {
            this.username = username;
        }
    }

    public static void main(String[] args) {
        HW4 hw4 = new HW4();
        hw4.checkUsernameEligibility("saki");
    }

}

class InsufficientUsername extends RuntimeException {
    InsufficientUsername(String msg) {
        super(msg);
    }
}

