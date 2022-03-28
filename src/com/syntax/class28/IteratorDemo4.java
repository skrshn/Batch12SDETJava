package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo4 {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Java");
        courses.add("Java");
        courses.add("Selenium");

        System.out.println(courses);

        Iterator<String> iterator = courses.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().equalsIgnoreCase("Java")) {
                iterator.remove();
            }
        }
        System.out.println(courses);

    }
}
