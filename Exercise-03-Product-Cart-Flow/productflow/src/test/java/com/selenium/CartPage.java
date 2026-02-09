package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By cartItem = By.className("cart_item");
    By cartItemName = By.className("inventory_item_name");
    By removeBtn = By.className("cart_button");

    public void verifyProductAddedToCart() {
        Assert.assertTrue(
                driver.findElement(cartItem).isDisplayed(),
                "Product not added to cart"
        );
    }
    public String getProductNameInCart() {
        return driver.findElement(cartItemName).getText();
    }

    public void removeProduct() {
        driver.findElement(removeBtn).click();
    }

    public void verifyCartIsEmpty() {
        Assert.assertTrue(
                driver.findElements(cartItem).isEmpty(),
                "Cart is not empty"
        );
    }
}
