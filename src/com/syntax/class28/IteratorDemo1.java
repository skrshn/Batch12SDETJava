package com.syntax.class28;

import java.util.LinkedList;
import java.util.List;

public class IteratorDemo1 {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Java");
        courses.add("Java");
        courses.add("Selenium");

        System.out.println(courses);

        for (int i = 0; i < courses.size(); i++) {
            if(courses.get(i).equalsIgnoreCase("Java")){
                courses.remove("Java");
            }
        }


        System.out.println(courses);

//        for (String course:courses
//             ) {
//            if(course.equalsIgnoreCase("Java")){
//                courses.remove(course);
//            }
//        }
//
//        System.out.println(courses);


    }
}
