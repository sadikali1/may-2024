package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {

	@Test
	public void testLogin() {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement userElement = driver.findElement(By.id("email"));
		userElement.clear();
		userElement.sendKeys("test@gmail.com");
		
		WebElement passwordElement = driver.findElement(By.id("pass"));
		passwordElement.clear();
		passwordElement.sendKeys("Password");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		driver.quit();
	}
	
}




// element is a web element -- 
// locator is a way to find the element

// html tags and attributes
// <input type="text" name="email" id="email" class="inputtext login_form_input_box" data-testid="royal_email">


// locator strategies in selenium	
// 1. id
// 2. name
// 3. class name
// 4. tag name
// 5. link text
// 6. partial link text
// 7. css selector
// 8. xpath 



