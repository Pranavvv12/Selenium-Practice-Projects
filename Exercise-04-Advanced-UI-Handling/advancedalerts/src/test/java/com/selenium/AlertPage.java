package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


import org.testng.Assert;
public class AlertPage {
    
    WebDriver driver;

    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }
    By alertButton = By.xpath("//button[text()='Click for JS Alert']");
    By resulttext= By.id("result");

    public void openPage(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    public void clickAlertButton(){
       driver.findElement(alertButton).click();
       driver.switchTo().alert().accept();

    }
    public void resultcheck(){
        String result=driver.findElement(resulttext).getText();
        Assert.assertEquals(result, "You successfully clicked an alert");
    }


}
