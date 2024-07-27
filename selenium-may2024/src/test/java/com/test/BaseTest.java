package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {

	WebDriver driver;

	@BeforeClass
	@Parameters({"browser"})
	public void setUp(String browser1) {
		if(browser1.equals("chrome")){
			driver = new ChromeDriver();
		}else if(browser1.equals("firefox")){
            driver = new FirefoxDriver();
		} else if (browser1.equals("edge")) {
			driver = new EdgeDriver();
		}
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
