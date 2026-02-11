package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class HoverPage {
    WebDriver driver;


    public HoverPage(WebDriver driver) {
        this.driver = driver;   }

    By image=By.xpath("//div[@class='figure'][1]");
    By userText = By.xpath("(//div[@class='figcaption']/h5)[1]");


    public void openPage(){
        driver.get("https://the-internet.herokuapp.com/hovers");
    }

    public void hoverAndVerify(){
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(image)).perform();
        Assert.assertTrue(driver.findElement(userText).isDisplayed(), "User name text not displayed after hover");
    }
}
