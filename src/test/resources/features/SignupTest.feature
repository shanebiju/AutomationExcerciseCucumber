Feature: User account creation and deletion

  Scenario: Create and delete user account
    Given the user opens "application.url"
    When the user clicks on the "navlink.signupLogin" button
    And The user enters signup details
    And The user clicks on signup button
    Then The account information page is displayed
    When The user fills in account information
    And The user clicks on create account button
    Then The account created confirmation message is displayed
    When The user clicks continue button of account created page
    And the user clicks on the "navlink.deleteAccount" button
    Then The account deleted confirmation message is displayed
    When The user clicks continue button of account deletion page
    Then The "navlink.signupLogin" link is visible on the homepage
