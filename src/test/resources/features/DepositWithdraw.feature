Feature: To Test Deposit Withdraw Functionality

    Background:
      Given  user open bank website
      Then verify user is on login page


  Scenario: Verify user can make deposit to the account

    Then verify user is on deposit window page
    When user make deposit
    And verify balance after deposit



    Scenario: Verify user can make withdraw from the account

      Then verify user is on withdraw window page
      When user make withdraw
      And verify balance after withdraw

