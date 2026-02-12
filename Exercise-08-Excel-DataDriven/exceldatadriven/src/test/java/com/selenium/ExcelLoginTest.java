
package com.selenium;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.selenium.LoginPage;

public class ExcelLoginTest extends BaseTest{

    @DataProvider(name = "excelData")
public Object[][] getData() {

    String path = System.getProperty("user.dir")
            + "/exceldata/testdata.xlsx";

    System.out.println("Excel path: " + path);

    return ExcelUtil.getExcelData(path, "LoginData");
}


     @Test(dataProvider = "excelData")
    public void testLogin(String username,String password,String type){
        LoginPage login=new LoginPage(driver);
        login.login(username, password);

        if(type.equals("valid")){
             Assert.assertTrue(login.isProductsPageDisplayed());
        }else{
            Assert.assertTrue(login.isErrorDisplayed());
        }
}
}