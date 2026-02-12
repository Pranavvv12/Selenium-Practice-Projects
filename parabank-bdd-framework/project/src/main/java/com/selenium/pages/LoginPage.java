package com.selenium.pages;

import com.selenium.base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class LoginPage {

    private By username = By.name("username");
    private By password = By.name("password");
    private By loginBtn = By.xpath("//input[@value='Log In']");
    private By errorMsg = By.xpath("//p[@class='error']");

    WebDriverWait wait = new WebDriverWait(
            DriverFactory.getDriver(), Duration.ofSeconds(10));

    public void login(String user, String pass) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(username));
        DriverFactory.getDriver().findElement(username).clear();
        DriverFactory.getDriver().findElement(username).sendKeys(user);

        DriverFactory.getDriver().findElement(password).clear();
        DriverFactory.getDriver().findElement(password).sendKeys(pass);

        DriverFactory.getDriver().findElement(loginBtn).click();
    }

    public boolean isErrorDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMsg));
        return DriverFactory.getDriver().findElement(errorMsg).isDisplayed();
    }
}
