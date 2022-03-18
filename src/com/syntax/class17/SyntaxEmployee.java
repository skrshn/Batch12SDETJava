package com.syntax.class17;
//        Create a Class called Employee:
//        Create three  variables  empID , salary and set the CEO to “Sumair”
//        Create two objects of the class Employee
//        Set the value of eID, salary for each of the objects
//        Print out the eID , salary and  CEO for each of the objects

public class SyntaxEmployee {
    String empID;
    double salary;
    static String ceo="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee emp = new SyntaxEmployee();
        emp.empID="123";
        emp.salary=1000.00;
        System.out.println(emp.empID+" "+emp.salary+" "+ceo);

        SyntaxEmployee emp2 = new SyntaxEmployee();
        emp2.empID="456";
        emp2.salary=1500.00;
        System.out.println(emp2.empID+" "+emp2.salary+" "+ceo);

    }
}
