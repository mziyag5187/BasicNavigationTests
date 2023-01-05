package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    /**
     * returns a driver object based on the given browserType
     * @param browserType
     * @return WebDriver
     */
    public static WebDriver getDriver(String browserType){

        WebDriver driver = null;
        // can be used for OS type : System.getProperty("os.name");

        switch (browserType.toLowerCase()){
            case "safari":
                if(System.getProperty("os.name").toLowerCase().contains("windows")){
                    return null;
                }
                driver = new SafariDriver();
                break;
            case "edge":
                if(SystemUtils.OS_NAME.toLowerCase().contains("mac")){
                    return null;
                }
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }

        return driver;
    }
}
