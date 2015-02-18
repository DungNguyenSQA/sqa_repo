package testNg;

import homeExercise.Exe26HighNumberInArray;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestExer27HighNumberTest {
	/*  Exercise 27: TestNg simple: 
	 *   • Write a program, which takes an array of int 
	 *   and return the highest number from that 
	 *   array. 
	 *   • TestNg Test Cases for above program. 
	 *   • Run the JUnit Test case for above program. 
	 */ 

	@Test 
	public void testHighestNumber(){
		System.out.println("Inside testHighestNumber");
		Assert.assertEquals(6,Exe26HighNumberInArray.highestNumber(new int[]{1,3,2,4,6,5,0}));  
	}
}
