package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class KeyboardPage {

    WebDriver driver;


    public KeyboardPage(WebDriver driver) {
        this.driver = driver;   }
       By body = By.tagName("body");
    By result = By.id("result");

        public void openPage(){
            driver.get("https://the-internet.herokuapp.com/key_presses");
        }
        public void keyboardVerify(){
               driver.findElement(body).sendKeys(Keys.ENTER);

        String text = driver.findElement(result).getText();
        Assert.assertTrue(text.contains("ENTER"));
        }
}
