package com.runner;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test()
	public void searchProduct() {
		System.out.println("Product search");
	}
	@Test(dependsOnMethods = "searchProduct")
	public void selectProduct() {
		System.out.println("Product selected");
	}
	@Test(dependsOnMethods = "selectProduct")
	public void addToCart() {
		System.out.println("cart added");
	}
	@Test(dependsOnMethods = "selectProduct")
	public void payment() {
		System.out.println("Payment");
	}
	
}
