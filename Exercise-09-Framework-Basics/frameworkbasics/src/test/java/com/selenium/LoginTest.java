package com.selenium.tests;

import com.selenium.base.BaseTest;
import com.selenium.pages.LoginPage;
import com.selenium.utils.ScreenshotUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {

        LoginPage login = new LoginPage(driver);

        login.login("standard_user", "secret_sauce");

        boolean status = login.isLoginSuccessful();

        if (!status) {
            ScreenshotUtil.capture(driver, "login_failure");
        }

        Assert.assertTrue(status, "Login failed");
    }
}
