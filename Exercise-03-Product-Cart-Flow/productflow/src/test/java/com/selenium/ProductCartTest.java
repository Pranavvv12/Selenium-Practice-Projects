package com.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductCartTest extends BaseTest {

    @Test
    public void verifyLoginAndProductsPage() {
        LoginPage login = new LoginPage(driver);
        ProductsPage products = new ProductsPage(driver);

        login.login("standard_user", "secret_sauce");
        products.verifyProductsPageDisplayed();
    }

    @Test
    public void addSingleProductToCart() {
        LoginPage login = new LoginPage(driver);
        ProductsPage products = new ProductsPage(driver);
        CartPage cart = new CartPage(driver);

        login.login("standard_user", "secret_sauce");
        products.addFirstProductToCart();
        products.goToCart();

        cart.verifyProductAddedToCart();
    }

    @Test
    public void verifyProductNameInCart() {
        LoginPage login = new LoginPage(driver);
        ProductsPage products = new ProductsPage(driver);
        CartPage cart = new CartPage(driver);

        login.login("standard_user", "secret_sauce");
        String productName = products.getFirstProductName();

        products.addFirstProductToCart();
        products.goToCart();

        Assert.assertEquals(
                cart.getProductNameInCart(),
                productName,
                "Product name mismatch in cart"
        );
    }

    @Test
    public void removeProductFromCart() {
        LoginPage login = new LoginPage(driver);
        ProductsPage products = new ProductsPage(driver);
        CartPage cart = new CartPage(driver);

        login.login("standard_user", "secret_sauce");
        products.addFirstProductToCart();
        products.goToCart();

        cart.removeProduct();
        cart.verifyCartIsEmpty();
    }
}
