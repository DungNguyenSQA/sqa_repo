package testNg;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

//import util.MessageUtil;

public class TestMessage1 {
	Logger log = Logger.getLogger(TestMessage1.class);
	String message = "Hello";
  //  MessageUtil messageUtil = new MessageUtil(message);

    @Test(groups = { "functest"})
    public void testPrintMessage() {
        log.info("Inside testPrintMessage()");
	Assert.assertEquals(1,1);
    }
}
