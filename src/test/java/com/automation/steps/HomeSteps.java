package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {
    HomePage homePage=new HomePage();
    @Given("the user opens {string}")
    public void the_user_opens(String ConfigKey) {
        homePage.openWebsite(ConfigKey);
    }

    @Then("the user verifies they are logged in")
    public void the_user_verifies_they_are_logged_in() {
        Assert.assertTrue(homePage.isLoggedIn());
    }
    @Then("the user verifies they are on the home page")
    public void the_user_verifies_they_are_on_the_home_page() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }
    @Then("the user scrolls to the recommended items part of the page")
    public void the_user_scrolls_to_the_recommended_items_part_of_the_page() {
        homePage.scrollToRecommendedItems();
    }
    @Then("the user verifies recommended items are visible")
    public void the_user_verifies_recommended_items_are_visible() {

    }
    @When("the user clicks on add to cart on a recommended products")
    public void the_user_clicks_on_add_to_cart_on_a_recommended_products() {
        homePage.addRecommendedItemsToCart();
    }
    @When("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String ConfigKey) {
        homePage.getLinkByText(ConfigKey).click();
    }

    @Then("The {string} link is visible on the homepage")
    public void the_link_is_visible_on_the_homepage(String string) {
        Assert.assertTrue(!homePage.isLoggedIn());
    }

    @When("The user scrolls to the bottom of the page")
    public void the_user_scrolls_to_the_bottom_of_the_page() {
        homePage.scrollToBottom();
    }
    @Then("The subscription section is visible")
    public void the_subscription_section_is_visible() {
        Assert.assertTrue(homePage.isSubscriptionVisible());
    }
    @When("The user scrolls up to the top of the page using arrow")
    public void the_user_scrolls_up_to_the_top_of_the_page_using_arrow() {
        homePage.scrollUp();
    }
}
