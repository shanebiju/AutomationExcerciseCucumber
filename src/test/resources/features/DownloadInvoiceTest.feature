Feature: Purchase Recommended Item and Download Invoice

  Scenario: Login, Add Recommended Items to Cart, Checkout, and Download Invoice
    Given the user opens "application.url"
    And the user clicks on the "navlink.signupLogin" button
    And the user enters login details and submits
    Then the user verifies they are logged in

    When the user clicks on add to cart on a recommended products
    And the user clicks on the "navlink.cart" button
    # And the user verifies that recommended items are present in the cart

    When the user proceeds to checkout
    Then the user verifies they are on the checkout page
    When the user clicks place order

    Then the user verifies they are on the payment page
    When the user enters payment details and confirms payment

    Then the user verifies that the order placement is done
    And the user downloads the invoice
    Then the user prints the invoice data
