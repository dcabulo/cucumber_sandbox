package com.cucumber.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private WebDriver driver;
    private final Logger logger = LogManager.getLogger(Driver.class);

    public Driver (){
        try{
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        catch (Exception e){
            logger.info(e);
        }
    }

    public WebDriver getDriver(){
        return driver;
    }
}
