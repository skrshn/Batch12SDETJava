package com.syntax.classReview;

public class Class05 {

    public static void main(String[] args){

        for(int r=5;r>=1;r--) {
            for (int c = 1; c <= 4; c++) {
                System.out.print(r + " ");
            }
            System.out.println();

        }
        System.out.println("-------------------------");


        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        for(int row=5; row>=0; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }

        System.out.println("-------------------------");



        int[][] array = { { 1, 2 }, { 3, 4 } };




    }
}
