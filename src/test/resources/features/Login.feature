Feature: To Test Login Functionality


  Background:

    Given user open website
    And verify user is on login page

# here write all scenarios

  @Smoke @Chirag
  Scenario: Verify user can login into application

    When user enter the valid credentials
    Then verify home page is displayed

  @Regression @Paulina
  Scenario: Verify user cannot login with invalid credentials

    When user enter the invalid credentials
    Then verify invalid login error message is displayed

    #And user close website