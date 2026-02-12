package com.selenium.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop;

    static {
        try {
            String path = System.getProperty("user.dir") + "/config.properties";
            FileInputStream fis = new FileInputStream(path);
            prop = new Properties();
            prop.load(fis);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load config.properties");
        }
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}
