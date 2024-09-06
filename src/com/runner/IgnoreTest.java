package com.runner;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {

	@Test(priority = 1,invocationCount = 5)
	public void searchProduct() {
		System.out.println("Product search");
	}
	@Test(priority = 1, enabled = false)
	public void selectProduct() {
		System.out.println("Product selected");
	}
	@Ignore
	@Test(priority = 2)
	public void addToCart() {
		System.out.println("cart added");
	}
	@Test(priority = 2)
	public void payment() {
		System.out.println("Payment");
	}
	
	@AfterSuite
	public void closeBrowser() {
		System.out.println("Browser closed");
	}
}
