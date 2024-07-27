package com.selenium.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.ProductDetailPage;
import com.pages.SignInPage;
import com.selenium.BaseTest;

public class CheckOutWithExistingUser extends BaseTest{

	@Test
	public void testCheckOutWithExistingUser() {
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.searchProduct("Archaeo Sarro 2-pc. Tab Top Window Tier");
		
		ProductDetailPage productDetailPage = PageFactory.initElements(driver, ProductDetailPage.class);
		productDetailPage.verifyProductDetailPage("Archaeo Sarro 2-pc. Tab Top Window Tier");
		productDetailPage.addToCart();
		productDetailPage.checkOut();
		
		CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
		cartPage.verifyProduct("Archaeo Sarro 2-pc. Tab Top Window Tier");
		cartPage.checkout();
		
		SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
		signInPage.loginInApp(userName, password);
	}
	
}


// Git -  Version Control System
// Git is a distributed version control system that allows multiple developers to work on a project simultaneously.
