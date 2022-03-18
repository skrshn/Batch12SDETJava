package com.syntax.class19;
//Write a Student class that have instance variables name and address.
//Create a constructor that will initialize those variables.
//Print name & address of given  student using displayInfo method.

public class HW3 {
    String studentName;
    String studentAddress;

    HW3(String studentName, String studentAddress){
        this.studentName=studentName;
        this.studentAddress=studentAddress;
    }

    void displayInfo(){
        System.out.println(studentName +" "+ studentAddress);
    }

}
