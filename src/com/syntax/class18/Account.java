package com.syntax.class18;

public class Account {
    private String userName="Sakir";
    private String password="123!1233";
    public String accountNumber="45645645";
    private double balance=1500;

    private void printUserName() {

        System.out.println(userName);
    }

    protected void printPassword() {

        System.out.println(password);
    }

    void printBalance() {

        System.out.println(balance);
    }

    public void printAccountNumber() {

        System.out.println(accountNumber);
    }

    public static void main(String[] args) {
        Account account=new Account();
        account.printUserName();
        account.printPassword();
        account.printBalance();
        account.printAccountNumber();

    }

}
