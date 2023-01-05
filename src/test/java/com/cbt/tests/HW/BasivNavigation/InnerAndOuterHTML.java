package com.cbt.tests.HW.BasivNavigation;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InnerAndOuterHTML {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("https://www.etsy.com/");

        //getText
        String getText = driver.findElement(By.xpath("//p[contains(.,'Home Decor')][1]")).getText();
        System.out.println("getText = " + getText + " - " + getText.length() );

        //innerHTML
        String innerHTML = driver.findElement(By.xpath("//p[contains(.,'Home Decor')][1]")).getAttribute("innerHTML");
        System.out.println("innerHTML = " + innerHTML + " - " + innerHTML.length() );

        //outerHTML
        String outerHTML = driver.findElement(By.xpath("//p[contains(.,'Home Decor')][1]")).getAttribute("outerHTML");
        System.out.println("outerHTML = " + outerHTML + " - " + outerHTML.length() );

        driver.close();
    }
}
