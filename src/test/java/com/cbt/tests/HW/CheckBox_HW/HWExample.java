package com.cbt.tests.HW.CheckBox_HW;

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

public class HWExample {

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
     /*
    TC #3: SeleniumEasy Checkbox Verification – Section 2
        1. Open Chrome browser
        2. Go to http://www.seleniumeasy.com/test/basic-checkbox-demo.html
        3. Verify “Check All” button text is “Check All”
        4. Click to “Check All” button
        5. Verify all check boxes are checked
        6. Verify button text changed to 'Uncheck All'
     */

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement checkAllbtn = driver.findElement(By.cssSelector("#check1"));

        String firstText = checkAllbtn.getAttribute("value");

        Assert.assertEquals(firstText, "Check All", "Verify “Check All” button text is 'Check All'");

        checkAllbtn.click();

        Thread.sleep(4000);

        List<WebElement> inputBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for (WebElement inputBox : inputBoxes) {
            Assert.assertTrue(inputBox.isSelected());
        }

        String lastText = checkAllbtn.getAttribute("value");

        Assert.assertEquals(lastText, "Uncheck All");


    }

    // 2. SOLUTION AS DYNAMİC
    @Test
    public void test2() {
//        1. Open Chrome browser
//        2. Go to http://www.seleniumeasy.com/test/basic-checkbox-demo.html
//        3. Verify “Check All” button text is “Check All”
//        4. Click to “Check All” button
//        5. Verify all check boxes are checked
//        6. Verify button text changed to “Uncheck All”
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html%22)");

        WebElement checkAll = driver.findElement(By.cssSelector("[value='Check All']"));

        System.out.println("checkAll.getAttribute() = " + checkAll.getAttribute("value"));

        checkAll.click();

        for (int i = 1; i <= 4; i++) {
            String xpathLocator = "(//input[@class='cb1-element'])" + "[" + i + "]";
            WebElement checkBox = driver.findElement(By.xpath(xpathLocator));
            Assert.assertTrue(checkBox.isSelected());
            System.out.println("Option " + i + " " + checkBox.isSelected());

        }
    }

    @Test
    public void test16() throws InterruptedException {

        //2. Go to the related website
        driver.get("http://5.26.240.250:8080/");

        Thread.sleep(6000);

        WebElement tableData = driver.findElement(By.xpath("//table[@width='100%']//tr[3]//td[8]"));

        String value = tableData.getText();

        System.out.println("value = " + value);
    }
}