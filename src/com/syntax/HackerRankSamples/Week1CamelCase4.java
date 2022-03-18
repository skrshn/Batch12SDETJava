package com.syntax.HackerRankSamples;

import java.util.Scanner;

public class Week1CamelCase4 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] splits = sc.nextLine().split(";"); // input.split(";");
            String operation = splits[0];
            String type = splits[1];
            String word = splits[2];

            StringBuilder retorno = new StringBuilder();
            if(operation.equals("S")) {
                for (int i = 0; i < word.length(); i++) {
                    if(Character.isUpperCase(word.charAt(i)) && i != 0) {
                        retorno.append(" ")
                                .append(Character.toString(word.charAt(i)).toLowerCase());
                    } else if((Character.isUpperCase(word.charAt(i)) && i == 0) ||
                            Character.isLowerCase(word.charAt(i))) {
                        retorno.append(Character.toString(word.charAt(i)).toLowerCase());
                    }
                }
            } else if(operation.equals("C")) {
                for (int i = 0; i < word.length(); i++) {
                    if(Character.toString(word.charAt(i)).equals(" ") && i != 0) {
                        ++i;
                        retorno.append(Character.toString(word.charAt(i)).toUpperCase());
                    } else if(type.equals("C") && i == 0) {
                        retorno.append(Character.toString(word.charAt(i)).toUpperCase());
                    } else if(type.equals("M") && i == (word.length() -1)) {
                        retorno.append(Character.toString(word.charAt(i)).toLowerCase())
                                .append("()");
                    } else {
                        retorno.append(Character.toString(word.charAt(i)).toLowerCase());
                    }
                }
            }

            System.out.println(retorno);
        }

    }
}
