package com.syntax.Replits;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class reverseAlphabeticWordsOnly {
    public static void main(String[] args) {
        System.out.println(reverseWordsOnly("test12pop90java989pyt767!test"));
    }

    public static String reverseWordsOnly(String str) {
        String othersString = str.replaceAll("[a-zA-Z]", " ").trim().replaceAll(" +", " ");
        String wordsString = str.replaceAll("[^a-zA-Z]", " ").trim().replaceAll(" +", " ");

        String[] words = wordsString.split(" ");
        String reverseWords = "";

        String[] others = othersString.split(" ");
        List<String> othersList = new LinkedList<>();
        Collections.addAll(othersList, others);


        for (int i = 0; i < words.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(words[i]);
            StringBuilder reverseStr = stringBuilder.reverse();
            reverseWords += reverseStr + " ";
        }
        System.out.println(others.length);
        for (int i = 0; i < others.length; i++) {

            reverseWords = reverseWords.replaceFirst(" ", othersList.get(i));

            System.out.println(reverseWords);
        }

        return reverseWords;
    }
}