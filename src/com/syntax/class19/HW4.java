package com.syntax.class19;
//Write Book class that will have instance variables and 2 Constructors.
//While creating an object make sure:
//        Instance variables are being initialized
//        Both Constructors are being executed
public class HW4 {
    String bookName;
    String bookAuthor;
    long ISBN;
    int totalPageNumber;

    //No argument Constructor
    HW4(){

    }

    //Parameterized Constructor
    public HW4(String bookName, String bookAuthor, long ISBN, int totalPageNumber) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.ISBN = ISBN;
        this.totalPageNumber = totalPageNumber;
    }

    void printBookDetails(){
        System.out.println("Book name is "+bookName+", the author is "+bookAuthor
                +" with total number of "+totalPageNumber
                +" pages and ISBN number is "+ISBN);
    }
}
