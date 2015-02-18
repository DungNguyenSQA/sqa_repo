package testNg;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import basicLearning.MessageUtil;

public class GroupTestExample {
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	Logger log = Logger.getLogger(GroupTestExample.class);

	@Test(groups = {"functest", "checkintest"})
	public void testPrintMessage() {
		//System.out.println("Part of both functest and checkintest");
		log.info("Part of both functest and checkintest");
		message = "Robert";
		Assert.assertEquals(message, messageUtil.printMessage());
	}

	@Test(groups = {"checkintest"})
	public void testSalutationMessage() {
		System.out.println("Part of checkintest");
		message = "Welcome Robert";
		log.info("Part of checkintest");
		Assert.assertEquals(message, messageUtil.salutationMessage());
	}

	@Test(groups = { "functest"})
	public void testingExitMessage() {
		System.out.println("Part of functest group");
		log.info("Part of functest group");
		message = "bye bye Robert";
		Assert.assertEquals(message, messageUtil.exitMessage());
	}
	
	@Test()
	public void test1(){
		log.info("This is in test1");
	}
}
