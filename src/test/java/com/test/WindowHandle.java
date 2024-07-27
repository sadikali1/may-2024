package com.test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle {

	@Test
	public void testWindow() {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String text = driver.findElement(By.tagName("h3")).getText();
		System.out.println(text);

		driver.findElement(By.partialLinkText("Here")).click();

		String parnetId = driver.getWindowHandle();
		Set<String> ids = driver.getWindowHandles();
		for (String id : ids) {
			if (!id.equals(parnetId)) {
				driver.switchTo().window(id);
			}
		}

		String childWindowText = driver.findElement(By.xpath("//body/div[@class='example']/h3")).getText();
		System.out.println(childWindowText);
		driver.close();
		driver.switchTo().window(parnetId);

		String text1 = driver.findElement(By.tagName("h3")).getText();
		System.out.println(text1);

		driver.quit();
	}
	
	@Test
	public void openWindow() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com");
		
	}

}

// window handles in selenium:
// Selenium provides the getWindowHandle() method to get the current window handle.
// Selenium provides the getWindowHandles() method to get all the window handles.
// Selenium provides the switchTo().window() method to switch to a window.

// close browser method in selenium:
// Selenium provides the close() method to close the current window.
//	Syntax:
//	driver.close();
// Selenium provides the quit() method to close all the windows.
//    Syntax:
//    driver.quit();
//	// It closes all the windows opened by the driver instance.
//	// It also closes the browser process.
//	// It also closes the WebDriver session.
//	// It also closes the WebDriver server.




// POM (Page Object Model)
// Git and GitHub


// BDD (Behavior Driven Development)


// Cucumber is a testing framework that supports BDD (Behavior Driven Development).
// Given, When, Then, And, But
// Feature, Scenario, Scenario Outline, Background, Examples, Tags, Hooks
// Gherkins Language

// Given - Precondition 
// When - Action
// Then - Expected Result
// And - Additional Steps

// Scenario Outline - Data Driven Testing
// Examples - Data Table
// Background - Common Steps

// Tags - To group the scenarios
// Hooks - Before and After Hooks
// @Before
// @After
// @BeforeStep
// @AfterStep


// DataTable - To pass the data in the form of table
// List<List<String>> datas = table.asLists();
// List<Map<String, String>> datas = table.asMaps();







