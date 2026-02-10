package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    WebDriver driver;

   public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    By dropdown = By.id("dropdown");

    public void openPage(){
        driver.get("https://the-internet.herokuapp.com/dropdown");

    }

    public void selectOption(){
        Select select=new Select(driver.findElement(dropdown));
        select.selectByVisibleText("Option 2");
String selected=select.getFirstSelectedOption().getText();
Assert.assertEquals(selected, "Option 2");
    }


}
