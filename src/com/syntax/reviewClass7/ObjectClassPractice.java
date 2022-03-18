package com.syntax.reviewClass7;

public class ObjectClassPractice {

    String empName;
    int empID;
    String group;

    void employeeDetails() {
        System.out.println("This method shows the details of the employee");
    }

    void employeeGroup() {
        System.out.println("This method shows the group of the employee");

    }

    public static void main(String[] args) {
        ObjectClassPractice obj = new ObjectClassPractice();
        obj.employeeGroup();
        obj.employeeDetails();

    }


}

