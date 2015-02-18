package testNg;

import org.testng.TestNG;
import org.testng.annotations.Test;

import webdriver.NavigateAssert;
import webdriver.SearchOnChromeTest;


public class TestNGSuite {
		@Test
		public void testTestNGProgramatically(){
		TestNG  testng = new TestNG();
		testng.setTestClasses(new Class[] {NavigateAssert.class, SearchOnChromeTest.class});
		testng.run(); 
		}
}
