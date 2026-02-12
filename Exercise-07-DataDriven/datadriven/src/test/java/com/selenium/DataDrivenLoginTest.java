package com.selenium;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataDrivenLoginTest extends BaseTest{

    @DataProvider(name = "loginData")
    public Object[][] loginData(){
        return new Object[][]{
           {"standard_user", "secret_sauce", "valid"},
                {"standard_user", "wrong_pass", "invalid"},
                {"locked_out_user", "secret_sauce", "invalid"}
        };
    }

    @Test (dataProvider = "loginData")
    public void testLogin(String username, String password, String type){
        LoginPage login=new LoginPage(driver);
        login.login(username,password);
       if (type.equals("valid")) {
            Assert.assertTrue(login.isProductsPageDisplayed(),
                    "Products page not displayed for valid login");
        } else {
            Assert.assertTrue(login.isErrorDisplayed(),
                    "Error message not displayed for invalid login");
        }

    }
}
