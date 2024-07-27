package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.selenium.BasePage;

public class ProductDetailPage extends BasePage {

	public ProductDetailPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(css="h1[id='productTitle-false']")
	private WebElement productTitle;
	
	@FindBy(css="p[data-automation-id='addToCart']")
	private WebElement addToChart;
	
	@FindBy(css="button[data-automation-id='at-panel-checkout-button']")
	private WebElement checkOutButton;
	
	public void verifyProductDetailPage(String product) {
		String text = productTitle.getText();
		Assert.assertEquals(text, product);
	}
	
	public void addToCart() {
		addToChart.click();
	}
	
	public void checkOut() {
		checkOutButton.click();
	}
	
}
