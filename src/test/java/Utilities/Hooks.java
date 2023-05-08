package Utilities;

import StepDefinitions.LoginStep;
import helpers.HelperClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hooks {

    private final Logger logger = LogManager.getLogger(LoginStep.class);

    @Before
    public void beforeScenario(){
        HelperClass.setUpDriver();
        logger.info("Before Test - Driver setup working properly");
    }

    @After
    public void afterScenario(){
        HelperClass.tearDown();
        logger.info("After Test -Driver quit properly");
    }

}
