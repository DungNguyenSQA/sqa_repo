package testNg;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import static_example.Calculator;
import static org.testng.Assert.assertEquals;

@Test(groups={ "functest"})
public class TestNGSimpleTest {
	Logger log = Logger.getLogger(TestNGSimpleTest.class);
	static int j=0;

	@Test (priority=1)
	public void testMsg() {
		String str = "TestNG is working fine";
		log.info("TestNG simple test");		
		assertEquals("TestNG is working fine", str);
	}
//
//	//This test will be ignored
	@Test (enabled = false, priority=2)
	public void testCalc() {
		Calculator calc = new Calculator();				
		assertEquals(calc.add(2, 2), 4);
	}	
//
//	//This test expects the NullPointerException to be thrown
	@Test(expectedExceptions = ArithmeticException.class, priority=3)
	public void testArithmaticException() {
		int div = 1/0;		
	}
//
//	//This test will run 10 times and if it takes more than 100 ms then it will fail
	@Test(invocationCount=10, invocationTimeOut=100, priority=4)
	public void testInvocationTest(){		
		log.info("in invocation");
		assertEquals(1, 1);
	}

	//This test will run 10 times and if less than 9 test cases fails then it will fail 
	@Test(invocationCount=10, successPercentage=100, priority=5)
	public void testPercentageTest(){		
		j++;
		if(j==2){
			Assert.fail("Loop "+j+" failed");
		}		
	}
}
