package Utilities;

import helpers.HelperClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void beforeScenario(){
        HelperClass.setUpDriver();
    }

    @After
    public void afterScenario(){
        System.out.println("After Hook -This will run after the scenario");
        HelperClass.tearDown();
    }

}
