package org.junittestsample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({sample2.class, Sample3.class, Sample4.class})
public class RunnerClass {

}
