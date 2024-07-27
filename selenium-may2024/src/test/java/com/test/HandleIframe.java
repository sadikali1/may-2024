package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleIframe {
	
	@Test
	public void testIFrame() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame("frame1");
		String text = driver.findElement(By.tagName("h1")).getText();
		Assert.assertEquals(text, "This is a sample page");
		
		driver.switchTo().parentFrame();
		String text1 = driver.findElement(By.xpath("//div[@id='framesWrapper']/div[1]")).getText();
		System.out.println(text1);
		
		driver.quit();
		
	}
	
	@Test
	public void testNestedIframe() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame("frame1");
		String text = driver.findElement(By.tagName("body")).getText();
		Assert.assertEquals(text, "Parent frame");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		String text1 = driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals(text1, "Child Iframe");
		
		driver.switchTo().defaultContent();
		String text2 = driver.findElement(By.xpath("//div[@id='framesWrapper']/div[1]")).getText();
		System.out.println(text2);
		
		driver.quit();
	}

}

// iframe is an HTML element that allows you to embed another HTML document inside the main HTML document.
// selenium provides the switchTo().frame() method to switch to an iframe.
// There are three ways to switch to an iframe:
// 1. By index
// 2. By name or id
// 3. By WebElement
// driver.switchTo().frame(0);
// driver.switchTo().frame("frame1");
// driver.switchTo().frame(WebElement);
// driver.switchTo().parentFrame();
// driver.switchTo().defaultContent();
