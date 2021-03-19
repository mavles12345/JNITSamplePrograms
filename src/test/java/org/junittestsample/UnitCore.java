package org.junittestsample;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class UnitCore {
	
	@Test
	public void tc1() {
		
		Result runClasses = JUnitCore.runClasses(sample2.class,Sample3.class,Sample4.class);
		
		System.out.println("Failure Count: "+ runClasses.getFailureCount());
		System.out.println("Ignore count: "+runClasses.getIgnoreCount());
		System.out.println("Run Count: "+runClasses.getRunCount());
		System.out.println("Run Time: "+runClasses.getRunTime());
		System.out.println("failures");
		
		List<Failure> failure=runClasses.getFailures();
		
		for (Failure failures : failure) {
			System.out.println(failures);
			
		}
	

}
}