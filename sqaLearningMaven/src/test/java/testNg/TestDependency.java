package testNg;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import basicLearning.MessageUtil;

public class TestDependency {
	Logger log = Logger.getLogger(TestDependency.class);
	String message = "John";
	MessageUtil messageUtil = new MessageUtil(message);

//	@Test
//	public void testPrintMessage() {
//		System.out.println("Inside testPrintMessage()");
//		message = "John";
//		Assert.assertEquals(message, messageUtil.printMessage());
//	}

	@Test(dependsOnMethods = { "initEnvironmentTest" }, alwaysRun=false)
	public void testSalutationMessage() {
		log.info("Inside testSalutationMessage()");
		message = "Welcome " + "John";
		Assert.assertEquals(message, messageUtil.salutationMessage());
	}

	@Test
	public void initEnvironmentTest() {
		log.info("This is initEnvironmentTest");
		//Assert.fail();
		//same as Assert.assertEquals(2, 3);
	}
	
//	@Test
//	public void whyAssertFail(){
//		try{
//			if(1 == 1){
//				throw new Exception("test exception, flow should continue");
//			}
//		}catch(Exception e){
//			e.printStackTrace();
//			Assert.fail();
//		}
//	}
}
