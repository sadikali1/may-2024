package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.selenium.BasePage;

public class CartPage extends BasePage {

	public CartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="a[data-automation-id='at-product-title-link'] > span")
	private WebElement productTitle;
	
	@FindBy(css="button[id='checkoutButton']")
	private WebElement elementCheckout;
	
	
	public void verifyProduct(String product) {
		String product1 = productTitle.getText();
		Assert.assertEquals(product1, product);
        
	}
	
	public void checkout() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", elementCheckout);
	}
}
