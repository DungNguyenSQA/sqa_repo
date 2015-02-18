package junitTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

	@RunWith(Suite.class)
	@SuiteClasses(value = { LenghtTextTest.class,TextMessageTest.class})
	public class TestSuite_Annotation {	
	}
