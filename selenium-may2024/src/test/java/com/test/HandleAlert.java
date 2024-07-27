package com.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleAlert {

	@Test
	public void testAlert() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text: " + alert.getText());
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println("Alert Text: " + alert1.getText());
		alert1.dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println("Alert Text: " + alert2.getText());
		alert2.sendKeys("Test");
		Thread.sleep(2000); // Wait for 2 seconds)
		alert2.accept();
	}
}

// Alert is a pop-up message that appears on the screen.
// There are three types of alerts:
// 1. Simple Alert
// 2. Confirmation Alert
// 3. Prompt Alert
// Alert Interface in Selenium:
// 1. void accept() -- To click on OK button
// 2. void dismiss() -- To click on Cancel button
// 3. void sendKeys(String keysToSend) -- To enter text in the prompt alert
// 4. String getText() -- To get the text of the alert
//	// Alert alert = driver.switchTo().alert();
//	// alert.accept();
//	// alert.dismiss();
//	// alert.sendKeys("Test");
//	// alert.getText();

