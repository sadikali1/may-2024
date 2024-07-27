package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookSignUp {

	@Test
	public void testFacebookSignUp() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebElement signUpElemenet = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		//signUpElemenet.click();
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		//Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("User");
		driver.findElement(By.name("reg_email__")).sendKeys("test@test.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("test@test.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Password");
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByIndex(5);
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("11");
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1990");
		
		driver.quit();
	}
	
}


// Selenium Waits
// 1. Implicit Wait
// 2. Explicit Wait
// 3. Fluent Wait
// 4. Thread.sleep()
