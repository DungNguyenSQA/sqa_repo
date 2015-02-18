package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testNgAnnotations {

	@Test(priority=0)
	public void test1() {
		System.out.println("in test 1, priority 0");
	}
	
	@Test(priority=3)
	public void test2() {
		System.out.println("in test 2, priority 3");
	}
	@Test(priority=2)
	public void test3() {
		System.out.println("in test 3, priority 2");
	}

	@BeforeClass
	public void beforeClass(){
		System.out.println("in @beforeClass");
	}

	@AfterClass
	public void afterClass(){
		System.out.println("in @afterClass");
	}
	
	@BeforeMethod
	public void beforMethod(){
		System.out.println("in @beforMethod");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("in @afterMethod");
	}
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("in @beforeSuite");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("in @afterSuite");
	}
}
