package StepDefinitions;

import Utilities.Hooks;
import helpers.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import pages.HomePage;


public class LoginStep {

    HomePage homePage = new HomePage();

    private final Logger logger = LogManager.getLogger(LoginStep.class);
    @Given("user is on duckduckgo page {string}")
    public void userNavigateToHomePage(String url) {
        HelperClass.openPage(url);
        logger.info("You are in the home page");
    }
    @When("user enter homepage")
    public void userEnterHomepage() {
        homePage.waitElementVisibility(homePage.getHomeTitle());
        logger.info("You check that the h1 is display");
    }
    @Then("user saw title is displayed")
    public void userTitleSawTitle() {
        Assert.assertTrue(homePage.checkTitle(),"Title string doesn't match");
        logger.info("The title match the string given");
    }
}
