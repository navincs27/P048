package com.runner;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
	
	@Test
	public void softAssertTest() {
		SoftAssert s = new SoftAssert();
		
		s.assertEquals("Navin", "Nav");
		
		System.out.println("Assertion passed");
		
		s.assertAll();
		
	}
	
	@Test
	public void hardAssertTest() {
		
		Assert.assertEquals("Navin", "Nav");
		
		System.out.println("Assertion passed");
		
	}

}
