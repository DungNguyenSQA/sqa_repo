package testNg;

import homeExercise.Exe26HighNumberInArray;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Exe27TestNGHighestNumberTest {

	/*	 
	 *	• Write a program, which takes an array of int 
	 *	and return the highest number from that 
	 *	array. 
	 *	• TestNg Test Cases for above program. 
	 *	• Run the TestNg Test case for above program. 
	*/	
	
	@Test
	public void testNgHighestNumber(){
		System.out.println("Inside testNgHighestNumber");
		Assert.assertEquals(6,Exe26HighNumberInArray.highestNumber(new int[]{1,3,2,4,6,5,0}));		
		
	}
}
