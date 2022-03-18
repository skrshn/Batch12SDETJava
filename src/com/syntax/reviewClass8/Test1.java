package com.syntax.reviewClass8;

public class Test1 {
    public void printSmallerDigit(int x, int y){
        if(x<y){
            System.out.println(x+" is smaller one");
        }
        else if(x>y){
            System.out.println(y+" is smaller one");
        }  else
            System.out.println("Both are same");
        }


    public static void main(String[] args) {
        //printSmallerDigit(3,5);
        Test1 obj = new Test1();
        obj.printSmallerDigit(3,5);
        obj.printSmallerDigit(5,8);

    }

}

