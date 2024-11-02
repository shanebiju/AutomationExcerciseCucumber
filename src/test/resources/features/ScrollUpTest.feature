Feature: Verify scroll up and down functionality on homepage

  Scenario: Scroll to bottom and verify subscription, then scroll up to verify homepage
    Given the user opens "application.url"
    Then the user verifies they are on the home page
    When The user scrolls to the bottom of the page
    Then The subscription section is visible
    When The user scrolls up to the top of the page using arrow
    Then the user verifies they are on the home page
