package testNg;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Annotations{
	
	@BeforeSuite
	public void runBeforeSuite() {
		System.out.println("@BeforeSuite");
	}
	
	@BeforeClass
	public void runBeforeClass() {
		System.out.println("@BeforeClass");
	}
	
	@BeforeGroups(groups="groupTest")
	public void runBeforeGroups() {
		System.out.println("@BeforeGroups");
	}
	
	@BeforeMethod
	public void runBeforeMethod() {
		System.out.println("@BeforeMethod");
	}
	
	@Test(dependsOnMethods = "runTestMethod")
	public void runTestMethodWithDependencyOnMethod(){
		System.out.println("Test with dependency");
	}
	
	@Test(groups= {"groupTest1"} , priority = 1)
	public void runTestMethod(){
		System.out.println("@Test(groups= {\"groupTest\"} ) with priority 1");
	}
	
	@Test(groups= {"groupTest"}, priority = 0 )
	public void runTestMethodWithHighestPriority(){
		System.out.println("@Test(groups= {\"groupTest\"} ) with priority 0");
	}
	
	@Test(dependsOnGroups= {"groupTest"}, priority = 2 )
	public void runDependingMethod(){
		System.out.println("@Test(dependsOnGroups= {\"groupTest\"}) with priority 2");
	}
	
	@AfterMethod
	public void runAfterMethod() {
		System.out.println("@AfterMethod");
	}
	
	@AfterGroups(groups="groupTest")
	public void runAfterGroups() {
		System.out.println("@AfterGroups");
	}
	
	@AfterClass
	public void runAfterClass() {
		System.out.println("@AfterClass");
	}
	
	@AfterSuite
	public void runAfterSuite() {
		System.out.println("@AfterSuite");
	}
}
