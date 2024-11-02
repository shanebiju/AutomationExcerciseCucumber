package com.automation.steps;

import com.automation.pages.AccountInfoPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountInfoPageSteps {
    AccountInfoPage accountInfoPage=new AccountInfoPage();
    @Then("The account information page is displayed")
    public void the_account_information_page_is_displayed() {
        Assert.assertTrue(accountInfoPage.isAccountInfoPageDisplayed());
    }

    @When("The user fills in account information")
    public void the_user_fills_in_account_information() {
        accountInfoPage.fillAccountInfo();
    }

    @When("The user clicks on create account button")
    public void the_user_clicks_on_create_account_button() {
        accountInfoPage.clickCreateAccountBtn();
    }
}
