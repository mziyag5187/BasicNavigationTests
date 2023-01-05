package com.cbt.tests.HW.BasivNavigation;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicNavigationTest_UsualWay {

    public static void main(String[] args) {

        testWithChrome();
        //testWithEdge();
        //testWithFirefox();
    }

    public static void testWithChrome(){

        //1. Open chrome browser
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to website https://google.com
        driver.get("http://www.google.com");

        //3. Save the title in a string variable
        String titleGoogle = driver.getTitle();

        //4. Go to https://etsy.com
        driver.get("http://www.etsy.com");

        //5. Save the title in a string variable
        String titleEtsy = driver.getTitle();

        //7. Verify that title is same is in step 3
        String actual1 = driver.getTitle();
        StringUtility.verifyEquals(actual1,titleGoogle);

        //8. Navigate forward to previous page
        driver.navigate().forward();

        //9. Verify that title is same is in step 5
        String actual2 = driver.getTitle();
        StringUtility.verifyEquals(actual2, titleEtsy);

        driver.quit();
    }

    public static void testWithFirefox(){

        //1. Open browser
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.manage().window().maximize();

        //2. Go to website https://google.com
        driver.get("http://www.google.com");

        //3. Save the title in a string variable
        String titleGoogle = driver.getTitle();

        //4. Go to https://etsy.com
        driver.get("http://www.etsy.com");

        //5. Save the title in a string variable
        String titleEtsy = driver.getTitle();

        //6. Navigate back to previous page
        driver.navigate().back();

        //7. Verify that title is same is in step 3
        String actual1 = driver.getTitle();
        StringUtility.verifyEquals(actual1,titleGoogle);


        //8. Navigate forward to previous page
        driver.navigate().forward();

        //9. Verify that title is same is in step 5
        String actual2 = driver.getTitle();
        StringUtility.verifyEquals(actual2, titleEtsy);

        driver.quit();
    }

    public static void testWithEdge(){

        //1. Open browser
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.manage().window().maximize();

        //2. Go to website https://google.com
        driver.get("http://www.google.com");

        //3. Save the title in a string variable
        String titleGoogle = driver.getTitle();

        //4. Go to https://etsy.com
        driver.get("http://www.etsy.com");

        //5. Save the title in a string variable
        String titleEtsy = driver.getTitle();

        //6. Navigate back to previous page
        driver.navigate().back();

        //7. Verify that title is same is in step 3
        String actual1 = driver.getTitle();
        StringUtility.verifyEquals(actual1,titleGoogle);

        //8. Navigate forward to previous page
        driver.navigate().forward();

        //9. Verify that title is same is in step 5
        String actual2 = driver.getTitle();
        StringUtility.verifyEquals(actual2, titleEtsy);

        driver.quit();
    }







}
