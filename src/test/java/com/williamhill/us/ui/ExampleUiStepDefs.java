package com.williamhill.us.ui;

import com.williamhill.us.ui.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// What is this file for?

public class ExampleUiStepDefs {

  private final ScenarioContext scenarioContext;
  private final LoginPage loginPage;
  private WebDriver driver;

 public ExampleUiStepDefs(ScenarioContext scenarioContext) {
    this.scenarioContext = scenarioContext;
    this.driver = (WebDriver) this.scenarioContext.get(Keys.DRIVER);
    this.loginPage = PageFactory.initElements(driver, LoginPage.class);
  }

}
