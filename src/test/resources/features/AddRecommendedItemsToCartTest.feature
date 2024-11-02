Feature: Add recommended items to cart
  Scenario: Verify cart after user add recommended items to cart
    Given the user opens "application.url"
    Then the user verifies they are on the home page
    And the user scrolls to the recommended items part of the page
    Then the user verifies recommended items are visible
    When the user clicks on add to cart on a recommended products
    And the user clicks on the "navlink.cart" button
    Then the user verifies they are on the cart page
    And the user verifies that the recommended product is displayed in the cart