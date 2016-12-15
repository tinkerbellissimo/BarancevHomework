package com.tinkerbellissimo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by tinkerbellissimo on 12/15/16.
 */
public class Homework1 {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "/Users/tinkerbellissimo/Downloads/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void Homework1() {
        driver.get("http://google.com/");
        driver.findElement(By.cssSelector("[id='lst-ib']")).sendKeys("Christmas");
        driver.findElement(By.cssSelector("[id='_fZl']")).click();
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }

}
