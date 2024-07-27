package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.selenium.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	// locators
	@FindBy(id = "searchInputId")
	private WebElement searchInput;
	
	@FindBy(css = "button[data-automation-id='searchIconBlock']")
	private WebElement searchButton;
	
	
	// functions
	public void searchProduct(String product) {
		searchInput.clear();
		searchInput.sendKeys(product);
		searchButton.click();
	}
	
}
