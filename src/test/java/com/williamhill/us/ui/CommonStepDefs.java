package com.williamhill.us.ui;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

// What is this file for?

public class CommonStepDefs {

  private final ScenarioContext scenarioContext;

  public CommonStepDefs(ScenarioContext scenarioContext) {
    this.scenarioContext = scenarioContext;
  }

  @Given("I am on the Sportsbook")
  public void iAmOnTheSportsbook() {
    ((WebDriver) this.scenarioContext.get(Keys.DRIVER)).navigate().to("https://www.williamhill.com/us/nj/bet/");
  }
}
