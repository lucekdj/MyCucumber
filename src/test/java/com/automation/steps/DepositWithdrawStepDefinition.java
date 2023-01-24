package com.automation.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DepositWithdrawStepDefinition {

    @Given("user open bank website")
    public void user_open_bank_website() {
        System.out.println("1B user open bank website");
    }
    @Then("verify user is on deposit window page")
    public void verify_user_is_on_deposit_window_page() {
        System.out.println("3D verify user is on deposit window page");
    }
    @When("user make deposit")
    public void user_make_deposit() {
        System.out.println("4D user make deposit");
    }
    @When("verify balance after deposit")
    public void verify_balance_after_deposit() {
        System.out.println("5D verify balance after deposit");
    }
    @Then("user logout from his profile")
    public void user_logout_from_hie_profile() {
        System.out.println("6 user logout from his profile");
    }

    @Then("verify user is on withdraw window page")
    public void verify_user_is_on_withdraw_window_page() {
        System.out.println("3W verify user is on withdraw window page");
    }

    @When("user make withdraw")
    public void user_make_withdraw() {
        System.out.println("4W user make withdraw");
    }

    @When("verify balance after withdraw")
    public void verify_balance_after_withdraw() {
        System.out.println("5W verify balance after withdraw");

    }
    @Then("close browser")
    public void close_browser() {
        System.out.println("6 close browser ");
    }


}