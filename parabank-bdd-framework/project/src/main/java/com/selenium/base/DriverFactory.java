package com.selenium.base;

import com.selenium.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver() {

        driver.set(new ChromeDriver());

        driver.get().manage().window().maximize();
        driver.get().manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(
                        Integer.parseInt(ConfigReader.get("implicitWait"))
                ));

        driver.get().get(ConfigReader.get("url"));
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        driver.get().quit();
        driver.remove();
    }
}
