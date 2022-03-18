package com.syntax.class14;

public class HWClass14 {
//    Accept username, password and confirm password from a user and check following requirements:
//    Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
//    Password should be minimum 8 characters, if less → message=”Password is too short”.
//    Password cannot contain username if so, → message=”Password cannot contain username”.
//    Password should match confirmed password, if not  → message=“Passwords do not match”.
//    Only after all requirements met → message “Your username and password has been created”

    String checkCred(String s1, String s2, String s3){

        if(s1.isEmpty() || s2.isEmpty())
            return "Username and Password cannot be empty";
        else if(s2.length()<8)
            return "Password is too short";
        else if(s2.contains(s1))
            return "Password cannot contain username";
        else if(!s2.equals(s3))
            return "Passwords do not match";
        else
            return "Your username and password has been created";
    }

    public static void main(String[] args){
        HWClass14 obj1  = new HWClass14();
        System.out.println(obj1.checkCred("","1234","3214"));
        System.out.println(obj1.checkCred("sakir","1233","32142343"));
        System.out.println(obj1.checkCred("sakir","sakirsakir","3214"));
        System.out.println(obj1.checkCred("sakir","12345678","12341234"));
        System.out.println(obj1.checkCred("sakir","12341234","12341234"));
    }

}
