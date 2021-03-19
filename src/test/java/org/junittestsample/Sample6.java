package org.junittestsample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample6 {

	@BeforeClass
	public static void browser() {

		System.out.println("launchBrowser");

	}

	@Before
	public void starts() {

		System.out.println("start time");

	}

	@Test
	public void tc1() {

		System.out.println("Hi coming");

	}

	@Test
	public void tc2() {

		System.out.println("Hi going");
	}

	@After
	public void end() {

		System.out.println("end time");

	}

	@AfterClass

	public static void quitBrowser() {

		System.out.println("Quoite Brower");

	}

}
