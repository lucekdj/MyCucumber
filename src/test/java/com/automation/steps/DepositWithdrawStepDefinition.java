package com.automation.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DepositWithdrawStepDefinition {

    @Given("user open bank website")
    public void user_open_bank_website() {
        System.out.println("1");
    }
    @Then("verify user is on deposit window page")
    public void verify_user_is_on_deposit_window_page() {
        System.out.println("3");
    }
    @When("user make deposit")
    public void user_make_deposit() {
        System.out.println("4");
    }
    @When("verify balance after deposit")
    public void verify_balance_after_deposit() {
        System.out.println("5");
    }
    @Then("user logout from his profile")
    public void user_logout_from_hie_profile() {
        System.out.println("6");
    }

    @Then("verify user is on withdraw window page")
    public void verify_user_is_on_withdraw_window_page() {
        
    }

    @When("user make withdraw")
    public void user_make_withdraw() {
        
    }

    @When("verify balance after withdraw")
    public void verify_balance_after_withdraw() {
        

    }



}