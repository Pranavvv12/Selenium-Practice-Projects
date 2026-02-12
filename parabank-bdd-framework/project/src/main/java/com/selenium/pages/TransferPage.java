package com.selenium.pages;

import com.selenium.base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class TransferPage {

    private By transferLink = By.linkText("Transfer Funds");
    private By amount = By.id("amount");
    private By fromAccount = By.id("fromAccountId");
    private By toAccount = By.id("toAccountId");
    private By transferBtn = By.xpath("//input[@value='Transfer']");
    private By successMessage = By.cssSelector("h1.title");

    public void transferFunds(String amt) {

        DriverFactory.getDriver().findElement(transferLink).click();

        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(amount));

        DriverFactory.getDriver().findElement(amount).clear();
        DriverFactory.getDriver().findElement(amount).sendKeys(amt);

        Select from = new Select(DriverFactory.getDriver().findElement(fromAccount));
        from.selectByIndex(0);

        Select to = new Select(DriverFactory.getDriver().findElement(toAccount));
        to.selectByIndex(1);

        DriverFactory.getDriver().findElement(transferBtn).click();
    }

    public boolean isTransferSuccessful() {
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(15));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).isDisplayed();
    }
}
