package com.syntax.class28;
//Create a Set collection that will hold Objects of Student Type. In this set we do not care about the insertion order.
//        Each student object should have name and studentID. Display name of each student.

import java.util.HashSet;

public class Task10 {
    public static void main(String[] args) {
        HashSet<StudentType> students = new HashSet<>();

        students.add(new StudentType("Sakir", 123));
        students.add(new StudentType("Michael", 456));
        students.add(new StudentType("John", 789));
        students.add(new StudentType("Jane", 987));
        students.add(new StudentType("Mary", 654));
        students.add(new StudentType("Johnny", 321));

        for (StudentType student : students
        ) {
            student.displayName();
        }
    }
}

class StudentType {
    String studentName;
    int studentID;

    public StudentType(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    void displayName() {
        System.out.println("Student Name: " + studentName);
    }
}