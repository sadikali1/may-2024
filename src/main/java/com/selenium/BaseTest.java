package com.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.annotations.ITest;

public abstract class BaseTest {

	protected WebDriver driver;
	protected String appUrl;
	protected String userName;
	protected String password;
	
	
	@BeforeMethod
	public void setUp() throws IOException {
		appUrl = Config.getConfig("AppUrl");
		userName = Config.getConfig("UserName");
		password = Config.getConfig("Password");
		
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		long time = System.currentTimeMillis();
		if(result.getStatus() == ITestResult.FAILURE) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File file1 = ts.getScreenshotAs(OutputType.FILE);
			File file2 = new File("page"+time+".png");
			FileUtils.copyFile(file1, file2);
		}
		driver.quit();
	}

}
