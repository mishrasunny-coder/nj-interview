package com.williamhill.us.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class BasePage {

  final WebDriver webDriver;
  WebDriverWait wait;

  BasePage(WebDriver webDriver) {
    this.webDriver = webDriver;
    this.wait = new WebDriverWait(webDriver, 5);
  }

  void click(By by) {
    wait.until(ExpectedConditions.elementToBeClickable(by)).click();
  }

  void click(WebElement webElement) {
    wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
  }

  WebElement getElement(By by) {
    return wait.until(ExpectedConditions.presenceOfElementLocated(by));
  }
}
