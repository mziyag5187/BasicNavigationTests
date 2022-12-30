package com.cbt.tests.QuestionsOfStudents;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Seamlessly_Tasks_Test {

    public static void main(String[] args) throws InterruptedException {

        //1. Open browser
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to website https://google.com
        driver.get("https://qa.seamlessly.net");

        driver.findElement(By.id("user")).sendKeys("Employee1");
        driver.findElement(By.id("password")).sendKeys("Employee123");
        driver.findElement(By.id("submit-form")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@aria-label='Notes']")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//pre[@role='presentation']")).click();

        driver.findElement(By.xpath("(//textarea)[2]")).sendKeys("Last Trial");


        Thread.sleep(2000);

        driver.quit();

    }


}
