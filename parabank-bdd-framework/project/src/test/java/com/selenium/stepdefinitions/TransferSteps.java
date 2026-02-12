package com.selenium.stepdefinitions;

import com.selenium.pages.TransferPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class TransferSteps {

    TransferPage transferPage = new TransferPage();

    @When("user transfers {int} dollars")
    public void transfer(int amount) {
        transferPage.transferFunds(String.valueOf(amount));
    }

    @Then("transfer should be successful")
    public void verify_transfer() {
        Assert.assertTrue(transferPage.isTransferSuccessful());
    }
}
