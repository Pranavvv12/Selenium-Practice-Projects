package com.selenium.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ScreenshotUtil {

    public static void capture(WebDriver driver, String name) {

        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File dest = new File("screenshots/" + name + ".png");

            dest.getParentFile().mkdirs();

            Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
