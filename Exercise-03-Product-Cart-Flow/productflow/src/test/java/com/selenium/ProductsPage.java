package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class ProductsPage {
    WebDriver driver;
    
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }
     By title = By.className("title");
    By firstAddToCartBtn = By.cssSelector(".inventory_item button");
    By firstProductName = By.className("inventory_item_name");
    By cartIcon = By.className("shopping_cart_link");

    public void verifyProductsPageDisplayed(){
        String pageheading=driver.findElement(title).getText();
        Assert.assertEquals(pageheading, "Products", "Products page is not displayed");
    }
    public void addFirstProductToCart() {
        driver.findElement(firstAddToCartBtn).click();
    }
    public String getFirstProductName() {
        return driver.findElement(firstProductName).getText();
    }
    public void goToCart() {
        driver.findElement(cartIcon).click();
    }
}