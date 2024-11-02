package com.automation.steps;

import com.automation.pages.AccountDeletedPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountDeletedPageSteps {
    AccountDeletedPage accountDeletedPage=new AccountDeletedPage();

    @Then("The account deleted confirmation message is displayed")
    public void the_account_deleted_confirmation_message_is_displayed() {
        Assert.assertTrue(accountDeletedPage.isAccountDeletedTextDisplayed());
    }

    @When("The user clicks continue button of account deletion page")
    public void the_user_clicks_continue_button_of_account_deletion_page() {
       accountDeletedPage.clickContinueBtn();
    }
}
