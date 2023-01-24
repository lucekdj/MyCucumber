package com.automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src//test//resources//features//Login.feature",//features = "src//test//resources//features//DepositWithdraw.feature",
        glue = "com.automation.steps",
        tags = "@wip",     //"@Smoke or @Paulina",
        plugin = {"html:html-report/report.html","json:target/cucumber.json"},
        dryRun = true

)

public class TestRunner {

}
