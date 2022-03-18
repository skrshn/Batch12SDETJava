package com.syntax.class19;
//        Write a java Class Students that have a constructor which takes students name and 3 subject grades.
//        Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students
//        with different marks. Your program should print an average mark of each students name.

public class Task2 {
    String studentName;
    int grade1;
    int grade2;
    int grade3;

    Task2(String studentName, int grade1, int grade2, int grade3){
        this.studentName=studentName;
        this.grade1=grade1;
        this.grade2=grade2;
        this.grade3=grade3;

    }

    int calculateAvgGrade(int grade1,int grade2,int grade3){

        return (this.grade1+this.grade2+this.grade3)/3;
    }
    void printGrades(){
        System.out.println(this.studentName+"'s average grade is "
                + calculateAvgGrade(grade1,grade2,grade3));
    }

}
