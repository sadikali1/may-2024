package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example {

	@BeforeSuite
	public void g() {
		System.out.println("This is before suite");
	}

	@AfterSuite
	public void h() {
		System.out.println("This is after suite");
	}

	@BeforeMethod
	public void a() {
		System.out.println("This is before method");
	}

	@AfterMethod
	public void b() {
		System.out.println("This is after method");
	}

	@BeforeClass
	public void c() {
		System.out.println("This is before class");
	}

	@AfterClass
	public void d() {
		System.out.println("This is after class");
	}

	@BeforeTest
	public void e() {
		System.out.println("This is before test");
	}

	@AfterTest
	public void f() {
		System.out.println("This is after test");
	}

	@Test
	public void test1() {
		System.out.println("This is test 1");
	}

	@Test
	public void test2() {
		System.out.println("This is test 2");
	}

}

// TestNG -- TestNG is a testing framework inspired from JUnit and NUnit but introducing some new functionality that makes it more powerful and easier to use.

// TestNG Annotations -- TestNG provides a set of annotations which helps in defining the test methods. These annotations are used before the method definition

// @Test -- The @Test annotation is used to signal that the method is a test method.
// @BeforeMethod -- The @BeforeMethod annotation is used to signal that the method will be run before each test method.
// @AfterMethod -- The @AfterMethod annotation is used to signal that the method will be run after each test method.
// @BeforeClass -- The @BeforeClass annotation is used to signal that the method will be run before the first test method in the current class is invoked.
// @AfterClass -- The @AfterClass annotation is used to signal that the method will be run after all the test methods in the current class have been run.
// @BeforeTest -- The @BeforeTest annotation is used to signal that the method will be run before any test method belonging to the classes inside the <test> tag is run.
// @AfterTest -- The @AfterTest annotation is used to signal that the method will be run after all the test methods belonging to the classes inside the <test> tag have run.
// @BeforeSuite -- The @BeforeSuite annotation is used to signal that the method will be run before all tests in this suite have run.
// @AfterSuite -- The @AfterSuite annotation is used to signal that the method will be run after all tests in this suite have run.
