package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileDemo2 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/sakirsahin/Documents/JavaProperties/Config.properties";
        FileInputStream fileInputStream = new FileInputStream(path);

        Properties properties= new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));

    }
}
