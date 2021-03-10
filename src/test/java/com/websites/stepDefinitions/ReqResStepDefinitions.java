package com.websites.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

public class ReqResStepDefinitions {
    Response response = null;

    @Given("user sent a get request for \\/api\\/users\\/{int}")
    public void user_sent_a_get_request_for_api_users(Integer int1) {
        response =
                RestAssured.given()
                .baseUri("https://reqres.in")
                .basePath("/api/users/2").
        when()
                .get();
    }

    @Then("user should get response body for user {int}")
    public void user_should_get_response_body_for_user(Integer int1) {
        response.prettyPrint();
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
}
