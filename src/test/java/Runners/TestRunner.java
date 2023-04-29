package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"StepDefinitions", "Utilities"},
        monochrome = true,
        plugin = {
                "pretty", "json:target/cucumber-reports/cucumber.json"
}
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
