package com.automation.steps;

import com.automation.pages.PaymentDonePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.io.FileNotFoundException;

public class PaymentDoneSteps {
    PaymentDonePage paymentDonePage=new PaymentDonePage();
    @Then("the user verifies that the order placement is done")
    public void the_user_verifies_that_the_order_placement_is_done() {
        Assert.assertTrue(paymentDonePage.isOrderPlacedDisplayed());
    }

    @Then("the user downloads the invoice")
    public void the_user_downloads_the_invoice() {
        paymentDonePage.downloadInvoice();
    }

    @Then("the user prints the invoice data")
    public void the_user_prints_the_invoice_data() throws FileNotFoundException, InterruptedException {
        paymentDonePage.printInvoiceData();
    }
}
