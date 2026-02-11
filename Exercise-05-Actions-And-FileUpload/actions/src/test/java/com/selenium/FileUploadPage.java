package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.File;

public class FileUploadPage {

    WebDriver driver;

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    By uploadInput = By.id("file-upload");
    By uploadBtn = By.id("file-submit");
    By uploadedText = By.tagName("h3");

    public void openPage() {
        driver.get("https://the-internet.herokuapp.com/upload");
    }

    public void uploadFile() {

        String filePath = System.getProperty("user.dir") + "/pom.xml";

        driver.findElement(uploadInput).sendKeys(filePath);
        driver.findElement(uploadBtn).click();

        Assert.assertEquals(
                driver.findElement(uploadedText).getText(),
                "File Uploaded!"
        );
    }
}
