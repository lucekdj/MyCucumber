package com.automation.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println("** Before Each Scenario from hooks");
    }

    @After
    public void cleanUp(){
        System.out.println("## After Each Scenario from hooks");
    }
}
