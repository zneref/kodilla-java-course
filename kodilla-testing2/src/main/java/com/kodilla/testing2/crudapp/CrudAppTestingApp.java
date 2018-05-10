package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CrudAppTestingApp {
    public static  void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://zneref.github.io");

        WebElement searchInput = driver.findElement(By.xpath("/html/body/main/section/form/fieldset/input"));
        searchInput.sendKeys("new robotic task");
        searchInput.submit();
    }
}
