package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.ProductDetailPage;
import com.pages.ShippingPage;
import com.pages.SignInPage;
import com.selenium.BaseTest;

public class CheckOutWithGuest extends BaseTest {

	
	@Test
	public void testCheckOutWithGuest() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.searchProduct("Archaeo Sarro 2-pc. Tab Top Window Tier");
		
	
		ProductDetailPage productDetailPage = PageFactory.initElements(driver, ProductDetailPage.class);
		productDetailPage.verifyProductDetailPage("Archaeo Sarro 2-pc. Tab Top Window Tier");
		
		productDetailPage.addToCart();
		productDetailPage.checkOut();
		
		CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
		cartPage.verifyProduct("Archaeo Sarro 2-pc. Tab Top Window Tier");
		cartPage.checkout();
		
	    // Checkout as guest
		SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
		signInPage.clickOnGuestButton();
		
		
		ShippingPage shippingPage = PageFactory.initElements(driver, ShippingPage.class);
		shippingPage.fillShippingDetails("John", "Doe", "1234 Main St", "Apt 1");
		 
	}
}
