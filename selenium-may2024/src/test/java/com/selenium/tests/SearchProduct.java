package com.selenium.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.ProductDetailPage;
import com.selenium.BaseTest;

public class SearchProduct extends BaseTest{
	
	@Test
	public void searchProduct() {
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.searchProduct("Archaeo Sarro 2-pc. Tab Top Window Tier");
		
	
		ProductDetailPage productDetailPage = PageFactory.initElements(driver, ProductDetailPage.class);
		productDetailPage.verifyProductDetailPage("Archaeo Sarro 2-pc. Tab Top Window Tier");
		
	}

}


// Page Object Model (POM) is a design pattern that enables us to create an object repository for web UI elements.
// It is a way to organize the code in a way that it is easier to maintain and understand.
// Page Factory is an inbuilt Page Object Model concept for Selenium WebDriver but it is very optimized.
// Page Factory can be used in two ways:
// 1. Using @FindBy annotation
// 2. Using PageFactory class
// In the above example, we have used the PageFactory class to initialize the web elements.
// PageFactory.initElements() method is used to initialize web elements.
// PageFactory.initElements() method takes the driver instance and the class type as parameters.
// PageFactory.initElements() method initializes all the web elements of the class.
// PageFactory.initElements() method initializes the web elements using the driver instance.


