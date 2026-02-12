package com.selenium.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.selenium.stepdefinitions",
        plugin = {
                "pretty",
                "html:reports/cucumber.html"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
