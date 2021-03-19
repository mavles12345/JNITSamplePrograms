package org.junittestsample;

import org.junit.Ignore;
import org.junit.Test;

public class Sample3 {

	@Test
	public void tc4() {
		System.out.println("11");

	}
	@Ignore
	@Test
	public void tc5() {
		System.out.println("22");

	}
	
	@Test
	public void tc6() {
	System.out.println("33");

	}

	
}
