package com.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginNegativeTest extends BaseTest {

    @Test
    public void invalidUsernameAndPassword() {
        LoginPage login = new LoginPage(driver);
        login.login("wrong_user", "wrong_pass");
        Assert.assertTrue(login.getErrorMessage().contains("do not match"));
    }

    @Test
    public void emptyUsernameAndPassword() {
        LoginPage login = new LoginPage(driver);
        login.login("", "");
        Assert.assertTrue(login.getErrorMessage().contains("Username is required"));
    }

    @Test
    public void emptyPassword() {
        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "");
        Assert.assertTrue(login.getErrorMessage().contains("Password is required"));
    }
}
