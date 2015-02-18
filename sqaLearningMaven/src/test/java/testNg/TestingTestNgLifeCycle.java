package testNg;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestingTestNgLifeCycle {
	Logger log = Logger.getLogger(TestingTestNgLifeCycle.class);
	// test case 1
	@Test
	public void testCase1() {
		log.info("in test case 1");
		System.out.println("in test case 1");
	}

	// test case 2
	@Test
	public void Case2() {
		log.info("in test case 2");
		System.out.println("in test case 2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("in beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("in afterMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("in beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("in afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("in beforeTest 1");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("in afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("in beforeSuite");
		//implement the logic that should get executed before any of your tests are triggered.		
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("in afterSuite");
	}
	
	@BeforeGroups("functest")
	public void beforeGroups() {
		System.out.println("in beforeGroups");
		//implement the logic that should get executed before any of your tests are triggered.		
	}

	@AfterGroups("functest")
	public void afterGroups() {
		System.out.println("in afterGroups");
	}
}
