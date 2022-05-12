package com.syntax.reviewClass13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
    public static void main(String[] args) {
        String path = "/Users/sakirsahin/IdeaProjects/Batch12SDETJava/Files/Config.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            System.out.println(properties.get("username"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
