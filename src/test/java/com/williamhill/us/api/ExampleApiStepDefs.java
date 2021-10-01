package com.williamhill.us.api;

import com.google.gson.Gson;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ExampleApiStepDefs {
  private Response response;

  @Given("I call the api requesting user id {int}")
  public void iCallTheApiRequestingUserId(int userId) {

    // Write the API call on the line below using the module given
    //  https://rest-assured.io/
    // API URL to call: https://www.williamhill.com/us/nj/bet/api/v2/sports/americanfootball/events/highlights
    // Store the response from the API call in the "response" variable so it can be parsed later
    // Your code here:
   //    response = "";



    // Modify thre reponse to retrieve events no further in the future than the next 24 hours
    // You'll find the date field in the response JSON at the top level
    // Your code here:
    try{

    } catch (Exception e){
        throw new Error("No events here...");
    }
  }

}
