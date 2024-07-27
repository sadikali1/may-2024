package com.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPExample {
	

	@Test(dataProvider = "testData")
	public void test1(int a, int b, int expected) {
		int c = a + b;
		Assert.assertEquals(c, expected);
	}
	
	@DataProvider(name = "testData")
	public Object[][] getData() {
		Object[][] data = new Object[][]{
			{10, 20, 30},
            {20, 15, 25},
            {30, 20, 50},
            {40, 25, 65},
            {50, 30, 80}
		};
		return data;
	}

}


// DataDriven Testing using DataProvider
// What is DataDriver Testing?
// DataDriven Testing is a Test design pattern where test input and output values are stored in a separate file (like excel, csv, xml etc)
// and they are loaded into the test script during runtime.

// What is DataProvider?
// DataProvider is a TestNG annotation which is used to pass parameters to the test methods.
// DataProvider returns a two dimensional array of objects.
