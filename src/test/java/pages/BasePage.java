package pages;

import helpers.HelperClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    private Logger logger = LogManager.getLogger(BasePage.class);

    public BasePage(){
        driver = HelperClass.getDriver();
        PageFactory.initElements(driver, this);
        webDriverWait = new WebDriverWait(driver, 20);
    }

    public WebDriverWait getWebDriverWait(){
        return webDriverWait;
    }

    public void waitElementVisibility(WebElement element){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(element));
    }

    public void waitToBeClickable(WebElement element){
        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(element));
    }


}
