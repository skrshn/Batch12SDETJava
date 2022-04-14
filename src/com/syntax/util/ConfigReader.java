package com.syntax.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String getProperty(String key) throws IOException {
        String path = "Files/Config.properties";
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        return properties.getProperty(key);
    }
}
