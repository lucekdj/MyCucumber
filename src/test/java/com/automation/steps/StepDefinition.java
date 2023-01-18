package com.automation.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
    @Given("user open website")
    public void user_open_website() {
        System.out.println("open website");
    }

    @And("verify user is on login page")
    public void verify_user_is_on_login_page() {
        System.out.println("verify on login page");
    }

    @When("user enter the valid credentials")
    public void user_entered_the_valid_credentials() {
        System.out.println("enter valid credentials");
    }

    @Then("verify home page is displayed")
    public void verify_home_page_is_displayed() {
        System.out.println("verify login successful");
    }

    // @And("user open website ");
//    public void user_website(){
//        System.out.println("?");
//    }

    @Then("verify invalid login error message is displayed")
    public void verify_invalid_login_error_message_is_displayed() {
        System.out.println("verify invalid error message");

    }

    @Given("user close website")
    public void user_close_website() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();

        System.out.println("verify close website");
    }

}

