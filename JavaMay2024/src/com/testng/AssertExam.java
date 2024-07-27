package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertExam {
	
	@Test
	public void testAssert() {
		
		String q = "Hello";
		String p = "Hello";
		
		Assert.assertEquals(p, q);
		System.out.println("String verified successfully");
		Assert.assertEquals(20, 20);
		System.out.println("Integer verified successfully");
		Assert.assertEquals(false, false);
		
		Assert.assertNotEquals(p, q);
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		Assert.assertNotNull(p);
		Assert.assertNull(null);
		Assert.assertNotSame(p, q);
		Assert.assertSame(p, q);
		Assert.fail("This is failed");
		System.out.println("This is failed");
	}
	
	@Test
	public void testSoftAssert() {
		String q = "Hello";
		String p = "Hello";
		
		SoftAssert obj = new SoftAssert();
		obj.assertEquals(10, 20);
		System.out.println("Integer verified successfully");
		obj.assertEquals("Hello", "Hello");
		System.out.println("String verified successfully");
		obj.assertTrue(false);
		obj.assertFalse(true);
		obj.assertNotNull(null);
		obj.assertNull(p);
		obj.assertNotSame(p, q);
		obj.assertSame(p, q);
		
		obj.assertAll();
	}

}



// TestNG assertion methods

// Type of Assertion in TestNg 
// 1. Hard Assertion 	    - If any assertion fails, the rest of the test case will be skipped.
// 2. Soft Assertion		- If any assertion fails, the rest of the test case will be executed. 
