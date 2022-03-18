package com.syntax.class19;

public class Panda {
    //default values
    String name="Sak's Polar";
    String breed="Chinese";
    String color = "white";
    double height=12.5;
    int age=10;
    double weight=22.5;


    Panda(String pandaName) {
        name=pandaName;
    }
    Panda(String pandaName, String pandaBreed) {
        name=pandaName;
        breed=pandaBreed;
    }

    Panda(String pandaName, String pandaBreed, String pandaColor, double pandaHeight, int pandaAge, double pandaWeight) {
        name=pandaName;
        breed=pandaBreed;
        color=pandaColor;
        height=pandaHeight;
        age=pandaAge;
        weight=pandaWeight;
    }
    void pandaJumps(){
        System.out.println(name + " jumps");
    }
    void printInfo(){
        System.out.println(name +" "+ breed+" "+color+" "+height+" "+age+" "+weight);
    }



}
