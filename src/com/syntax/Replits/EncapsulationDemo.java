package com.syntax.Replits;

public class EncapsulationDemo {
    private String firstname;
    private String lastname;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    private String ssn;

    public EncapsulationDemo(String firstname, String lastname, int birthMonth, int birthDay, int birthYear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.ssn = ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String formatBirthday(){
        return birthMonth+"/"+birthDay+"/"+birthYear;
    }

    public static void main(String[] args) {
        EncapsulationDemo e = new EncapsulationDemo("John","Doe",10,25,1900,"123-45-6789");
        System.out.println(e.getFirstname());
        System.out.println(e.getLastname());
        System.out.println(e.formatBirthday());
        System.out.println(e.getSsn());
    }
}
