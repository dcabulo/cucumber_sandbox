package Utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void beforeScenario(){
        System.out.println("Before Hook - This will run before the scenario");
    }

    @After
    public void afterScenario(){
        System.out.println("After Hook -This will run after the scenario");
    }

}
