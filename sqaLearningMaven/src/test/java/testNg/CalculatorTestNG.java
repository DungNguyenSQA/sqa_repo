package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

import classExercise.Calculator;

public class CalculatorTestNG {

	@Test	
	public void testAdd(){
		System.out.println("inside testAdd");
		int result = Calculator.sum(2, 2);
		Assert.assertEquals(4,result);			
	}	

	@Test	
	public void testMultiply(){
		System.out.println("inside testMultiply");
		Assert.assertEquals(Calculator.multiply(3, 3), 9);		
	}
	
	@Test
	public void testSubtract(){
		System.out.println("inside testSubtract");
		Assert.assertEquals(Calculator.subtract(5, 2), 3);
	}
}
