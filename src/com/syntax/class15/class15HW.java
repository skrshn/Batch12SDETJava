package com.syntax.class15;

import java.util.Scanner;

public class class15HW {

//    Write a program that reads two people's first
//    names and if they are expecting boy or girl?
//    Based on the input suggests a name for a baby:
//    Example Output:
//    Mom’s first name? Mary
//    Dad’s first name? Daniel
//    Boy or Girl? boy
//    Suggested baby name: DANRY
//    Example Output:
//    Mom’s first name? Mary
//    Dad’s first name? Daniel
//    Boy or Girl? girl
//    Suggested baby name: MAIEL

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Mom’s first name? ");
        String s1= s.nextLine();
        System.out.println("Dad’s first name? ");
        String s2= s.nextLine();
        System.out.println("Boy or Girl? ");
        String s3= s.nextLine();

        if(s1.length()>3 && s2.length()>3) {
            if (s3.equalsIgnoreCase("boy"))
                System.out.println("Suggested baby name: " + s2.substring(0, s2.length()/2).toUpperCase() + s1.substring(s1.length()/2, s1.length()).toUpperCase());
            else if (s3.equalsIgnoreCase("girl"))
                System.out.println("Suggested baby name: " + s1.substring(0, s1.length()/2).toUpperCase() + s2.substring(s2.length()/2));
            else
                System.out.println("Invalid");
        }
        else
            System.out.println("Mom or Dads name is not more than 3 chars");







    }

}
