package com.testrunner;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class rough {
	
	
	public static WebDriver driver;
	
	public void name() {

		driver = new ChromeDriver();
		driver.get("test");
		
		List<WebElement> search = driver.findElements(null);
	
		
		//WebDriverWait wait = new WebDriverWait(driver, 1);
		
		for (WebElement webElement : search) {
			
			
		}
		
	
		
	}
	public static void main(String[] args) {
		WebDriverWait wait = new WebDriverWait(driver, 1);

	}
	


}
