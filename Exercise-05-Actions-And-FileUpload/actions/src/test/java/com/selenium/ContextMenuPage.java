package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ContextMenuPage {
   WebDriver driver;



    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

   By box = By.id("hot-spot");


    public void openPage() {
        driver.get("https://the-internet.herokuapp.com/context_menu");
    }

    public void rightClickAndVerifyAlert() {
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(box)).perform();

        String alertText = driver.switchTo().alert().getText();
        Assert.assertEquals(alertText, "You selected a context menu");

        driver.switchTo().alert().accept();
    }
}
