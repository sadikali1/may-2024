package com.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class SeleniumExa {
	
	@Test
	public void test() {
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		//SafariDriver driver = new SafariDriver();
		//InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.facebook.com");
		

	}

}


// Selenium What is Selenium - Selenium is a suite of tools for automating web browsers.
// Selenium Components: 
	// 1.Selenium IDE, 
	// 2 Selenium WebDriver, 
	// 3.Selenium Grid
// Selenium IDE: Selenium IDE is a complete integrated development environment (IDE) for Selenium tests.
// Selenium WebDriver: Selenium WebDriver is the successor to Selenium RC. 


// Selenium Webdriver is a web automation framework that allows you to execute your tests against different browsers multiple browsers support
// supporting different programming languages. java, python, ruby, c#, php, javascript
// Open Source and free of cost
