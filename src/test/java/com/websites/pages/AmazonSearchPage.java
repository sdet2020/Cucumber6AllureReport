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

public class AmazonSearchPage {

 WebDriver driver;

    public void get_amazon_page(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
    }

    public void search_for_books() throws InterruptedException {
        Thread.sleep(1500);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books", Keys.ENTER);
    }

    public void assert_that_amazon_titile_has_changed() throws InterruptedException {
        Thread.sleep(1500);
        String expectedTitle = "Amazon.com : books";
        String actualTitle = driver.getTitle();

        Assert.assertEquals("Amazon Search Title Verification Failed", expectedTitle, actualTitle);

        driver.close();
    }
}
