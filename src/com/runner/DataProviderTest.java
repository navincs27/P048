package com.runner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pom.LoginPage;

public class DataProviderTest extends BaseClass{
	
	
	@Test(dataProvider = "getData")
	public void verifyLogin(String user, String pass) {
		
		System.out.println("Username is : "+user);
		System.out.println("Password is : "+pass);	
	}
	
	@DataProvider
	public Object[][] getData() {
		Object credentials[][] = new Object[10][2];
		credentials[0][0] = "user1";
		credentials[0][1] = "pass1";
		
		credentials[1][0] = "user2";
		credentials[1][1] = "pass2";
		
		credentials[2][0] = "user3";
		credentials[4][0] = "user5";
		credentials[5][0] = "user6";
		credentials[7][1] = "pass1";
		
		credentials[8][0] = "user9";
		return credentials;	
	}
	
	
	public int length(String value) {
		int len = 3;
		return len;
	}

}




//Before suite --> browser launch
//Before method -> url launch
//@Test -> login - username , password









