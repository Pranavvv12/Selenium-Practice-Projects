package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;}
    
    By username=By.id("user-name");
    By password=By.id("password");
    By loginBtn = By.id("login-button");
    By errorMsg = By.cssSelector("h3[data-test='error']");
    By productsTitle = By.className("title");

    public void login(String user, String pass) {
        driver.findElement(username).clear();
        driver.findElement(password).clear();
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }
    public boolean isProductsPageDisplayed() {
        return driver.findElements(productsTitle).size() > 0;
    }

    public boolean isErrorDisplayed() {
        return driver.findElements(errorMsg).size() > 0;
    }
}
