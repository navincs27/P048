package com.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	public void getDriver() {
		driver = new ChromeDriver();
	}

	public void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void inputValues(WebElement element, String input) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
			element.clear();
			element.sendKeys(input);
	}

	public void clickOnElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
	}
	
	
	public void screenshot(String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\Avadi\\workspace\\P048\\Screenshots\\"+fileName+".png");
		FileHandler.copy(src, des);
		
		byte s = 24;
		int num = 23;
		
		System.out.println(s+num);		//47
		
		System.out.println(s+num+"abc");  //47abc  24+23-> 47+"abc" --> "47abc"
		
		System.out.println(s+""+num); 		//2423  24+""  "24"+23  -->"2423"
		
		System.out.println("abc"+s+num);   //abc2423	"abc"+24  -> "abc24"+23   --> "abc2423"
		
	}
	

	public void dropdownByText(WebElement element,String option, String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		Select s = new Select(element);
		
		if(option.equals("value")) {
			s.selectByValue(value);
		}else if(option.equals("text")) {
			s.selectByVisibleText(value);
		}else if(option.equals("index")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}
	}
	
	public void mouseHover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public void dragAndDrop(WebElement src, WebElement des) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}
	
	//Implicit wait
	//Explicit wait
	//Javascript executor - scroll, scrollIntoView, click, alternate for sendkeys
	
	
	
//	public void mouseHover(WebElement element) {
//		Actions a = new Actions(driver);
//		a.moveToElement(element).perform();
//	}
	
	
	public void switchToFrameByNameOrID(String IdOrName) {
		driver.switchTo().frame(IdOrName);
	}
	
	public void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}
	
	public void switchToFrameByElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public void handlingAlert(String condition) {
		Alert alert = driver.switchTo().alert();
		if(condition.equals("accept")) {
			alert.accept();
		}else if (condition.equals("dismiss")) {
			alert.dismiss();
		}
	}
	
	public void handlingWindow(int index) {
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> window_list = new ArrayList<>(windowHandles);
		
		driver.switchTo().window(window_list.get(index));
	}
	
	public void handlingWindowUsingTitle(String title) {
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String window : windowHandles) {
			driver.switchTo().window(window);
			if(driver.getTitle().equals(title)) {
				break;
			}
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
