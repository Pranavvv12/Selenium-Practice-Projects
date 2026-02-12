package com.selenium.stepdefinitions;

import com.selenium.pages.LoginPage;
import com.selenium.pages.HomePage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user logs into parabank with valid credentials")
    public void valid_login() {
        loginPage.login("john", "demo");
    }

    @Given("user logs into parabank with invalid credentials")
    public void invalid_login() {
        loginPage.login("invalid", "invalid");
    }

    @Then("user should see welcome message")
    public void verify_login() {
        Assert.assertTrue(homePage.isLoggedIn());
    }

    @Then("login error should be displayed")
    public void verify_error() {
        Assert.assertTrue(loginPage.isErrorDisplayed());

    }
}
