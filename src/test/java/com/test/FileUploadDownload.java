package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadDownload {

	@Test
	public void testDownload() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/download");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("1P2S.png")).click();
	}
	
	@Test
	public void testUpload() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\admin\\Downloads\\1P2S.png");
		driver.findElement(By.id("file-submit")).click();
	}
}
