package com.syntax.HackerRankSamples;

import java.util.HashSet;
import java.util.Set;

public class Week2Pangram {
    public static void main(String[] args) {

        String s="We promptly judged antique ivory buckles for the next prize";
        Set<Character> alphabet = new HashSet<>();
        for (char c :
                s.toCharArray()) {
            if (Character.isLetter(c)) {
                char C = Character.toUpperCase(c);
                alphabet.add(C);
            }
        }
        if (alphabet.size()==26)
            System.out.println("pangram");
        else System.out.println("not pangram");

    }


}
