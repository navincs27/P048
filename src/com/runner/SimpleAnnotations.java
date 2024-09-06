package com.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {
	
	@BeforeSuite
	public void launchBrowser() {
		System.out.println("Browser launched");
	}
	
	@BeforeTest
	public void launchUrl() {
		System.out.println("Url launched");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("Logged in successfully");
	}
	
	@BeforeMethod
	public void implicitWait() {
		System.out.println("Implicit wait");
	}
	
	@Test(priority = 1)
	public void searchProduct() {
		System.out.println("Product search");
	}
	@Test(priority = 1)
	public void selectProduct() {
		System.out.println("Product selected");
	}
	@Test(priority = 2)
	public void addToCart() {
		System.out.println("cart added");
	}
	@Test(priority = 2)
	public void payment() {
		System.out.println("Payment");
	}
	@AfterMethod
	public void screenshot() {
		System.out.println("Screenshot captured");
	}
	@AfterClass
	public void logout() {
		System.out.println("Logged out successfully");
	}
	@AfterTest
	public void deleteCookies() {
		System.out.println("Cookies deleted");
	}
	@AfterSuite
	public void closeBrowser() {
		System.out.println("Browser closed");
	}

}
