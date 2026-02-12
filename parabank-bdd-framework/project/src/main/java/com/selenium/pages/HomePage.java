package com.selenium.pages;

import com.selenium.base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class HomePage {

    private By accountsOverview = By.xpath("//h1[contains(text(),'Accounts Overview')]");

    WebDriverWait wait = new WebDriverWait(
            DriverFactory.getDriver(), Duration.ofSeconds(10));

    public boolean isLoggedIn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(accountsOverview));
        return DriverFactory.getDriver().findElement(accountsOverview).isDisplayed();
    }
}
