package com.selenium.stepdefinitions;

import com.selenium.base.DriverFactory;
import io.cucumber.java.*;

public class Hooks {

    @Before
    public void setup() {
        DriverFactory.initDriver();
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
