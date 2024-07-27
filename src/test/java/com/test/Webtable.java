package com.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Webtable {
	
	@Test
	public void testWebtable() {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		System.out.println("Number of rows: " + rows.size());

		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
		System.out.println("Number of columns: " + cols.size());

		for (int i = 1; i <= rows.size(); i++) {
			
			for (int j = 1; j <= cols.size(); j++) {
				WebElement cell = driver
						.findElement(By.xpath("//table[@id='table1']/tbody/tr[" + i + "]/td[" + j + "]"));
				System.out.print(cell.getText() + "\t");
				
			}
			System.out.println();
		}

		driver.quit();
	}

	
	@Test
	public void testWebtable1() {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Data data = new Data();
		data.setFirstName("John");
		data.setLastName("Doe");
		data.setEmail("test123@test.com");
		data.setAge(30);
		data.setSalary("10000");
		data.setDepartment("IT");
		
		addUser(driver, data);
		
		boolean isRecordAdded = false;
		List<WebElement> emailColumn = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div/div[4]"));
		int i = 1;
		for (WebElement email : emailColumn) {
			String emailAddress = email.getText();
			if (emailAddress.equals("test123@test.com")) {
				isRecordAdded = true;
				
				// delete record 
				driver.findElement(By.xpath("//div[@class='rt-tbody']/div/div/div[7]/div/span[@id='delete-record-"+i+++"']")).click();
				System.out.println("Email is found in the table");
				break;
			}
		}
		
		Assert.assertTrue(isRecordAdded, "Record is not added to the table");
		driver.quit();
	}
	
	public void addUser(WebDriver driver, Data data) {
		driver.findElement(By.id("addNewRecordButton")).click();
		driver.findElement(By.id("firstName")).sendKeys(data.getFirstName());
		driver.findElement(By.id("lastName")).sendKeys(data.getLastName());
		driver.findElement(By.id("userEmail")).sendKeys(data.getEmail());
		driver.findElement(By.id("age")).sendKeys(""+data.getAge());
		driver.findElement(By.id("salary")).sendKeys(data.getSalary());
		driver.findElement(By.id("department")).sendKeys(data.getDepartment());
		driver.findElement(By.id("submit")).click();
	}

	// Encapsulation -- wrapping up of data into a single unit.
	
}
