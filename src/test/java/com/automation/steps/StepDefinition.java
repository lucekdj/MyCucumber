package com.automation.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class StepDefinition {
    @Given("user open website")
    public void user_open_website() {
        System.out.println("user open website from background login.feature");
    }

    @And("verify user is on login page")
    public void verify_user_is_on_login_page() {
        System.out.println("2B - Do login -(Method from background login.feature)");
    }

    @When("user enter the valid credentials")
    public void user_entered_the_valid_credentials() {
        System.out.println("enter valid credentials");
    }

    @Then("verify home page is displayed")
    public void verify_home_page_is_displayed() {
        System.out.println("verify login successful");
    }

    @When("user enter the invalid credentials")
    public void user_enter_the_invalid_credentials() {
    }


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

    @When("user search with Tv")
    public void user_search_with_tv() {

    }

    @Then("verify user is on product listing page")
    public void verify_user_is_on_product_listing_page() {

    }

    @When("user click on the first product from the list")
    public void user_click_on_the_first_product_from_the_list() {

    }

    @Then("verify user is on product detail page")
    public void verify_user_is_on_product_detail_page() {

    }

    @When("user click on add to cart button")
    public void user_click_on_add_to_cart_button() {

    }

    @Then("verify cart page is displayed")
    public void verify_cart_page_is_displayed() {

    }

    @Then("verify item on the cart page")
    public void verify_item_on_the_cart_page() {

    }

    @When("user remove item  from the cart")
    public void user_remove_item_from_the_cart() {

    }

    @Then("verify no item present in the cart")
    public void verify_no_item_present_in_the_cart() {

    }

    @When("user change quantity of the item")
    public void user_change_quantity_of_the_item() {

    }

    @Then("verify total quantity updated on the cart")
    public void verify_total_quantity_updated_on_the_cart() {
    }


//    @When("user enter username {string} and password {string}")
//    public void user_enter_username_and_password(String string, String string2) {
//        String username = null;
//        System.out.println("==========" + username);
//        String password = null;
//        System.out.println("==========" + password);
//    }

    @When("user enter username {string} and password {string}")
    public void user_enter_username_and_password(String username, String password) {
        System.out.println("============" + username);
        System.out.println("============" + password);
    }


    @Then("verify dropdown option")
    public void verify_dropdown_optionn(DataTable dt) {
        List<String> categories = dt.asList();

        for (String category : categories) {
            System.out.println(category);
        }
    }
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    //throw new io.cucumber.java.PendingException();


//    @Then("verify dropdown option")
//    public void verify_dropdown_option(List<List<String>> table) {
//        for (List<String> row : table) {
//            for (String item : row) {
//                System.out.println(item + "    ");
//
//            }
//            System.out.println();
//        }
//    }

    @Then("verify table data")
    public void verify_table_data(List<List<String>> table) {
        for (List<String> row : table) {
            for (String item : row) {
                System.out.println(item + "    ");

            }
            System.out.println();
        }
    }


    //    @Then("close browser")
//    public void close_browser() {
//        System.out.println("close browser  ");
//    }

}

