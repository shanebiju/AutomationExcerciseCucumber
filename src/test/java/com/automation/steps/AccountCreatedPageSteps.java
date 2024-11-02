package com.automation.steps;

import com.automation.pages.AccountCreatedPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountCreatedPageSteps {
    AccountCreatedPage accountCreatedPage=new AccountCreatedPage();

    @Then("The account created confirmation message is displayed")
    public void the_account_created_confirmation_message_is_displayed() {
        Assert.assertTrue(accountCreatedPage.isAccountCreatedTextDisplayed());
    }
    @When("The user clicks continue button of account created page")
    public void the_user_clicks_continue_button_of_account_created_page() {
        accountCreatedPage.clickContinueBtn();
    }
}
