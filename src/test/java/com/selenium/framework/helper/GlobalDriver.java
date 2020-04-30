package com.selenium.framework.helper;

import org.openqa.selenium.WebDriver;



public class GlobalDriver {


    private static WebDriver driver;

    public void GlobalWebDriver(WebDriver driver) {
        this.driver = driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}


