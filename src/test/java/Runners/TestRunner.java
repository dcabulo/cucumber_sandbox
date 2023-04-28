package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"StepDefinitions", "Utilities"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
