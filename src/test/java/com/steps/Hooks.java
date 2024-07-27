package com.steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

	static WebDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		System.out.println("I am a setup method");
	}

	@After
	public void tearDown() {
		System.out.println("I am a tear down method");
		driver.quit();
	}

	@AfterStep
	public void afterStep() {
		System.out.println("I am a after step method");
	}

	@BeforeStep
	public void beforeStep() {
		System.out.println("I am a before step method");
	}

}
