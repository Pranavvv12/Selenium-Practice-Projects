package com.selenium.stepdefinitions;

import com.selenium.base.BaseTest;
import com.selenium.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class LoginSteps extends BaseTest {

    LoginPage login;

    @Before
    public void start() {
        setup();
        login = new LoginPage(getDriver());
    }

    @Given("User is on Login Page")
    public void user_is_on_login_page() {
        login.open();
    }

    @When("User enters valid username and password")
    public void user_enters_valid_credentials() {
        login.login("standard_user", "secret_sauce");
    }

    @Then("User should see Products page")
    public void user_should_see_products_page() {
        Assert.assertEquals(login.getPageTitle(), "Products");
    }

    @After
    public void close() {
        tearDown();
    }
}
