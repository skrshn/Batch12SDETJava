package com.syntax.class17;
//        Create a Class called Students
//        Create three  variables  Name , ID  and  numberOfStudents
//        Create three objects of the Students Class
//        Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//        Print out  total number of students
public class SyntaxStudents {

    String stdName;
    String stdID;
    static int numberOfStudents=0;

    static int getNumberOfStudents(){
        return numberOfStudents++;
    }

    public static void main(String[] args) {
        SyntaxStudents student1 = new SyntaxStudents();
        student1.stdName="Sakir Sahin";
        student1.stdID="111";
        getNumberOfStudents();

        SyntaxStudents student2 = new SyntaxStudents();
        student2.stdName="John Doe";
        student2.stdID="222";
        getNumberOfStudents();

        SyntaxStudents student3 = new SyntaxStudents();
        student3.stdName="Michael Newman";
        student3.stdID="333";
        getNumberOfStudents();

        System.out.println(getNumberOfStudents());
    }
}
