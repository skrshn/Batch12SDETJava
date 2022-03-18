package com.syntax.class20.Task3;

public class PianoTeacher extends Teacher{
    public static void main(String[] args) {
        PianoTeacher p = new PianoTeacher();
        p.setfName("Mahmut");
        p.setlName("Hanefi");
        p.setAge(59);

        System.out.println(p.getfName());
        System.out.println(p.getlName());
        System.out.println(p.getAge());

        p.printInfo();
    }
}
