package com.syntax.class22;
//        Create 1 class with a private method that has 3 overloaded forms.
//        Then call each overloaded method with specific arguments and observe result.
public class Task4 {
    int num1;
    int num2;
    int num3;

    private void sum(int num1){ System.out.println(num1); }
    private void sum(int num1, int num2){ System.out.println(num1+num2); }
    private void sum(int num1, int num2, int num3){ System.out.println(num1+num2+num3); }

    public static void main(String[] args) {
        Task4 t=new Task4();
        t.sum(10);
        t.sum(10, 10);
        t.sum(10, 10, 10);
    }
}
