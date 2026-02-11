package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.util.Set;

public class WindowPage {
    WebDriver driver;

    public WindowPage(WebDriver driver) {
        this.driver = driver;}

    By clickHere = By.linkText("Click Here");
    By heading = By.tagName("h3");

    public void openPage(){
        driver.get("https://the-internet.herokuapp.com/windows");
    }

    public void handleNewWindow(){
        String parentwindow=driver.getWindowHandle();

        driver.findElement(clickHere).click();
Set<String> allWindows = driver.getWindowHandles();
        for(String windows :allWindows){
            if(!windows.equals(parentwindow)){
                driver.switchTo().window(windows);
             
            }
        }
        String newheading=driver.findElement(heading).getText();
        Assert.assertEquals(newheading, "New Window");

        driver.close(); 
        driver.switchTo().window(parentwindow);
    }
}
