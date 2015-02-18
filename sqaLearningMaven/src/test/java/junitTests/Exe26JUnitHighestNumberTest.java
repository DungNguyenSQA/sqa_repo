package junitTests;

import org.junit.Assert;
import org.junit.Test;

import homeExercise.Exe26HighNumberInArray;

public class Exe26JUnitHighestNumberTest {

	/*		Exercise 26: JUnit simple: 
	 *			• Write a program, which takes an array of int 
	 *			and return the highest number from that 
	 *			array. 
	 *			• JUnit Test Cases for above program. 
	 *			• Run the JUnit Test case for above program. 
	*/	

	@Test	
	public void testHighestNumber(){
		System.out.println("Inside testHighestNumber");
		Assert.assertEquals(6,Exe26HighNumberInArray.highestNumber(new int[]{1,3,2,4,6,5,0}));		
	}
	
}
