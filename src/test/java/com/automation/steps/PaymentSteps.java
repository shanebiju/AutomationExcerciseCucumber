package com.automation.steps;

import com.automation.pages.PaymentPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PaymentSteps {
    PaymentPage paymentPage=new PaymentPage();
    @Then("the user verifies they are on the payment page")
    public void the_user_verifies_they_are_on_the_payment_page() {
        Assert.assertTrue(paymentPage.isPaymentPageDisplayed());
    }

    @When("the user enters payment details and confirms payment")
    public void the_user_enters_payment_details_and_confirms_payment() {
       paymentPage.enterCardDetails();
       paymentPage.clickPayAndConfirm();
    }
}
