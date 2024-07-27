package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.selenium.BasePage;

public class SignInPage extends BasePage {

	public SignInPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "[data-automation-id='at-continue-as-guest']")
	private WebElement guestButton;
	
	@FindBy(id = "email")
	private WebElement emailInput;
	
	@FindBy(id = "cartSignInPassword")
	private WebElement passwordInput;
	
	@FindBy(css = "[data-automation-id='at-sign-in-button']")
	private WebElement signInButton;
	
	public void clickOnGuestButton() {
		guestButton.click();
	}
	
	public void loginInApp(String username, String password) {
		emailInput.sendKeys(username);
		passwordInput.sendKeys(password);
		signInButton.click();
	}
	
}
