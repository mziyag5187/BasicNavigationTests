package com.cbt.tests.HW;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.List;

public class EU5 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


    @Test
    public void test16() throws InterruptedException {

        //1. Go to the related website
        driver.get("http://5.26.240.250:8080/");

        Thread.sleep(6000);

        //We need to switch from our driver object to the related frame which keeps our datas in the table
        driver.switchTo().frame("data");

        //After writing the frame, we can locate to "td" webelement
        WebElement tableData = driver.findElement(By.xpath("//table[@width='100%']/tbody/tr[3]/td[8]"));

        Thread.sleep(3000);

        //Then we can get it text by using getText()
        String value = tableData.getText();

        System.out.println("value = " + value);
    }
}