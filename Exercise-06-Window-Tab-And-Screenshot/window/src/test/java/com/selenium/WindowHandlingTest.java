package com.selenium;

import org.testng.annotations.Test;

public class WindowHandlingTest extends BaseTest {

    @Test
    public void testMultipleWindowHandling() {

        WindowPage windowPage = new WindowPage(driver);

        windowPage.openPage();
        windowPage.handleNewWindow();

        ScreenshotUtil.captureScreenshot(driver, "window_test_pass");
    }
}
