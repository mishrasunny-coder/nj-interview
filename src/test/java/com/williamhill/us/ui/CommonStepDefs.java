package com.williamhill.us.ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

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
  @When("I enter incorrect credentials")
  public void enterCredentials() {
//	  WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
	  WebDriverWait(((WebDriver) this.scenarioContext.get(Keys.DRIVER)), Duration.ofSeconds(20)).until(ExpectedConditions.
			  elementToBeClickable(By.xpath("//div[@class='headerSectionContainer container']/div[2]/div/div/div/button[1]/span")));

	  ((WebDriver) this.scenarioContext.get(Keys.DRIVER)).findElement(By.xpath("//div[@class='headerSectionContainer container']/div[2]/div/div/div/button[1]/span")).click();
//	  DRIVER.findElementByXpath("//div[@class='headerSectionContainer container']/div[2]/div/div/div/button[1]/span").click()
//	  WebElement Login = DRIVER.findElementByXpath(By.xpath("//div[@class='headerSectionContainer container']/div[2]/div/div/div/button[1]/span")).
	  
	  ((WebDriver) this.scenarioContext.get(Keys.DRIVER)).findElement(By.id("user")).sendKeys("abcabc@abc.com");
//	  input[id='password']
	  ((WebDriver) this.scenarioContext.get(Keys.DRIVER)).findElement(By.cssSelector("input[id='password']")).sendKeys("abc123");
//	  button[id='submit']
	  ((WebDriver) this.scenarioContext.get(Keys.DRIVER)).findElement(By.cssSelector("button[id='submit']")).click();
  }
  private FluentWait<WebDriver> WebDriverWait(WebDriver webDriver, Duration ofSeconds) {
	// TODO Auto-generated method stub
	return null;
}

@Then("there is an error informing me about incorrect credentials")
  public void errorMessage() {
	//p[@class='mwc-form-error-message-text']/span
	  String getText = ((WebDriver) this.scenarioContext.get(Keys.DRIVER)).findElement(By.xpath("p[@class='mwc-form-error-message-text']/span")).getText();
	  Assert.assertEquals(getText, "You have entered an incorrect email or password.\r\n"
	  		+ "Your account will be locked if you enter an incorrect password three times and if the account exists, you will receive an email on how to unlock it");
  }
}
