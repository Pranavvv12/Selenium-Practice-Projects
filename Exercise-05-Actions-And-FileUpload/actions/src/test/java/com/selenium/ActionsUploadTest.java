package com.selenium;

import org.testng.annotations.Test;

public class ActionsUploadTest extends BaseTest {

    @Test
    public void testHover() {
        HoverPage hover = new HoverPage(driver);
        hover.openPage();
        hover.hoverAndVerify();
    }

    @Test
    public void testRightClick() {
        ContextMenuPage context = new ContextMenuPage(driver);
        context.openPage();
        context.rightClickAndVerifyAlert();
    }

    @Test
    public void testKeyboard() {
        KeyboardPage keyboard = new KeyboardPage(driver);
        keyboard.openPage();
        keyboard.keyboardVerify();
    }

    @Test
    public void testFileUpload() {
        FileUploadPage upload = new FileUploadPage(driver);
        upload.openPage();
        upload.uploadFile();
    }
}
