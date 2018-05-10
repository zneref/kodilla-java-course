package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public final static String XPATH_SELECT_DAY = "//select[@id=\"day\"]";
    public final static String XPATH_SELECT_MONTH = "//select[@id=\"month\"]";
    public final static String XPATH_SELECT_YEAR = "//select[@id=\"year\"]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://facebook.com");

        WebElement day = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select daySelect = new Select(day);
        daySelect.selectByValue("20");

        WebElement month = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select monthSelect = new Select(month);
        monthSelect.selectByValue("7");

        WebElement year = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select yearSelect = new Select(year);
        yearSelect.selectByValue("2000");
    }
}
