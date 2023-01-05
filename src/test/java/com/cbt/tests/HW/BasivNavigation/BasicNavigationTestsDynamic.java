package com.cbt.tests.HW.BasivNavigation;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.WebDriver;

public class BasicNavigationTestsDynamic {

    public static void main(String[] args) {


        String[] browserTypes = {"chrome","firefox","edge"};


        for(String browser : browserTypes) {

            test(browser);

        }
    }


    //THE SHORT WAY OF EXECUTING ALL BROWSERS:


    public static void test(String browserType){

        //1. Open browser
        WebDriver driver = BrowserFactory.getDriver(browserType);
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







