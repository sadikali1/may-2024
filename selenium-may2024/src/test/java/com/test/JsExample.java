package com.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JsExample {
	
	WebDriver driver;
	
	@Test
	public void test1() {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.id("timerAlertButton"));
		//js.executeScript("arguments[0].scrollIntoView();", element);
		
		//js.executeScript("window.scroll(1000, 1000)");
		js.executeScript("arguments[0].click();", element);
		//driver.findElement(By.id("timerAlertButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		Alert alerts = driver.switchTo().alert();
		alerts.accept();
		
		
	}
	
	

}


// Wait in Selenium:
// What is Wait in Selenium? 
// Wait in Selenium is a command used to make the WebDriver wait for a certain amount of time before it throws an exception.
// There are two types of waits in Selenium:
// 1. Implicit Wait
// 2. Explicit Wait
// implicit wait: 
// Implicit wait is used to tell the WebDriver to wait for a certain amount of time before it throws a "No Such Element Exception".
// The default setting is 0. Once we set the time, the WebDriver will wait for the element for that time before throwing an exception.

// Explicit Wait:
// Explicit wait is used to tell the WebDriver to wait for a certain condition to occur before proceeding further in the code.
// The explicit wait is an intelligent kind of wait, but it can be applied only for specified elements.
// We can use the ExpectedConditions class to wait for a certain condition to occur before proceeding further in the code.
// ExpectedConditions class provides a set of predefined conditions to wait for before proceeding further in the code.
// Some of the commonly used ExpectedConditions are:
// 1. alertIsPresent()
// 2. elementToBeClickable()
// 3. elementToBeSelected()
// 4. frameToBeAvailableAndSwitchToIt()
// 5. invisibilityOfElementLocated()
// 6. presenceOfAllElementsLocatedBy()
// 7. presenceOfElementLocated()
// 8. textToBePresentInElement()
// 9. titleContains()
// 10. visibilityOf()
// 11. visibilityOfAllElements()
// 12. visibilityOfElementLocated()
// 13. numberOfWindowsToBe()


