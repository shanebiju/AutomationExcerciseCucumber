package com.automation.steps;

import com.automation.pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartSteps {
    CartPage cartPage=new CartPage();
    @Then("the user verifies they are on the cart page")
    public void the_user_verifies_they_are_on_the_cart_page() {
        Assert.assertTrue(cartPage.isCartPageDisplayed());
    }

    @Then("the user verifies that the recommended product is displayed in the cart")
    public void the_user_verifies_that_the_recommended_product_is_displayed_in_the_cart() {
        Assert.assertTrue(cartPage.verifyCartItems("homepage.recommendedItems"));
    }

    @When("the user proceeds to checkout")
    public void the_user_proceeds_to_checkout() {
        cartPage.proceedToCheckout();
    }
}
