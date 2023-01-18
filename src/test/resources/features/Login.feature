Feature: To Test Login Functionality

# here write all scenarios
  Scenario: Verify user can login into application
    Given user open website
    And verify user is on login page
    When user enter the valid credentials
    Then verify home page is displayed
    Given user open website

  Scenario: Verify user cannot login with invalid credentials
    Given user open website
    And verify user is on login page
    When user enter the valid credentials
    Then verify invalid login error message is displayed
    Given user open website
    And user close website