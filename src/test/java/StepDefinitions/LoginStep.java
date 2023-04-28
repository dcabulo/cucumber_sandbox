package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Given - Inside step - user is on login page");
    }
    @When("users enters username and password")
    public void users_enters_username_and_password() {
        System.out.println("When - Inside step - users enters username and password");
    }
    @And("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("And - Inside step - clicks on login button");
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("Then - Inside step - user is navigated to the home page");
    }
}
