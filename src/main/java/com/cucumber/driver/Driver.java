package com.cucumber.driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Driver {
    private RemoteWebDriver driver;
    private final Logger logger = LogManager.getLogger(Driver.class);
    private String username = System.getenv("USERNAME");
    private String accessKey = System.getenv("ACCESSTOKENTEST");
    private String gridUrl = "@hub.lambdatest.com/wd/hub";
    public boolean status = false;

    public Driver (){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("browserVersion", "112.0");
        capabilities.setCapability("build", "LambdaTestSampleApp");
        capabilities.setCapability("name", "LambdaTestJavaSample");
        try{
            driver = new RemoteWebDriver(new URL("https://"+ username + ":"+ accessKey + gridUrl), capabilities);
        } catch (Exception e){
            logger.info(e);
        }
    }

    public RemoteWebDriver getDriver(){
        return driver;
    }
}
