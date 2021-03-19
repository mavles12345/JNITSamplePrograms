package org.junittestsample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
	@SuiteClasses({ClassA.class, ClassB.class, ClassC.class})
	
	public class Runner {	

}
