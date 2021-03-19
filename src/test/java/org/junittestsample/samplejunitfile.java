package org.junittestsample;

import java.util.Date;

import org.basesample.UtilityClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class samplejunitfile extends UtilityClass {

	@BeforeClass
	
	public static void tc1() {
		
		launchBrowser();
	}
	
	//@AfterClass
	
	public static void tc2() {
	browserQuit();

	}
	
	@Before
	
	public void tc3() {
	Date startTime=new Date();
    System.out.println(startTime);

	}
	
	@After
	public void tc4() {
	Date endTime=new Date();
	System.out.println(endTime);

	}
	//login with valid credential
	@Ignore
	@Test
	public void tc5() {
	driver.get("https://www.facebook.com/");
	WebElement txtUsername=driver.findElement(By.id("email"));
	fill(txtUsername, "jackmavles@gmail.com");
   
	WebElement txtPass=driver.findElement(By.id("pass"));
	fill(txtPass, "selvamidiotismine");

	WebElement txtLogin=driver.findElement(By.id("login"));
	txtclick(txtLogin);
	
	}
	//login with invalid credential
	
	@Test
	public void tc6() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		
		Assert.assertTrue("check the login page", title.contains(title));
		
		WebElement txtUsername=driver.findElement(By.id("email"));
		fill(txtUsername, "jack");
		
		String attribute=txtUsername.getAttribute("value");
		
		Assert.assertEquals("check the given username", "jack", attribute);
		
		WebElement txtPass=driver.findElement(By.id("pass"));
		fill(txtPass, "54321");

		WebElement txtLogin=driver.findElement(By.id("login"));
		txtclick(txtLogin);
		
		Thread.sleep(5000);
		
		String url=driver.getCurrentUrl();
		
		Assert.assertTrue("check the url", url.contains("privacy"));

	}
	
}
