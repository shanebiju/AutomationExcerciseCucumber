package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.LoginSignupPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSignupSteps {
    LoginSignupPage loginSignupPage=new LoginSignupPage();
    @Given("the user enters login details and submits")
    public void the_user_enters_login_details_and_submits() {
        loginSignupPage.enterLoginDetails();
        loginSignupPage.clickLogin();
    }

    @When("the user navigates to the {string} page")
    public void the_user_navigates_to_the_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The user enters signup details")
    public void the_user_enters_signup_details() {
        loginSignupPage.enterSignupDetails();
    }
    @When("The user clicks on signup button")
    public void the_user_clicks_on_signup_button() {
        loginSignupPage.clickSignup();
    }

    @When("The user clicks on {string} link")
    public void the_user_clicks_on_link(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
