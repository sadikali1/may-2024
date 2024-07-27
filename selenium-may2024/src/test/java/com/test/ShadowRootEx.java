package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShadowRootEx {
	
	@Test
	public void testAlert() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/shadowdom");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		SearchContext element = driver.findElement(By.xpath("//my-paragraph")).getShadowRoot();
		
		String text = element.findElement(By.cssSelector("slot[name='my-text']")).getText();
		System.out.println("Text: " + text);
		
	}

}

// Shadow DOM is a web standard that offers component style and markup encapsulation. It is a way to create self-contained components that can be reused in web applications.

// //slot[@name='my-text']

// slot[name='my-text']