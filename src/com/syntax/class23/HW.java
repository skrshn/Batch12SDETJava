package com.syntax.class23;

import java.util.Random;

//Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
//        Define common behavior within parent class and override some of the methods in child classes
//        Define some methods specific to child classes
//        Write example of achieving run time polymorphism
public class HW {
    public static void main(String[] args) {
        SyntaxStudent student1= new SyntaxStudent("Sakir","Sahin",12345);
        student1.printStudent();
        student1.addRandomGrade();

        //Polymorphism
        Student student2=new CollegeStudent("Asghar","'s Last Name",67890);
        student2.printStudent();

        //Polymorphism
        Student student3 = new SchoolStudent("Michael","Newman",53719);
        student3.printStudent();
    }
}

class Student{
    protected String fName;
    protected String lName;
    protected int stuID;

    Student(String fName,String lName, int stuID){
        this.fName=fName;
        this.lName=lName;
        this.stuID=stuID;
    }
    protected void printStudent(){
        System.out.println(fName+" "+ lName+" with ID of "+stuID+" is a student.");
    }

}
class SyntaxStudent extends Student{
    private boolean isSyntaxStudent=true;

    SyntaxStudent(String fName, String lName, int stuID) {
        super(fName, lName, stuID);
    }

    @Override
    protected void printStudent(){
        System.out.println(fName+" "+ lName+" with ID of "+stuID+" is a Syntax student?: " + isSyntaxStudent);
    }
    void addRandomGrade(){
        Random rand = new Random();
        int randGrade = rand.nextInt(100);  //generates random number starting from 0<=randGrade<=100
        char grade=' ';

        if(randGrade>=80) {grade='A';}
        else if(randGrade>=60 && randGrade<80) {grade='B';}
        else if(randGrade>=40 && randGrade<60) {grade='C';}
        else { grade='D';}

        System.out.println(fName+" "+ lName+" with ID of "+stuID+" grade is: "+grade+" ("+randGrade+")");
    }
}
class CollegeStudent extends Student{
    private boolean isCollegeStudent=true;
    CollegeStudent(String fName, String lName, int stuID) {
        super(fName, lName, stuID);
    }
    @Override
    protected void printStudent(){
        System.out.println(fName+" "+ lName+" with ID of "+stuID+" is a College student?: " +isCollegeStudent);
    }
}
class SchoolStudent extends Student{
    SchoolStudent(String fName, String lName, int stuID) {
        super(fName, lName, stuID);
    }
}
