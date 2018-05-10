package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverConfig {
    public final static String FIREFOX = "FIREFOX_DRIVER";
    public static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.gecko.driver", "/home/manix/Selenium-drivers/firefox/geckodriver");
        //Now you can Initialize marionette driver to launch firefox
        if(driver.equals(FIREFOX)) {
            return new FirefoxDriver();
        }
        else {
            return null;
        }
    }
}
