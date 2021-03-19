package org.basesample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityClass {
	
	public static WebDriver driver;

	public static WebDriver launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mselva\\Oxygen eclipse-workspace\\SampleProgram\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
		
	}
	
	public static void loadUrl(String url) {
	
	driver.get(url);

	}
	
	public static void fill(WebElement element, String userName) {
		
		element.sendKeys(userName);
	
	}
	
	public static void txtclick(WebElement element) {
		element.click();

	}
	
	public static void browserQuit() {
	driver.quit();	

	}
	
}
