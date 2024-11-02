package com.automation.steps;

import com.automation.pages.CheckoutPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutSteps {
    CheckoutPage checkoutPage=new CheckoutPage();
    @Then("the user verifies they are on the checkout page")
    public void the_user_verifies_they_are_on_the_checkout_page() {
        Assert.assertTrue(checkoutPage.isCheckoutPageDisplayed());
    }

    @When("the user clicks place order")
    public void the_user_clicks_place_order() {
        checkoutPage.clickPlaceOrder();
    }
}
