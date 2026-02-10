package com.selenium;

import org.testng.annotations.Test;

public class AdvancedAlertTest extends BaseTest{

    // @Test
    // public void testAlertHandling(){
    //     AlertPage alert=new AlertPage(driver);
    //     alert.openPage();
    //     alert.clickAlertButton();
    //     alert.resultcheck();
    // }

    @Test
    public void testFrameHandling(){
        FramePage frame=new FramePage(driver, wait);
        frame.openPage();
        frame.enterIntoFrameAndWait();
    }

    // @Test
    // public void testDropdownHandling(){
    //     DropdownPage dropdown=new DropdownPage(driver);
    //     dropdown.openPage();
    //     dropdown.selectOption();
    // }

}
