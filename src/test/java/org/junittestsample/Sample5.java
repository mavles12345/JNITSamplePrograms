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

public class Sample5 extends UtilityClass {

	@BeforeClass
	public static void browser() {
		launchBrowser();

	}

	@Before
	public void starts() {
		loadUrl("https://www.facebook.com/");
		Date d = new Date();
		System.out.println(d);

	}

	@Test
	public void tc1() {
		
		String title=driver.getTitle();
		
		Assert.assertTrue("check title", title.equals("facebook"));

		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("jackmavles");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("selvamidiotismine");
		
		String attribute=txtUser.getAttribute("value");
		
		Assert.assertEquals("check attribute value:", "jackmavles", attribute);

		WebElement txtLogin = driver.findElement(By.name("login"));
		txtclick(txtLogin);

	}

	@Ignore
	@Test
	public void tc2() {

		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("selvam");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("12345");

		WebElement txtLogin = driver.findElement(By.name("login"));
		txtclick(txtLogin);

	}

	@After
	public void end() {

		Date d = new Date();
		System.out.println("d");

	}

	@AfterClass

	public static void quitBrowser() {

		// browserQuit();

	}
}
