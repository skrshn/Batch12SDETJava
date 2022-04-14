package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Task1Property {
    public static void main(String[] args) throws IOException {
        String path ="/Users/sakirsahin/Documents/JavaProperties/Task1Property.properties";

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        Properties properties = new Properties();
        properties.put("browser","chrome");
        properties.put("url","https://facebook.com");
        properties.put("username","sakir");
        properties.put("password","pass123");
        properties.store(fileOutputStream,"Added some new fields");

        FileInputStream fileInputStream= new FileInputStream(path);
        properties.load(fileInputStream);
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("url"));
        System.out.println(properties.get("browser"));

    }
}
