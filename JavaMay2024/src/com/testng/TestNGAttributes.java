package com.testng;

import org.testng.annotations.Test;

public class TestNGAttributes {

	@Test(description = "Test method1", priority = 1)
	public void test2() {
		System.out.println("This is test2");
	}
	
	@Test(priority = 2, alwaysRun = true)
	public void test1() {
		System.out.println("This is test1");
    }
	
	@Test(dependsOnMethods = {"test2", "test1"})
	public void test3() {
		System.out.println("This is test3");
	}
	
}



// Maven -- Maven is a build automation tool used primarily for Java projects.
// Maven addresses two aspects of building software:
// 1. It describes how software is built. execution of test cases, packaging, etc.
// 2. It describes its dependencies. (java files)
