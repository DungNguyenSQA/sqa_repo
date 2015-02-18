package junitTests;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

//import static_example.Calculator;

public class CalculatorTest{
	
	@Test	
	public void testAdd(){
//		int result = Calculator.add(2, 2);
		int result = Calculator.sum(2, 2);
		//actual result = 4, expected result is from "result" variable
		Assert.assertEquals(4,result);			
	}	

	@Test	
	public void testMultiply(){
		System.out.println("inside testMultiply");
		Assert.assertEquals(Calculator.multiply(3, 3), 9);		
	}
	
	@Test
	public void testSubtract(){
		Assert.assertEquals(Calculator.subtract(5, 2), 3);
	}

	@Ignore
	@Test	
	public void testDivide(){
		//assertEquals(double actual, double expected, double delta).
		//If given any delta then it calculates the difference of 
		//expected - actual and then compares the results if they 
		//fall within the delta limit
//		System.out.println(Calculator.divide(5.0f, 2).intValue());
		System.out.println(Calculator.divide(5.0f, 2));
		
		Float result = Calculator.divide(5,2);
		int intResult = result.intValue();
		
		//Assert.assertEquals("Expected,"Acutal");
		//Assert.assertEquals("Expected,"Acutal","Delta");
//		Assert.assertEquals(Calculator.divide(5, 2).doubleValue(), 2.5,0);
		Assert.assertEquals(Calculator.divide(5, 2), 2.5,0);
		//Assert.fail();
	}

	@Test(expected = ArithmeticException.class)
	public void divisionWithException() {		
		int i = 1/0;			
	}
//
	@Test(timeout = 1000)
	//timeout tests are usually done to test the performance.
	public void infinity() {  
		//while (true);
		//logic to test the performance
	}
//	
//	@Test
//	public void testFail(){		
//		//Assert.assertNull(calc);
//		Assert.assertNotNull(calc);
//		Assert.assertTrue(calc.add(3,3)==6);
//	}
}
