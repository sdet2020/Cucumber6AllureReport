package com.websites.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class GoogleSearchPage{
    WebDriver driver;

    public void get_google_page(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
    }

    public void search_for_stars() throws InterruptedException {
        Thread.sleep(1500);
        driver.findElement(By.name("q")).sendKeys("books", Keys.ENTER);
    }

    public void assert_that_google_titile_has_changed() throws InterruptedException {
        Thread.sleep(1500);
        String expectedTitle = "books - Google Search";
        String actualTitle = driver.getTitle();

        Assert.assertEquals("Google Search Title Verification Failed", expectedTitle, actualTitle);

        driver.close();
    }
}
