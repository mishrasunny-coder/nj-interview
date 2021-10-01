package com.williamhill.us.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getLoginValidationErrorMessage() {
        return getElement(By.cssSelector(".mwc-login-validation-msg.mwc-form-error-message.ng-isolate-scope")).getText();
    }

    public String getLoginErrorMessageTitle() {
        return getElement(By.cssSelector(".mwc-form-error-message-text")).getText();
    }
}

