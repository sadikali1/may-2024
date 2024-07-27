package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookGet {
	
	@Test
	public void testFacebookGet() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String text = driver.findElement(By.className("_8eso")).getText();
		System.out.println("Text: " + text);
		Assert.assertEquals(text, "Facebook helps you connect and share with the people in your life.");
		
		String attribute = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println("Attribute: " + attribute);
		Assert.assertEquals(attribute, "Email address or phone number");
		
		String attribute1 = driver.findElement(By.id("pass")).getAttribute("placeholder");
		System.out.println("Attribute: " + attribute1);
		Assert.assertEquals(attribute1, "Password");
		
		String fontSize = driver.findElement(By.name("login")).getCssValue("font-size");
		System.out.println("Font Size: " + fontSize);
		Assert.assertEquals(fontSize, "20px");
		
		String lineHeight = driver.findElement(By.name("login")).getCssValue("line-height");
		System.out.println("Line Height: " + lineHeight);
		Assert.assertEquals(lineHeight, "48px");
		driver.quit();
	}
	
	@Test
	public void getMethods() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
		driver.findElement(By.linkText("Forgotten password?")).click();

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
        Assert.assertEquals(currentUrl, "https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
        Assert.assertTrue(currentUrl.contains("ctx=recover"));
        
        String pageSource = driver.getPageSource();
        System.out.println("Page Source: " + pageSource);
        driver.quit();
		
	}
	
	// getTitle() method - Get the title of the page
	// getCurrentUrl() method - Get the URL of the page
	// getPageSource() method - Get the source of the page
	

}


// getText() method - Get the text of the element
// getAttribute() method -  Get the value of the attribute
// getCssValue() method -- Get the value of the CSS property
