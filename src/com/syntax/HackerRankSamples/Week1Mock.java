package com.syntax.HackerRankSamples;

public class Week1Mock {
    public static void main(String[] args) {
        int temp;
        int[] arrNumbers = {14, 8, 5, 54, 41, 10, 1, 500};
        System.out.println("Before sort: ");
        for(int num : arrNumbers)
        {
            System.out.print(num+" ");
        }
        //descending
        for(int a = 0; a <= arrNumbers.length - 1; a++)
        {
            for(int b = 0; b <= arrNumbers.length - 2; b++)
            {
                if(arrNumbers[b] < arrNumbers[b + 1])
                {
                    temp = arrNumbers[b];
                    arrNumbers[b] = arrNumbers[b + 1];
                    arrNumbers[b + 1] = temp;
                }
            }
        }
        System.out.println("");

        System.out.println("After sort: ");
        for(int num : arrNumbers)
        {
            System.out.print(num+" ");
        }
//ascending
        for(int a = 0; a < arrNumbers.length; a++)
        {
            for(int b = a + 1; b < arrNumbers.length; b++)
            {
                if(arrNumbers[a] > arrNumbers[b])
                {
                    temp = arrNumbers[a];
                    arrNumbers[a] = arrNumbers[b];
                    arrNumbers[b] = temp;
                }
            }
        }
        System.out.println("");

        System.out.println("After sort: ");

        for(int num : arrNumbers)
        {
            System.out.print(num+" ");
        }
        System.out.println("");
        if(arrNumbers.length%2!=0)
        System.out.println(arrNumbers[arrNumbers.length/2]);
        else
            System.out.println((arrNumbers[arrNumbers.length/2]+arrNumbers[(arrNumbers.length/2)-1])/2);

    }
    }

