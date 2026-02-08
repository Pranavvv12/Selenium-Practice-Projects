package com.selenium;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Swag Labs"));
    }
}
