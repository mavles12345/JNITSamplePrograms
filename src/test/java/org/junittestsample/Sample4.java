package org.junittestsample;

import static org.junit.Assert.assertTrue;

import org.basesample.UtilityClass;
import org.junit.Test;

import junit.framework.Assert;

public class Sample4 extends UtilityClass {

	@Test
	public void tc7() {
		System.out.println("111");

	}
	@Test
	public void tc8() {
		System.out.println("222");

	}
	
	@Test
	public void tc9() {
		
		launchBrowser();
		
		
		
        driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		
			Assert.assertTrue("check title of page:", false);
	System.out.println("333");

	}

	
}
