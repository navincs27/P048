package com.runner;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	@Parameters({"username", "password"})
	@Test
	public void verifyLogin(String user, String pass) {
		System.out.println("Username is : "+user);
		System.out.println("Password is : "+pass);	
	}
	
}
