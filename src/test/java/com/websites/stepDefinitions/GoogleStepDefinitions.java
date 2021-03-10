package com.websites.stepDefinitions;

import com.websites.pages.GoogleSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("user is on the google home page")
    public void user_is_on_the_google_home_page() {
        googleSearchPage.get_google_page();
    }

    @When("user searches stars in the search field")
    public void user_searches_stars_in_the_search_field() throws InterruptedException {
        googleSearchPage.search_for_stars();
    }

    @Then("the title should change to {string}")
    public void the_title_should_change_to(String string) throws InterruptedException {
        googleSearchPage.assert_that_google_titile_has_changed();
    }

}
