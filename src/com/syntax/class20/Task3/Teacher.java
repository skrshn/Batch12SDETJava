package com.syntax.class20.Task3;
//Write a Java program called Teacher.  Identify features and behaviour of that Class. Create 3 subclasses MathTeacher,
//        ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes

public class Teacher {
    private String fName;
    private String lName;
    private int age;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void printInfo(){
        System.out.println(fName+" "+lName+" is "+age+" years old.");
    }
}
