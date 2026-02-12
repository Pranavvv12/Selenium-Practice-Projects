package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");

    By errorMessage = By.cssSelector("h3[data-test='error']");
    By productsTitle = By.className("title");

    // Actions
    public void login(String username, String password) {

        driver.findElement(usernameField).clear();
        driver.findElement(passwordField).clear();

        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);

        driver.findElement(loginButton).click();
    }

    public boolean isProductsPageDisplayed() {
        return driver.findElements(productsTitle).size() > 0;
    }

    public boolean isErrorDisplayed() {
        return driver.findElements(errorMessage).size() > 0;
    }
}
