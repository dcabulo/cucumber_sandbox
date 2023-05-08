package helpers;

import com.cucumber.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HelperClass {

    private static HelperClass helperClass;
    
    private static RemoteWebDriver driver;

    private HelperClass(){
        Driver browser = new Driver();
        driver = browser.getDriver();
        driver.manage().window().maximize();
    }
    
    public static void openPage(String url){
        driver.get(url);
    }

    public static WebDriver getDriver(){
        return driver;
    }
    
    public  static void setUpDriver(){
        if (helperClass == null){
            helperClass = new HelperClass();
        }
    }
    
    public static void tearDown(){
        if(driver!=null){
            driver.quit();
        }
        helperClass = null;
    }
}
