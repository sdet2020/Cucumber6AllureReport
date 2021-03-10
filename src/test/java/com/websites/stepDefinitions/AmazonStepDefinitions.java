package com.websites.stepDefinitions;

import com.websites.pages.AmazonSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonStepDefinitions {

    AmazonSearchPage amazonSearchPage = new AmazonSearchPage();

    @Given("user is on the amazon home page")
    public void user_is_on_the_amazon_home_page() {
        amazonSearchPage.get_amazon_page();
    }

    @When("user enters a book name in the search field")
    public void user_enters_a_book_name_in_the_search_field() throws InterruptedException {
        amazonSearchPage.search_for_books();
    }
    @Then("Amazon's title should change to 'Amazon.com : books'")
    public void amazon_s_title_should_change_to_amazon_com_books() throws InterruptedException {
        amazonSearchPage.assert_that_amazon_titile_has_changed();
    }


}
