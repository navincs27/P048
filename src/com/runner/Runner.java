package com.runner;

import java.io.IOException;

import com.base.BaseClass;
import com.pom.LoginPage;

public class Runner extends BaseClass{
	
	public void launchBrowser() {
		getDriver();
		launchUrl("https://www.facebook.com/");
	}
	
	public void verifyLoginFunctionality() throws Exception {
		LoginPage l = new LoginPage();		
		inputValues(l.username, "abc@123");
		inputValues(l.getPassword(), "12341235234");
		screenshot("home");
		clickOnElement(l.getLogin_btn());
		Thread.sleep(15000);
		screenshot("login");
		//by index
				dropdownByText(l.getLogin_btn(), "index", "4");
		//by value
				dropdownByText(l.getLogin_btn(), "value", "qwert");
		//by text
				dropdownByText(l.getLogin_btn(), "text", "zxcvbn");
				
		
		
		
		dropdownByIndex(day, 3);
		
		dropdownByIndex(month, 6);
	}

	public static void main(String[] args) throws Exception {
		Runner r = new Runner();
		r.launchBrowser();
		r.verifyLoginFunctionality();
	}

}
