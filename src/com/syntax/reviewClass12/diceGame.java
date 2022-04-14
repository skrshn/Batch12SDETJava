package com.syntax.reviewClass12;

import java.util.Random;

//Let's create a game where we roll dice, and move a player around a game board.
//The board has 40 spaces, arranged in a circle
//
//The player starts at position 0.  Loop 30 times.  Each time through the loop, do this:
//- roll the dice (each dice has a random value, 1-6)
//- print player start position, dice value, and ending position
//
//sample output:
//
//     start=0, roll=3, end=3
//     start=3, roll=2, end=5
//     ...
//     start=38, roll=6, end=4

public class diceGame {
    public static void main(String[] args) {
        int totalSpaces = 40;
        int startPosition = 0;
        int endingPosition;

        Random rand = new Random(); //instance of random class
        int lowerBound = 1;
        int upperBound = 7;

        for (int i = 0; i < 30; i++) {
            int rollDice = rand.nextInt(lowerBound, upperBound);
            endingPosition = (startPosition + rollDice) % totalSpaces;
            System.out.println("start=" + startPosition + ", roll=" + rollDice + ", end=" + endingPosition);
            startPosition = endingPosition;
        }
    }
}
