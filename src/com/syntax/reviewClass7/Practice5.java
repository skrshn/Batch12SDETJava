package com.syntax.reviewClass7;

public class Practice5 {
    String weekDay(String day){
        day=day.toLowerCase();
        switch (day){
            case "monday":
                return "It is lazy day";
            case "tuesday":
                return "It is productive day";
            case "wednesday":
                return "It is gloomy day";
            case "thursday":
                return "It is exciting day";
            case "friday":
                return "No work day";
            default:
                return "None";

        }
    }

    public static void main(String[] args) {
        Practice5 p= new Practice5();
        System.out.println(p.weekDay("mondAy"));
    }
}
