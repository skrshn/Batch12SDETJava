package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileDemo4 {
    public static void main(String[] args) throws IOException {
        String path = "Files/Config.properties";
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        properties.put("URL", "www.google.com");
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        properties.store(fileOutputStream, "Added some new fields");
    }
}
