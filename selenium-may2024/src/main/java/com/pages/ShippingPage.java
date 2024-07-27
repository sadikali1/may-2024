package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.selenium.BasePage;

public class ShippingPage extends BasePage {

	public ShippingPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "firstName")
	private WebElement firstNameInput;

	@FindBy(id = "lastName")
	private WebElement lastNameInput;

	@FindBy(id = "lineOne")
	private WebElement addressInput;

	@FindBy(id = "city")
	private WebElement cityInput;

	public void fillShippingDetails(String firstName, String lastName, String address, String city) {
		firstNameInput.sendKeys(firstName);
		lastNameInput.sendKeys(lastName);
		addressInput.sendKeys(address);
		cityInput.sendKeys(city);

	}

}
