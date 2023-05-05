package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(tagName = "h1")
    private WebElement homeTitle;

    public WebElement getHomeTitle(){
        return homeTitle;
    }

    public boolean checkTitle(){
        return homeTitle.getText().equals("DuckDuckGo");
    }
}
