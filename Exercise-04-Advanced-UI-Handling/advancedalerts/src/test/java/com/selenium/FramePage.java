package com.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.By;
import org.testng.Assert;
public class FramePage {


        WebDriver driver;
        WebDriverWait wait;
    public FramePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    By iframe=By.id("mce_0_ifr");
    By editor=By.id("tinymce");
    public void openPage(){
        driver.get("https://the-internet.herokuapp.com/iframe");
    }

    public void enterintoframeandwait(){
       wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
      driver.findElement(editor).clear();
        driver.findElement(editor).sendKeys("Hello, World!");

        String text=driver.findElement(editor).getText();
        Assert.assertEquals(text, "Hello, World!");
        driver.switchTo().defaultContent();
    
    }



}
